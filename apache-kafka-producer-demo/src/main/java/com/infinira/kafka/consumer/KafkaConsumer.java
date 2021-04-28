package com.infinira.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
	
	//Consume the messages from topics, so we will pass topic in annotation
	@KafkaListener(topics="NewTopic", groupId = "group_id")
	public void consume(String messages) {
		System.out.println("Messages:"+ messages);
	}

}
