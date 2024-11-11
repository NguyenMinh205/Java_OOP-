package bai9;

public class Test {
	public static void main(String[] args) {
		int tong = 0;
		//Duyệt qua các số chẵn từ 1 đến 100
		for (int i = 1; i <= 100; i+=2) {
			tong += i;
		}
		System.out.print("Tong cac so le tu 1 den 100 la: " + tong);
	}
}
