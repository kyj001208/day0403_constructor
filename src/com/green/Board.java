package com.green;

import java.time.LocalDateTime;

public class Board {

	//인스턴스 필드
	long no;
	String tittle;
	String content;
	String writer;
	int readCount;
	LocalDateTime createdAt;


	public void display() {//출력 메서드
		System.out.println("no = " + no);
		System.out.println("tittle = " + tittle);
		System.out.println("content = " + content);
		System.out.println("writer = " + writer);
		System.out.println("readCount = " + readCount);
		System.out.println("createdAt = " + createdAt);
		System.out.println();
		
	}

	//AllArgsConstructor: 인스턴스필드 모두를 매개변수(인자)로 적용된 생성자
	public Board(int no, String title, String content, String writer, int readCount, LocalDateTime createdAt) {

		this(no, title, content, writer, readCount);
		this.createdAt = createdAt;
	}

	
	public Board(int no, String title, String content, String writer, int readCount) {// 생성자 오버로딩

		this(no,title,content,writer);
		this.readCount=readCount;
	}

	public Board(int no, String title, String content, String writer) {// 생성자 오버로딩

		this.no = no;
		this.tittle = title;
		this.content = content;
		this.writer = writer;

	}

	public Board(int no, String title, String content) {// 생성자 오버로딩

		this.no = no;
		this.tittle = title;
		this.content = content;

	}

	public Board(int no, String title) {// 생성자오버로딩

		this.no = no;
		this.tittle = title;

	}

	public Board(int no) {// 생성자오버로딩

		this.no = no;

	}

	public Board() { //default 생성자 = NoArgs생성자
		
	}

}
