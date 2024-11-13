package bai10;

public class Test {
	public static void main(String[] args) {
		HocVienDH hocVienDH = new HocVienDH();
		HocVienLT hocVienLT = new HocVienLT();

		System.out.println("Nhập thông tin học viên Đồ Họa");
		hocVienDH.inputData();
		System.out.println("\nThông tin học viên Đồ Họa:");
		System.out.println(hocVienDH.toString());

		System.out.println("\nNhập thông tin học viên Lập Trình");
		hocVienLT.inputData();
		System.out.println("\nThông tin học viên Lập Trình:");
		System.out.println(hocVienLT.toString());
	}
}
