package bai4;

public class Test {
	public static void main(String[] args) {
		BenhVien benhVien = new BenhVien("ABC", "Ha Noi", "Nguyen Van A");
		BenhNhan benhNhan = new BenhNhan("Ngo", "Ngu", benhVien, "Nguyen Thanh C", 20, 'M');
		System.out.println(benhNhan.toString());
	}
}
