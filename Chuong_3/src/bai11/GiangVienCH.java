package bai11;

import java.util.Scanner;

public class GiangVienCH extends GiangVien{
	//Variables
	protected double luongCB;
	protected double heSoLuong;
	protected int thamNien;
	
	//Constructors
	public GiangVienCH () {
		
	}

	public GiangVienCH(double luongCB, double heSoLuong, int thamNien, String ten, String diaChi, String loaiGV) {
		super(ten, diaChi, loaiGV);
		this.luongCB = luongCB;
		this.heSoLuong = heSoLuong;
		this.thamNien = thamNien;
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

	public void setHesoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public int getThamNien() {
		return thamNien;
	}

	public void setThamNien(int thamNien) {
		this.thamNien = thamNien;
	}

	//Methods
	public void inputData () {
		super.inputData("Giang vien co huu");
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap luong co ban cua giang vien: ");
		this.luongCB = input.nextDouble();
		System.out.print("Nhap he so luong: ");
		this.heSoLuong = input.nextDouble();
		System.out.print("Nhap tham nien cua giang vien: ");
		this.thamNien = input.nextInt();
	}
	
	@Override
	public double tinhLuong() {
		double phuCap = 0;
		if (this.thamNien < 5) {
			phuCap = 0;
		}
		else {
			phuCap = thamNien * this.luongCB;
		}
		return (luongCB * heSoLuong + phuCap);
	}
	
	public String toString () {
		return super.toString() + "\nLuong thang: " + this.tinhLuong();
	}
}
