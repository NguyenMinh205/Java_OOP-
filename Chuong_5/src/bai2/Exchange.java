package bai2;

import java.util.ArrayList;

public class Exchange {
	protected ArrayList<Rate> rates = new ArrayList<Rate>();
	
	public Exchange() {
		
	}
	
	public Exchange(ArrayList<Rate> rates) {
		this.rates = rates;
	}



	public void addRate(String code1, String code2, double rate) {
        rates.add(new Rate(code1, code2, rate));
    }
	
	public double convert(String code1, String code2, double tien) {
		for (Rate rate1 : rates) {
			if (rate1.getCode1().equals(code1) && rate1.getCode2().equals(code2)) {
				return tien * rate1.rate;
			}
		}
		return -1;
	}
}
