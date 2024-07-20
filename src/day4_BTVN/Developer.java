package day4_BTVN;

public class Developer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee dev1 = new Employee ();
		dev1.setEmployeeId ("99A1");
		dev1.setEmployeeName ("Nguyen Van A");
		dev1.getEmployeeSalary("");
		System.out.println("Ma so nhan vien: "+dev1.getEmployeeId());
		System.out.println("Ho va ten: "+dev1.getEmployeeName());
		System.out.println("Luong thang: "+dev1.getEmployeeSalary("4000000"));
		
		System.out.println (" ");
		
		Employee dev2 = new Employee ();
		dev2.setEmployeeId ("100AA");
		dev2.setEmployeeName ("Cam Dang");
		dev2.getEmployeeSalary("");
		System.out.println("Ma so nhan vien: "+dev2.getEmployeeId());
		System.out.println("Ho va ten: "+dev2.getEmployeeName());
		System.out.println("Luong thang: "+dev2.getEmployeeSalary("6000000"));
		}
//Chỉ có thể đọc giá trị của Salary chứ không thể thay đổi giá trị được in ra
}
