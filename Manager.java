
public class Manager {
	private Student[] students;
	 // public int defaultCount = 10; 이러면 컴파일 오류가난다. 이건 객체의 멤번데 객체의 생성조건은 생성자의 호출이 우선이기 때문이다.static 요구된다.
	public final static int DEFAULT_COUNT ; // final을 붙여버리면 절대불변의 변수가 되어버린다.
	private  String managerName = "홍길동";
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
		this.managerName = "홍길동";
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
		//객체를 지정할때 값을 미정했으면 null을 넣어둔다
	}
	public void showList() {
		for (int i = 0; i <currentCount ; i++)
		{
			System.out.println(students[i]);
		}
	}
}
