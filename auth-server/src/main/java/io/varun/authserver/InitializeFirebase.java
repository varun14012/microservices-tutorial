package io.varun.authserver;

import java.io.FileInputStream;
import java.io.IOException;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

//@Component
public class InitializeFirebase {

//	public static void main(String[] args) {
//		init();
//	}

	public void init() {
		try {
			// Fetch the service account key JSON file contents
			FileInputStream serviceAccount = new FileInputStream("letstryfirebase.json");

			// Initialize the app with a service account, granting admin privileges
			FirebaseOptions options = FirebaseOptions.builder()
					.setCredentials(GoogleCredentials.fromStream(serviceAccount))
					.setDatabaseUrl("https://LetsTryFirebase.firebaseio.com")
					// Or other region, e.g. <databaseName>.europe-west1.firebasedatabase.app
					.build();
			FirebaseApp.initializeApp(options);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// As an admin, the app has access to read and write all data, regardless of
		// Security Rules
		DatabaseReference ref = FirebaseDatabase.getInstance().getReference("restricted_access/secret_document");
		ref.addListenerForSingleValueEvent(new ValueEventListener() {
			@Override
			public void onDataChange(DataSnapshot dataSnapshot) {
				Object document = dataSnapshot.getValue();
				System.out.println(document);
			}

			@Override
			public void onCancelled(DatabaseError error) {
			}
		});
	}

}
