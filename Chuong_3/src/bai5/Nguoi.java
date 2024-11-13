package bai5;

public class Nguoi {
	//Variables
	protected String ten;
	protected int tuoi;
	protected char gioiTinh;
	
	//Constructors
	public Nguoi () {
		
	}

	public Nguoi(String ten, int tuoi, char gioiTinh) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
	}

	//Getter and Setter
	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public char getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(char gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	
	public String toString () {
		return "Ten: " + ten + ", tuoi: " + tuoi + ", Gioi tinh: " + gioiTinh;
	}
}
