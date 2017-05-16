package tw.com.msig.aop.sample;

import java.util.Date;

public class Apple2 extends Apple {

	public void hi() {
		System.out.println(new Date());
		super.hi();
		System.out.println("Bye");
	}
	

	public void name() {
		System.out.println(new Date());
		super.name();
		System.out.println("Bye");
	}
	
}
