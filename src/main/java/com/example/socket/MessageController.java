package com.example.socket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {
//	@MessageMapping("/chat")
//	@SendTo("/topic/messages")
//	public MessageDTO send(MessageDTO message) throws Exception {
//		String time = new SimpleDateFormat("HH:mm").format(new Date());
//		return new MessageDTO(message.getFrom(), message.getTo(), time);
//	}

//	@MessageMapping("/news")
//	public void broadcastNews(@Payload String message) {
//		this.simpMessagingTemplate.convertAndSend("/topic/news", message);
//	}

	@MessageMapping("/ws")
	@SendTo("/topic/news")
	public MessageDTO broadcastNews(@Payload MessageDTO message) {
		message.setContent("SERVER: got it");
		return message;
	}
}

