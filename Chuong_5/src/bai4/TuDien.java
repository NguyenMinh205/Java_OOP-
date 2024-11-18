package bai4;

import java.util.HashMap;

public class TuDien {
	protected HashMap<String, String> tuDien = new HashMap<String, String>();
	
	public TuDien() {
		tuDien.put("apple", "qua tao");
		tuDien.put("ball", "qua bong");
		tuDien.put("cat", "con meo");
		tuDien.put("dog", "con cho");
		tuDien.put("elephant", "con voi");
		tuDien.put("fish", "con ca");
		tuDien.put("gift", "mon qua");
		tuDien.put("home", "nha");
	}

	public TuDien(HashMap<String, String> tuDien) {
		this.tuDien = tuDien;
	}
	
	public void themTu (String tu, String nghia) {
		tuDien.put(tu, nghia);
	}
	
	public String lookUp (String tu) {
		if (tuDien.containsKey(tu.toLowerCase())) {
			return (tu + " nghia la " + tuDien.get(tu.toLowerCase()));
		}
		return null;
		
//		for (var td : tuDien.keySet()) {
//			if (td == tu.toLowerCase()) {
//				return (td + " nghia la " + tuDien.get(tu));
//			}
//		}
//		return null;
	}
}
