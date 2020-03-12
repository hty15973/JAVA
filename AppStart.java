import java.lang.*; // 이것은 따로 import를 해주지않아도 자동적으로 모든 자바파일에 들어가있다.
					// 즉 생략되어있다.
import my.lang.City;
import my.lang.Subject;

public class AppStart {
	public static void main(String[] args) {
		City c = City.SEOUL;
		City d = City.JEJU;
		int num = Subject.KOR;
		
		System.out.println(c); // SEOUL 출력
		System.out.println(c.compareTo(City.DAEGU));
		System.out.println(d.getInstance()); // SEOUL 출력
		System.out.println(num); // 1 출력
	}
}
