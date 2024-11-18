package bai2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		String[] MonArr = {
	            "USD;VND;17000",
	            "EUR;USD;1.2",
	            "USD;IDN;15789",
	            "USD;EUR;0.83",
	            "CAD;IDN;16869"
	        };
		
		Exchange exchange = new Exchange();
		
		for (String i : MonArr) {
			String[] parts = i.split(";");
			String code1 = parts[0];
			String code2 = parts[1];
			double rate = Double.parseDouble(parts[2]);
			exchange.addRate(code1, code2, rate);
		}
		
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap ma tien te can chuyen: ");
        String code1 = input.nextLine();
        System.out.print("Nhap ma tien te muon chuyen sang: ");
        String code2 = input.nextLine();
        System.out.print("Nhap so tien muon chuyen doi: ");
        double amount = input.nextDouble();
        
        if (exchange.convert(code1, code2, amount) == -1) {
        	System.out.println("Khong doi duoc (Do khong tim thay ma tien te).");
        } else {
        	System.out.println("Lượng tiền sau khi chuyển đổi: " + exchange.convert(code1, code2, amount));
        }
	}
}
