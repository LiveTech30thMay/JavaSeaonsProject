package jul19th;

public class StudentApp {

	public static void main(String[] args) {
		
		//Student s1=new Student();
		//Marks s1=new Marks();
		Leave s1=new Leave();
		s1.setDetails(1, "John");
		s1.getDetails();
		s1.setMarks(71, 80, 90);
		s1.getMarks();
		s1.setLeaves(5, 10);
		s1.getLeaves();

	}

}
