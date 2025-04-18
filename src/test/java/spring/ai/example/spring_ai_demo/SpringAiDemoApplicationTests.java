package spring.ai.example.spring_ai_demo;

import org.junit.jupiter.api.Test;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringAiDemoApplicationTests {
	@Autowired
	private ChatClient.Builder builder;

	@Test
	void contextLoads() {
		ChatClient chatClient = builder.build();
		String response = chatClient.prompt("用小红书写作的方式描述一下江西省宜春樟树市。").call().content();
		System.out.println(response);
	}

}
