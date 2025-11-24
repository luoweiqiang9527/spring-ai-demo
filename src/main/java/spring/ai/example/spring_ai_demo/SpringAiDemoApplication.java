package spring.ai.example.spring_ai_demo;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class SpringAiDemoApplication {
    private ChatClient client ;
    public SpringAiDemoApplication(ChatClient.Builder builder) {
        this.client = builder.build();
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringAiDemoApplication.class, args);
	}

    @GetMapping("/chat")
    public String chat(@RequestParam("prompt") String prompt) {
        return client.prompt(prompt).call().content();
    }



}
