package com.it.pro;

public class AppService {

	@Test(target = true)
	public void hello() {
		System.out.println("hello 你好");
	}
	
	
	@Test(target = true)
	public void helloToUSA() {
		System.out.println("你好 THE U.S.A");
	}
	
	@Test
	public void helloToEng() {
		System.out.println("hello english");
	}
}
