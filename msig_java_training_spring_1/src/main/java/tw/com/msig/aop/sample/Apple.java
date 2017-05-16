package tw.com.msig.aop.sample;

public class Apple {

	public void hi() {
		System.out.println("Hi");
		AppleApp.apple.name();
	}
	
	public void name() {
		System.out.println("Tim");
	}
	
}
