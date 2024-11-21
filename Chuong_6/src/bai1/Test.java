package bai1;

import java.util.Scanner;
import java.io.*;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap chuoi ki tu: ");
		String chuoiKT = input.nextLine();
		System.out.print("Nhap ki tu: ");
		char kiTu = input.nextLine().charAt(0);
		System.out.print("Nhap so nguyen: ");
		int soNguyen = input.nextInt();
		System.out.print("Nhap so thuc: ");
		float soThuc = input.nextFloat();
		
		File newFile = new File("exp.txt");
		try {
			newFile.createNewFile();
			FileWriter writer = new FileWriter(newFile);
			PrintWriter out = new PrintWriter(writer);
			out.println(chuoiKT);
			out.println(kiTu);
			out.println(soNguyen);
			out.println(soThuc);
			out.close();
			
		} catch (IOException e){ 
			e.printStackTrace();
		}
		
		try {
			FileReader reader = new FileReader(newFile);
			BufferedReader in = new BufferedReader(reader);
			String first = in.readLine();
			System.out.println("Chuoi da nhap la: " + first);
			char second = in.readLine().charAt(0);
			System.out.println("Ki tu da nhap la: " + second);
			int third = Integer.parseInt(in.readLine());
			System.out.println("So nguyen da nhap la: " + third);
			float fourth = Float.parseFloat(in.readLine());
			System.out.println("So thuc da nhap la: " + fourth);
			in.close();
		} catch (IOException e){ 
			e.printStackTrace();
		}
		
	}
}
