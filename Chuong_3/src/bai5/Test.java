package bai5;

public class Test {
	public static void main(String[] args) {
		Truong truong = new Truong("Dai hoc Cong nghiep Ha Noi", "Ha Noi", "Nguyen Van A");
		SinhVien sinhVien = new SinhVien("KTPM04", "KTPM", truong, "Nguyen Thanh C", 20, 'M');
		System.out.println(sinhVien.toString());
	}
}
