package cn.solarcat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.solarcat.configuration.KafkaConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootKafkaApplicationTests {
	@Autowired
	private KafkaConfiguration KafkaTemplate;

	@Test
	public void contextLoads() {
		KafkaTemplate.send("我是阳光猫");
	}

}
