package student_info;

public class Student {
	private String name;
	private String major;
	private String sdNum;
	private double gradeAvg;
	
	public Student() {}
	
	public Student(String name, String major, String sdNum, double gradeAvg) {
		this.name = name;
		this.major = major;
		this.sdNum = sdNum;
		this.gradeAvg = gradeAvg;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getSdNum() {
		return sdNum;
	}
	public void setSdNum(String sdNum) {
		this.sdNum = sdNum;
	}
	public double getGradeAvg() {
		return gradeAvg;
	}
	public void setGradeAvg(double gradeAvg) {
		this.gradeAvg = gradeAvg;
	}

	public void printData() {
		System.out.println("---------------------------");
		System.out.println("이름 : "+name);
		System.out.println("학과 : "+major);
		System.out.println("학번 : "+sdNum);
		System.out.println("학점평균 : "+gradeAvg);
	}
	
	
	
	
	
}
