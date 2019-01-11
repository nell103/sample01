package chap06;


public class Client2 {
	
	private String host;
	
	public void setHost(String host){
		this.host = host;
		System.out.println("client2.setHost() 실행");
	}
	
	
	public void connect() throws Exception {
		System.out.println("client2.connectt() 실행");
	}
	
	public void send() {
		System.out.println("client2.send() to " + host);
	}
	
	
	public void close() throws Exception {
		System.out.println("client2.close() 실행");
	}

}
