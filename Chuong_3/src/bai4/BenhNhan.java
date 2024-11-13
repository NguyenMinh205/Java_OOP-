package bai4;

public class BenhNhan extends Nguoi{
	//Variables
	protected String tienSu;
	protected String chanDoan;
	protected BenhVien benhVien;
	
	//Constructors
	public BenhNhan () {
		super();
	}

	public BenhNhan(String tienSu, String chanDoan, BenhVien benhVien, String ten, int tuoi, char gioiTinh) {
		super(ten, tuoi, gioiTinh);
		this.tienSu = tienSu;
		this.chanDoan = chanDoan;
		this.benhVien = benhVien;
	}

	//Getter and Setter
	public String getTienSu() {
		return tienSu;
	}

	public void setTienSu(String tienSu) {
		this.tienSu = tienSu;
	}

	public String getChanDoan() {
		return chanDoan;
	}

	public void setChanDoan(String chanDoan) {
		this.chanDoan = chanDoan;
	}

	public BenhVien getBenhVien() {
		return benhVien;
	}

	public void setBenhVien(BenhVien benhVien) {
		this.benhVien = benhVien;
	}
	
	public String toString () {
		return super.toString() + "\nTien su: " + tienSu + ", chan doan: " + chanDoan + "\n" + benhVien.toString();
	}
}
