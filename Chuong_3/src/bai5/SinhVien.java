package bai5;

public class SinhVien extends Nguoi{
	//Variables
	protected String lop;
	protected String nganh;
	protected Truong truong;
	
	//Constructors
	public SinhVien () {
		super();
	}

	public SinhVien(String lop, String nganh, Truong truong, String ten, int tuoi, char gioiTinh) {
		super(ten, tuoi, gioiTinh);
		this.lop = lop;
		this.nganh = nganh;
		this.truong = truong;
	}

	//Getter and Setter
	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public String getNganh() {
		return nganh;
	}

	public void setNganh(String nganh) {
		this.nganh = nganh;
	}

	public Truong getTruong() {
		return truong;
	}

	public void setTruong(Truong truong) {
		this.truong = truong;
	}
	
	public String toString () {
		return super.toString() + "\nLop: " + lop + ", nganh: " + nganh + "\n" + truong.toString();
	}
}
