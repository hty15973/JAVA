package com.my.util;

class Person { // 클래스는 메서드와 비슷하지만 다른점은 public과 default 만 사용이 가능하다.
	public String name; // 앞에 private이든 public 이든 접근제한자가 없으면 이는 디폴트 접근제한자가 붙게되며,
				// 이렇게되면 같은 패키지 내에서만 접근할수 있게된다. 다른 패키지에서는 접근이 막히게 된다.
				// public 이면 어디서든 접근할수가 있고(심지어 외부패키지에서도),private이면  같은 패기지에서도 사용임불가능해진다.
				// 접근제한자 : public,protected,default,private 왼쪽이 젤큰범위 오른쪽이 젤작음
	
	void setName(String name) {  // 메서드도 마찬가지, 디폴트면 같은패키지, public 이면 외부도가능,private 이면 내부만
		this.name =name ; 
	}
}
