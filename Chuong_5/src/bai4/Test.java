package bai4;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		TuDien tuDien = new TuDien();
		System.out.print("Nhap tu muon tra: ");
		String tu = input.nextLine();
		if (tuDien.lookUp(tu) == null) {
			System.out.println("Khong co tu nay trong tu dien.");
		} else {
			System.out.println(tuDien.lookUp(tu));
		}
	}
}
