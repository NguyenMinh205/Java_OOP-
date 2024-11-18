package bai3;

import java.util.HashMap;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap so luong chuoi ki tu muon nhap: ");
		int sl = input.nextInt();
		input.nextLine();
		
		String[] mangChuoi = new String[sl];
		HashMap<String, Integer> slKiTu = new HashMap<String, Integer>();
		
		//Nhập chuỗi
		for (int i = 0; i < sl; i++) {
			System.out.println("Nhap chuoi thu " + (i+1));
			mangChuoi[i] = input.nextLine();
		}
		
		//Đếm số lần xuất hiện của các từ, không phân biệt hoa thường (VD: Gạo, gạo là như nhau, đều là từ gạo)
		for (int i = 0; i < sl; i++) {
			String[] mangKiTu = mangChuoi[i].split(" ");
			for (int j = 0; j < mangKiTu.length; j++) {
				String tuThuong = mangKiTu[j].toLowerCase();
				slKiTu.put(tuThuong, slKiTu.getOrDefault(tuThuong, 0) + 1);
//				if (slKiTu.containsKey(mangKiTu[j].toLowerCase())) {
//					slKiTu.put(mangKiTu[j].toLowerCase(), slKiTu.getOrDefault(mangKiTu[j].toLowerCase(), 0) + 1);
//				}
//				else {
//					slKiTu.put(mangKiTu[j], 1);
//				}
			}
		}
		//Hiện số lượng xuất hiện của các từ trong các chuỗi đã nhập
		for (String key : slKiTu.keySet()) {
			System.out.println(key + " " + slKiTu.get(key));
		}
	}
}