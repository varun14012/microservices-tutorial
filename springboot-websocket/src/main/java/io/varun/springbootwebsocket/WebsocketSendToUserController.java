package io.varun.springbootwebsocket;

import org.springframework.stereotype.Controller;

@Controller
public class WebsocketSendToUserController {

//	private Json gson = new Gson();
//	
//	ObjectMapper Obj = new ObjectMapper();
//
//	@MessageMapping("/message")
//	@SendToUser("/queue/reply")
//	public String processMessageFromClient(@Payload String message, Principal principal) throws Exception {
//		return gson.fromJson(message, Map.class).get("name").toString();
//	}
//
//	@MessageExceptionHandler
//	@SendToUser("/queue/errors")
//	public String handleException(Throwable exception) {
//		return exception.getMessage();
//	}
}