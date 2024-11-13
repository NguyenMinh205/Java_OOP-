package bai3;

import java.util.Scanner;

public class DiaChi {
	//Variables
	private String thon;
    private String xa;
    private String huyen;
    private String tinh;
    
    //Constructors
    public DiaChi() {
    }

    public DiaChi(String thon, String xa, String huyen, String tinh) {
        this.thon = thon;
        this.xa = xa;
        this.huyen = huyen;
        this.tinh = tinh;
    }

    //Getter and Setter
    public String getThon() {
        return thon;
    }

    public void setThon(String thon) {
        this.thon = thon;
    }

    public String getXa() {
        return xa;
    }

    public void setXa(String xa) {
        this.xa = xa;
    }

    public String getHuyen() {
        return huyen;
    }

    public void setHuyen(String huyen) {
        this.huyen = huyen;
    }

    public String getTinh() {
        return tinh;
    }

    public void setTinh(String tinh) {
        this.tinh = tinh;
    }
    //Methods
    public void inputData () {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Nhap thon: ");
        this.thon = input.nextLine();
        System.out.print("Nhap xa: ");
        this.xa = input.nextLine();
        System.out.print("Nhap huyen: ");
        this.huyen = input.nextLine();
        System.out.print("Nhap tinh: ");
        this.tinh = input.nextLine();
    }
    
    public String toString() {
        return "Thon " + thon + ", Xa " + xa + ", Huyen " + huyen + ", Tinh/Thanh pho " + tinh;
    }
}
