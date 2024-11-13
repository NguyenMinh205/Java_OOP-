package bai11;

import java.util.Scanner;

public class GiangVienTG extends GiangVien{
	//Variables
	protected int soTietDay;
	protected double donGia;
	
	//Constructors
	public GiangVienTG () {
		
	}

	public GiangVienTG(int soTietDay, double donGia, String ten, String diaChi, String loaiGV) {
		super(ten, diaChi, loaiGV);
		this.soTietDay = soTietDay;
		this.donGia = donGia;
	}

	//Getter and Setter
	public int getSoTietDay() {
		return soTietDay;
	}

	public void setSoTietDay(int soTietDay) {
		this.soTietDay = soTietDay;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	//Methods
	public void inputData () {
		super.inputData("Giang vien thinh giang: ");
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap so tiet day cua giang vien: ");
		this.soTietDay = input.nextInt();
		System.out.print("Nhap don gia mot tiet: ");
		this.donGia = input.nextDouble();
	}
	
	@Override
	public double tinhLuong() {
		double thuNhap = 0.15 * (soTietDay * donGia);
		return ((soTietDay * donGia) - thuNhap);
	}
	
	public String toString () {
		return super.toString() + "\nLuong thang: " + this.tinhLuong();
	}
}
