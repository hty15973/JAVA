
public class AppStart {
	public static void main(String [] args)
	{
		Manager manager = new Manager(3,"��û��");
		manager.addStudent(new Student("�̼���",100));
		manager.addStudent(new Student("����",98));
		manager.addStudent(new Student("������",95));
		manager.addStudent(new Student("���̽�",70));
		
		Student find = manager.find("���̽�");
		if (find  != null) {
			System.out.println(find);
		}
		else {
			System.out.println("�˻��� �����Ͽ����ϴ�");
		}
		
		manager.showList();
	}

	1
}