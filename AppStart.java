import java.lang.*; // �̰��� ���� import�� �������ʾƵ� �ڵ������� ��� �ڹ����Ͽ� ���ִ�.
					// �� �����Ǿ��ִ�.
import my.lang.City;
import my.lang.Subject;

public class AppStart {
	public static void main(String[] args) {
		City c = City.SEOUL;
		City d = City.JEJU;
		int num = Subject.KOR;
		
		System.out.println(c); // SEOUL ���
		System.out.println(c.compareTo(City.DAEGU));
		System.out.println(d.getInstance()); // SEOUL ���
		System.out.println(num); // 1 ���
	}
}
