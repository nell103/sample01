package chap06;


public class Client2 {
	
	private String host;
	
	public void setHost(String host){
		this.host = host;
		System.out.println("client2.setHost() ����");
	}
	
	
	public void connect() throws Exception {
		System.out.println("client2.connectt() ����");
	}
	
	public void send() {
		System.out.println("client2.send() to " + host);
	}
	
	
	public void close() throws Exception {
		System.out.println("client2.close() ����");
	}

}
