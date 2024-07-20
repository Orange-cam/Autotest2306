package day5_BTVN;

import java.util.Scanner;

public abstract class Employee {
	private String HovaTen;
	private String NgaySinh;
	private String MaID;
	protected double luongCoBan,luong = 0;
	Scanner scanner = new Scanner(System.in);
	
	
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
	public String getMaID() {
		return MaID;
	}
	public void setMaID(String maID) {
		MaID = maID;
	}
	public double getLuongCoBan() {
		return luongCoBan;
	}
	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}
	public double getLuong() {
		return luong;
	}
	public void setLuong(double luong) {
		this.luong = luong;
	}
	public double tinhLuong () {
		return 0;
	}
	
	public void nhap() {
		System.out.println("Nhap Ho va ten: ");
		HovaTen = scanner.nextLine();
		System.out.println("Nhap ngay sinh: ");
		NgaySinh = scanner.nextLine();
		System.out.println("Nhap ma ID: ");
		MaID = scanner.nextLine();
		System.out.println("Nhap luong co ban: ");
		luongCoBan = scanner.nextInt();
	}
	public void xuat() {
		System.out.println("Ho va ten: "+this.HovaTen);
		System.out.println("Ngay sinh: "+this.NgaySinh);
		System.out.println("Ma ID: "+this.MaID);
		System.out.println("Luong co ban: "+this.luongCoBan);
	}
	
	
}