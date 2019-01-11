package chap06;

import org.springframework.context.annotation.Bean;

public class JavaConfig {  // Main2
	
	@Bean
	public Client client() {
		Client client = new Client();
		client.setHost("����");
		return client;
	}
	
	@Bean(initMethod = "connect", destroyMethod = "close")
	public Client2 client2() {
		Client2 client2 = new Client2();
		client2.setHost("����2");
		return client2;
	}

}
