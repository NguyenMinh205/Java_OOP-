package bai3;

import java.util.Scanner;

public class NhanVien {
	//Variables
	private String name;
    private DiaChi address;
    private String dob;
    private char gender;

    //Constructors
    public NhanVien() {
    }

    public NhanVien(String name, DiaChi address, String dob, char gender) {
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.gender = gender;
    }

    //Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DiaChi getAddress() {
        return address;
    }

    public void setAddress(DiaChi address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    
    //Methods
    public void inputData () {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Nhap ten: ");
        this.name = input.nextLine();
        DiaChi diaChi = new DiaChi();
        diaChi.inputData();
        this.address = diaChi;
        System.out.print("Nhap ngay sinh: ");
        this.dob = input.nextLine();
        System.out.print("Nhap gioi tinh: ");
        this.gender = input.nextLine().charAt(0);
    }
    public String toString() {
        return "Ten: " + name + ", Dia chi: " + address.toString() + ", Ngay sinh: " + dob + ", Gioi tinh: " + gender;
    }
}
