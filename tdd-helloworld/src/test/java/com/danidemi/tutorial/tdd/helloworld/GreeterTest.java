package com.danidemi.tutorial.tdd.helloworld;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class GreeterTest {

	@Test
	public void shouldSayHelloToTheWorld() {
		
		Greeter greeter = new Greeter();
		
		String helloMsg = greeter.sayHello();
		String byeMsg = greeter.sayBye();

		assertThat(byeMsg, equalTo("Bye World!"));
		assertThat(helloMsg, equalTo("Hello World!"));
		
	}

}
