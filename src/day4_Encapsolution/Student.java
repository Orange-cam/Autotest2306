package day4_Encapsolution;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person student1 = new Person ();
		student1.name = "Nguyen Van A";
		student1.setPhoneNumber ("0992150992");
		System.out.println("Ho va ten: "+student1.name + ", Sdt: "+student1.getPhoneNumber());	
	}

}
