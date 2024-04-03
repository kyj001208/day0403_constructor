package com.non;

public class FinalTest01 {
	
	
	//final double rate=0; //필드 초기화, 잘 사용하지 않음
	//final 필드는 객체 생성시에 무조건 초기화(사용자 초기화)가 되어야합니다.
	final double rate;
	String account;
	long cif;
	

	//final 필드를 초기화 하는 생성
	//RequiredArgsConstructor: final필드만 매개 변수로 정의된 생성자
	public FinalTest01(double rate) { //final 필드를 초기화하는 생성자
		this.rate=rate; 
	
	}
	public FinalTest01() {
		this.rate=3.14;
		
	}
	
	
}
