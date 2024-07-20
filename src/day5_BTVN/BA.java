package day5_BTVN;

public class BA extends Employee {
	private int gioCall;
	private String PhanTichDuLieu;

	public int getGioCall() {
		return gioCall;
	}
	public void setGioCall(int gioCall) {
		this.gioCall = gioCall;
	}

	public String getPhanTichDuLieu() {
		return PhanTichDuLieu;
	}
	public void setPhanTichDuLieu(String phanTichDuLieu) {
		PhanTichDuLieu = phanTichDuLieu;
	}

	@Override
	public void nhap() {
		super.nhap();
		System.out.println("So gio BA call voi khach: ");
		gioCall = scanner.nextInt();
	}
	
	@Override
	public double tinhLuong() {
		luong = this.luongCoBan + this.gioCall*500000;
		return this.luong;
	}
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("So gio call voi khach hang: " +this.gioCall);
		System.out.println("Tong luong: " +this.luong);
	}

}
