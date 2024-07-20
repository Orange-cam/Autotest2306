package day5_Inherritance;

public class Giaovien extends Nguoi {
	private String maGV;
	private String soNamKN;
	public String getMaGV() {
		return maGV;
	}
	public void setMaGV(String maGV) {
		this.maGV = maGV;
	}
	public String getSoNamKN() {
		return soNamKN;
	}
	public void setSoNamKN(String soNamKN) {
		this.soNamKN = soNamKN;
	}
@Override
public void diChoi()
	{
		System.out.println("Di lam 5 ngay 1 tuan xong di choi");
	}

public void diMuaSam()
	{
		System.out.println("Di mua sam khi nhan luong");
	}
}
