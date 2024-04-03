package com.green;

import java.time.LocalDateTime;

public class ConstructorTest {

	public static void main(String[] args) {

		Board board = new Board(); 

		//메서드를 만들어 해당 메서드만 호출하면 재사용 가능
		board.display();

		board = new Board(1000);//생성자에 값 넣어주기, 해당 값은 int로 감
		board.display();

		board = new Board(10,"제목","내용","작성자",0,LocalDateTime.now()); //생성자에 값 넣어주기
		board.display();
	}

}
