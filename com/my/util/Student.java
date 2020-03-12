package com.my.util;
 // 같은 패키지 내부이기에 import할 필요도 없다.
public class Student {
	Person p = new Person();
	
	public void func() {
		p.name = "심청이";
		p.setName("dd");
	}

}
1
