package bai14;

import java.util.Scanner;

public abstract class CongNhan {
	//Variables
	protected String hoTen;
	protected String diaChi;
	protected String loaiCN;
	protected String ngaySinh;
	
	//Constructors
	public CongNhan () {
		
	}

	public CongNhan(String hoTen, String diaChi, String loaiCN, String ngaySinh) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiCN = loaiCN;
		this.ngaySinh = ngaySinh;
	}

	//Getter and Setter;
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getLoaiCN() {
		return loaiCN;
	}

	public void setLoaiCN(String loaiCN) {
		this.loaiCN = loaiCN;
	}
	
	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	//Methods
	public abstract double tinhLuong ();
	
	public void inputData (String loaiCN) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap ho ten: ");
		this.hoTen = input.nextLine();
		System.out.print("Nhap dia chi: ");
		this.diaChi = input.nextLine();
		this.loaiCN = loaiCN;
		System.out.print("Nhap ngay sinh: ");
		this.ngaySinh = input.nextLine();
	}
	
	public String toString () {
		return "Ho ten: " + this.hoTen + ", dia chi: " + this.diaChi + ", loai cong nhan: " + this.loaiCN + ", ngay sinh: " + this.ngaySinh;
	}
}
