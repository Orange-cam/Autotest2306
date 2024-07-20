package day5_BTVN;

public class Tester extends Employee {
	private String maDuAn;
	private int namKinhNghiem;
	
	public String getMaDuAn() {
		return maDuAn;
	}

	public void setMaDuAn(String maDuAn) {
		this.maDuAn = maDuAn;
	}

	public int getNamKinhNghiem() {
		return namKinhNghiem;
	}

	public void setNamKinhNghiem(int namKinhNghiem) {
		this.namKinhNghiem = namKinhNghiem;
	}

	@Override
	public void nhap () {
		super.nhap();
		System.out.println("Nhap so nam kinh nghiem: ");
		namKinhNghiem = scanner.nextInt();
	}
	@Override
	public double tinhLuong() {
		this.luong = this.luongCoBan*this.namKinhNghiem;
		return this.luong;
	}
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("Tester phai co chung chi ISTQB");
		System.out.println("Tong luong: "+this.luong);
	}

}
