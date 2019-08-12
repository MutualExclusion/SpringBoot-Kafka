package cn.solarcat.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaConfiguration {

	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;

	// 发送消息方法
	public void send(String body) {
		kafkaTemplate.send("solar", body);
	}

}
