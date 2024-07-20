package day5_Inherritance;

public abstract class Nguoi {
	private String HovaTen;
	private String NgaySinh;
	public String getHovaTen() {
		return HovaTen;
	}
	public void setHovaTen(String hovaTen) {
		HovaTen = hovaTen;
	}
	public String getNgaySinh() {
		return NgaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		NgaySinh = ngaySinh;
	}
	public abstract void diChoi ();
	{
		System.out.println("Troi dep thi di choi");
	}
}