
public class Manager {
	private Student[] students;
	 // public int defaultCount = 10; �̷��� ������ ����������. �̰� ��ü�� ����� ��ü�� ���������� �������� ȣ���� �켱�̱� �����̴�.static �䱸�ȴ�.
	public final static int DEFAULT_COUNT ; // final�� �ٿ������� ����Һ��� ������ �Ǿ������.
	private  String managerName = "ȫ�浿";
	private int currentCount ;
	static {
		DEFAULT_COUNT = 10;
	}
	public Manager()
	{
		this(DEFAULT_COUNT);
	}
	
	public Manager(int count) {
		this(count,"noname");
	}
	public Manager(int count,String managerName)
	{
		students = new Student[count];
		this.managerName = "ȫ�浿";
		currentCount = 0;
		
	}

	public void setStudents(Student[] students) {
		this.students =students;
	}
	public Student[] getStudents() {
		return students;
	}
	
	public String getManagerName() {
		return managerName;
	}
	
	public boolean addStudent(Student student){
		if(currentCount < students.length) {
			students[currentCount] = student;
			currentCount++ ;
			
			return true;
		}
		return false;
	}
	
	public Student find(String name) {
		for (int i  =0; i<currentCount;i++) {
			if(students[i].getName().equals(name)) {
				return students[i];
			}
		}
		return null;
		//��ü�� �����Ҷ� ���� ���������� null�� �־�д�
	}
	public void showList() {
		for (int i = 0; i <currentCount ; i++)
		{
			System.out.println(students[i]);
		}
	}
}
