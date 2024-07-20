package day5_Thuchanh2;


public class Application {
	static double luongCoBan = 10000000;
	static double loai1 = 0.2;
	static double loai2 = 0.4;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tinhluong luong = new Tinhluong();
	
		System.out.println("Luong nhu sau: "+luong.tinhLuong(luongCoBan, 1.5));
		System.out.println("Luong theo nam: "+luong.tinhLuong(luongCoBan, 1.5, 3));
		System.out.println("Luong Chuyen khoa: " + luong.tinhLuong(luongCoBan, 1.5, 5, loai1));
		System.out.println("Luong Da khoa: " + luong.tinhLuong(luongCoBan, 1.5, 5, loai2));

	}

}
