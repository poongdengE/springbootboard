package com.springboot.board;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
//import lombok.Setter;

@Getter
@RequiredArgsConstructor	// 해당 속성을 필요로하는 생성자가 롬복에 의해 자동으로 생성된다. (final이 없는 속성은 생성자에 포함되지 않는다.)
//@Setter
public class HelloLombok {
	
	private final String hello;
	private final int lombok;
	
	public static void main(String[] args) {
		HelloLombok helloLombok = new HelloLombok("하이",13);
		System.out.println(helloLombok.getHello());
		System.out.println(helloLombok.getLombok());
	}
	
}
