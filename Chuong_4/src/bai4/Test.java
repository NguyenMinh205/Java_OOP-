package bai4;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws StringTooLongException{
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("Nhap chuoi ki tu (Khong vuot qua 30 ki tu): ");
			String chuoi = input.nextLine();
			Test.checkLength(chuoi);
			System.out.println("Chuoi da nhap la: " + chuoi);
		} catch (StringTooLongException s) {
			System.out.println(s.getMessage());
		}finally {
			System.out.println("Done");
		}
		
	}
	
	public static void checkLength(String chuoi) throws StringTooLongException {
		if (chuoi.length() > 30) {
			throw new StringTooLongException("Nhap qua so luong ki tu.");
		}
	}
}
