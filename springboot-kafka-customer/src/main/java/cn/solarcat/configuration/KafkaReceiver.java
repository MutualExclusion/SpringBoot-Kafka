package cn.solarcat.configuration;

import java.util.Optional;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaReceiver {

	@KafkaListener(topics = { "solar" })
	public void listen(ConsumerRecord<?, ?> record) {

		Optional<?> kafkaMessage = Optional.ofNullable(record.value());

		if (kafkaMessage.isPresent()) {
			String str = (String) kafkaMessage.get();
			System.out.println(str);
		}

	}
}
