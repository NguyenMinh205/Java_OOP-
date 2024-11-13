package bai4;

public class BenhVien {
	//Variables
	protected String tenBV;
	protected String diaChi;
	protected String giamDoc;
	
	//Constructors
	public BenhVien () {
		
	}

	public BenhVien(String tenBV, String diaChi, String giamDoc) {
		this.tenBV = tenBV;
		this.diaChi = diaChi;
		this.giamDoc = giamDoc;
	}
	
	//Getter and Setter
	public String getTenBV() {
		return tenBV;
	}

	public void setTenBV(String tenBV) {
		this.tenBV = tenBV;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getGiamDoc() {
		return giamDoc;
	}

	public void setGiamDoc(String giamDoc) {
		this.giamDoc = giamDoc;
	}
	
	public String toString () {
		return ("Ten bien vien: " + this.tenBV + ", dia chi: " + this.diaChi + ", giam doc: " + this.giamDoc);
	}
}
