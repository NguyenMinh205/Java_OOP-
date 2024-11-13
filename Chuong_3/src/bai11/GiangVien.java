package bai11;

import java.util.Scanner;

public abstract class GiangVien {
	//Variable
	protected String ten;
	protected String diaChi;
	protected String loaiGV;
	
	//Constructors
	public GiangVien() {
		
	}
	
	public GiangVien (String ten, String diaChi, String loaiGV) {
		this.ten = ten;
		this.diaChi = diaChi;
		this.loaiGV = loaiGV;
	}

	//Getter and Setter
	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getLoaiGV() {
		return loaiGV;
	}

	public void setLoaiGV(String loaiGV) {
		this.loaiGV = loaiGV;
	}

	//Methods
	public void inputData (String loaiGV) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap ten: ");
		this.ten = input.nextLine();
		System.out.print("Nhap dia chi: ");
		this.diaChi = input.nextLine();
		this.loaiGV = loaiGV;
	}
	
	public abstract double tinhLuong();
	
	public String toString () {
		return "Ten: " + this.ten + "\nDia chi: " + this.diaChi + "\nLoai giang vien: " + this.loaiGV;
	}
}
