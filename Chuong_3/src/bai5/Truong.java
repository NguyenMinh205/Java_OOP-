package bai5;

public class Truong {
	//Variables
	protected String tenT;
	protected String diaChi;
	protected String hieuTruong;
	
	//Constructors
	public Truong () {
		
	}

	public Truong (String tenT, String diaChi, String hieuTruong) {
		this.tenT = tenT;
		this.diaChi = diaChi;
		this.hieuTruong = hieuTruong;
	}
	
	//Getter and Setter
	public String getTenBV() {
		return tenT;
	}

	public void setTenT(String tenT) {
		this.tenT = tenT;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getHieuTruong() {
		return hieuTruong;
	}

	public void setHieuTruong(String hieuTruong) {
		this.hieuTruong = hieuTruong;
	}
	
	public String toString () {
		return ("Ten truong: " + this.tenT + ", dia chi: " + this.diaChi + ", hieu truong: " + this.hieuTruong);
	}
}
