package com.my.data;
import com.my.util.Person; // package 가 import 보다 우선적으로 처리된다.

public class Teacher {
	Person p;
	
	public Teacher() {
		p.name = "심청이";
		p.setName("홍길동");
	}


}
1