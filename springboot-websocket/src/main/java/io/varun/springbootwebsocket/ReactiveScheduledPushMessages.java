package io.varun.springbootwebsocket;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

@Service
public class ReactiveScheduledPushMessages implements InitializingBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub

	}

//	private final SimpMessagingTemplate simpMessagingTemplate;
//
//	private final Faker faker;
//
//	public ReactiveScheduledPushMessages(SimpMessagingTemplate simpMessagingTemplate) {
//		this.simpMessagingTemplate = simpMessagingTemplate;
//		this.faker = new Faker();
//	}
//
//	@Override
//    public void afterPropertiesSet() throws Exception {
//        Flux.interval(Duration.ofSeconds(4L))
//            .map((n) -> new OutputMessage(faker.backToTheFuture().character(), faker.backToTheFuture().quote(), 
//                                            new SimpleDateFormat("HH:mm").format(new Date())))
//            .subscribe(message -> simpMessagingTemplate.convertAndSend("/topic/pushmessages", message));
//    }
}