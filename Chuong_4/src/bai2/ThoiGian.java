package bai2;

import java.util.Scanner;

public class ThoiGian {
	protected int ngay;
	protected int thang;
	protected int nam;

	public ThoiGian() {

	}

	public ThoiGian(int ngay, int thang, int nam) {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}

	public int getNgay() {
		return ngay;
	}

	public void setNgay(int ngay) {
		this.ngay = ngay;
	}

	public int getThang() {
		return thang;
	}

	public void setThang(int thang) {
		this.thang = thang;
	}

	public int getNam() {
		return nam;
	}

	public void setNam(int nam) {
		this.nam = nam;
	}

	public void inputData() throws InvalidDateException {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap ngay: ");
		ngay = input.nextInt();
		if (ngay < 0 || ngay > 31) {
			throw new InvalidDateException("Nhap sai ngay.");
		}
		System.out.print("Nhap thang: ");
		thang = input.nextInt();
		if (thang < 0 || thang > 12) {
			throw new InvalidDateException("Nhap sai thang.");
		}
		System.out.print("Nhap nam: ");
		nam = input.nextInt();
		if (nam < 0) {
			throw new InvalidDateException("Nhap sai nam.");
		}
	}

	public String toString() {
		String s = "Ngay " + ngay + " thang " + thang + " nam " + nam;
		return s;
	}
}
