package day5_BTVN;

public class Dev extends Employee {
	private String ngonNguCode;
	private String chucDanh;
	
	public String getNgonNguCode() {
		return ngonNguCode;
	}
	public void setNgonNguCode(String ngonNguCode) {
		this.ngonNguCode = ngonNguCode;
	}
	public String getChucDanh() {
		return chucDanh;
	}
	public void setChucDanh(String chucDanh) {
		this.chucDanh = chucDanh;
	}
	
	@Override
	public void nhap() {
		super.nhap();
		System.out.println("Nhap ngon ngu lap trinh chuyen mon: ");
	}
	
	@Override
	public double tinhLuong() {
		luong = this.luongCoBan*5;
		return this.luong;
	}
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("Tong luong: ");
	}
}
