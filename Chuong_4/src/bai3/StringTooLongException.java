package bai3;

public class StringTooLongException extends Exception {
	public StringTooLongException() {

	}

	public StringTooLongException(String thongDiep) {
		super(thongDiep);
	}
}
