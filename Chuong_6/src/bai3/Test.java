package bai3;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Student> students = new ArrayList<Student>();
		int count = 1;
		boolean check = true;

		try {
			do {
				System.out.println("Nhap thong tin sinh vien thu " + count + ": ");
				System.out.print("Nhap ma sinh vien: ");
				String sCode = input.nextLine();
				System.out.print("Nhap ten sinh vien: ");
				String name = input.nextLine();
				System.out.print("Nhap ngay sinh: ");
				String dob = input.nextLine();
				System.out.print("Nhap gioi tinh (M: Male, F: Female): ");
				char gender = input.nextLine().charAt(0);
				students.add(new Student(sCode, name, dob, gender));
				count++;
				System.out.print("Ban co muon nhap tiep hay khong (1: co, 0: khong): ");
				int c = input.nextInt();
				input.nextLine();
				if (c == 0)
					check = false;
			} while (check);
		} catch (Exception e) {
			System.out.println("Loi cu phap");
		}
		
//		System.out.println("Danh sach sinh vien da nhap.");
//		int thuTu = 1;
//		for (Student stu : students) {
//			System.out.println("Thong tin sinh vien thu " + thuTu++ + ": ");
//			System.out.print(stu);
//			System.out.println();
//		}

		try {
			FileOutputStream newFile = new FileOutputStream("student.dat");
			ObjectOutputStream out = new ObjectOutputStream(newFile);
			out.writeObject(students);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileInputStream file = new FileInputStream("student.dat");
			ObjectInputStream in = new ObjectInputStream(file);
			ArrayList<Student> stu = new ArrayList<Student>();
			stu = (ArrayList<Student>) in.readObject();
			for (Student student : stu) {
				System.out.println(student);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
