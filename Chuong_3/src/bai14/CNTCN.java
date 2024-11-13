package bai14;

import java.util.Scanner;

public class CNTCN extends CongNhan{
	//Variables 
	protected double luongCB;
	protected double heSoLuong;
	protected int ngayCong;
	
	//Constructors
	public CNTCN () {
		super();
	}

	public CNTCN(double luongCB, double heSoLuong, int ngayCong, String hoTen, String diaChi, String loaiCN, String ngaySinh) {
		super(hoTen, diaChi, loaiCN, ngaySinh);
		this.luongCB = luongCB;
		this.heSoLuong = heSoLuong;
		this.ngayCong = ngayCong;
	}

	//Getter and Setter
	public double getLuongCB() {
		return luongCB;
	}

	public void setLuongCB(double luongCB) {
		this.luongCB = luongCB;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public int getNgayCong() {
		return ngayCong;
	}

	public void setNgayCong(int ngayCong) {
		this.ngayCong = ngayCong;
	}

	//Methods
	public void inputData () {
		super.inputData("Cong nhan tinh cong nhat");
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap luong co ban cua cong nhan: ");
		this.luongCB = input.nextDouble();
		System.out.print("Nhap he so luong cua cong nhan: ");
		this.heSoLuong = input.nextDouble();
		System.out.print("Nhap so ngay cong cua cong nhan: ");
		this.ngayCong = input.nextInt();
	}
	@Override
	public double tinhLuong() {
		double thuong;
		if (ngayCong < 20) {
			thuong = 0;
		}
		else {
			thuong = luongCB * 1.2;
		}
		return (luongCB * heSoLuong + thuong);
	}
	
	public String toString () {
		return super.toString() + "\nLuong thang: " + this.tinhLuong();
	}
}
