package io.varun.springbootwebsocket;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {
	// https://spring.io/guides/gs/messaging-stomp-websocket/

	@MessageMapping("/chat")
	@SendTo("/topic/messages")
	public OutputMessage send(final Message message) throws Exception {

		final String time = new SimpleDateFormat("HH:mm").format(new Date());
		return new OutputMessage(message.getFrom(), message.getText(), time);
	}

}