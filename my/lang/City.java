package my.lang;

public enum City {
	SEOUL(0),DAEJEON(105),KWANGJU(200),DAEGU(450),JEJU(600);
	private int km;  
	
	private City(int km) {
		this.km = km;
	}
	
	public int getInstance() {
		return km;
	}	
}