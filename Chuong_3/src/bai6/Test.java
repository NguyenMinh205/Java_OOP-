package bai6;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap so nhan vien part-time: ");
		int n = input.nextInt();
        PartTimeEmployee[] partTimeEmployees = new PartTimeEmployee[n];
        for (int i = 0; i < n; i++) {
            partTimeEmployees[i] = new PartTimeEmployee();
            partTimeEmployees[i].inputData();
        }
        for (int i = 0; i < 2; i++) {
            partTimeEmployees[i].toString();
        }
        input.close();
    }
}
