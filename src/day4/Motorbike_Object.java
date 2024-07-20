package day4;

public class Motorbike_Object {
	
	static String hangXe;
	static String mauXe;
	static String bienSoXe;
	static String ngayDangKy;
	
	public static String getInformationMotor()
	{
		return("Hang xe la: "+hangXe+", Mau xe: "+ mauXe+", Bien so xe: "+bienSoXe + ",Ngay dang ky: "+ngayDangKy);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motorbike_Object xe1 = new Motorbike_Object();
		xe1.hangXe = "Vision";
		xe1.mauXe = "Xanh";
		xe1.ngayDangKy = "01/12/2022";
		xe1.bienSoXe = "92B1-18895";
		System.out.println(xe1.getInformationMotor());
		
		Motorbike_Object xe2 = new Motorbike_Object();
		xe2.hangXe = "AB";
		xe2.mauXe = "Trang";
		xe2.ngayDangKy = "01/12/2022";
		xe2.bienSoXe = "99V1-18895";
		System.out.println(xe2.getInformationMotor());

	}

}
