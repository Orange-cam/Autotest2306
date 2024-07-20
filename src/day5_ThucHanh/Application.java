package day5_ThucHanh;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhChuNhat hinhchunhat1 = new HinhChuNhat();
		hinhchunhat1.setTenHinh("Hinh chu nhat 10 x 25 co dien tich: ");
		hinhchunhat1.chieuDai = 25;
		hinhchunhat1.chieuRong = 10;
		System.out.println(hinhchunhat1.getTenHinh() + hinhchunhat1.tinhDienTich());
		
		HinhTron hinhtron1 = new HinhTron();
		hinhtron1.setTenHinh("Hinh tron ban kinh 5 co dien tich: ");
		hinhtron1.banKinh = 5;
		System.out.println(hinhtron1.getTenHinh()+hinhtron1.tinhDienTich());

	}

}
