package bai2;

public class InvalidDateException extends Exception {
	public InvalidDateException() {

	}

	public InvalidDateException(String thongDiep) {
		super(thongDiep);
	}
}
