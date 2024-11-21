package bai2;

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
		
		String fileName = "exp.dat";
		
		try {
			FileOutputStream newFile = new FileOutputStream(fileName);
			DataOutputStream out = new DataOutputStream (newFile);
			out.writeUTF(chuoiKT);
			out.writeChar(kiTu);
			out.writeInt(soNguyen);
			out.writeFloat(soThuc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileInputStream file = new FileInputStream(fileName);
			DataInputStream in = new DataInputStream(file);
			String first = in.readUTF();
			System.out.println("Chuoi da nhap la: " + first);
			char second = in.readChar();
			System.out.println("Ki tu da nhap la: " + second);
			int third = in.readInt();
			System.out.println("So nguyen da nhap la: " + third);
			float fourth = in.readFloat();
			System.out.println("So thuc da nhap la: " + fourth);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
