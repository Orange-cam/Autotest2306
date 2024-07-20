package day5_Inherritance;

public class Sinhvien extends Nguoi {

	private String maSV;
	private String soTinChi;
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getSoTinChi() {
		return soTinChi;
	}
	public void setSoTinChi(String soTinChi) {
		this.soTinChi = soTinChi;
	}
	
@Override
public void diChoi()
{
	System.out.println("Lam xong bai moi di choi");
}

public void diHoc()
{
	System.out.println("Di hoc 5 ngay deu dan");
}
}
