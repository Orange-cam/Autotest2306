package day5_Inherritance;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sinhvien sv1 = new Sinhvien();
		sv1.setHovaTen("Cam Dang");
		sv1.setMaSV("AB");
		sv1.setNgaySinh("01/01/2004");
		sv1.setSoTinChi("20");
		System.out.println("Sinh vien: "+sv1.getHovaTen()+ sv1.getMaSV() + sv1.getNgaySinh() + sv1.getSoTinChi());
		sv1.diChoi();
		sv1.diHoc();
		System.out.println("=======");
		Giaovien gv1 = new Giaovien();
		gv1.setHovaTen("Nguyen Van B");
		gv1.setMaGV("GV001");
		gv1.setNgaySinh("09/09/1990");
		gv1.setSoNamKN("5");
		System.out.println("Giao vien: " + gv1.getHovaTen() + gv1.getMaGV() + gv1.getMaGV());
		gv1.diChoi();
		gv1.diMuaSam();
		

	}

}
