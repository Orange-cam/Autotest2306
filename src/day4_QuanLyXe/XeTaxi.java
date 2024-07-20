package day4_QuanLyXe;

public class XeTaxi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xe taxi1 = new Xe();
		taxi1.setLoaiXe("Toyota");
		taxi1.setTenXe("Vios");
		taxi1.setVanTocMax(200);
		System.out.println(taxi1.getLoaiXe()+"," +taxi1.getTenXe()+"," + taxi1.getVanTocMax());

	}

}
