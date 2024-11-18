package bai1;

import java.util.ArrayList;

public class CircleCollection {
	protected ArrayList<Circle> al = new ArrayList<Circle>();
	
	public void addCircle(Circle c) {
		al.add(c);
	}
	
	public Circle getCircle (int pos) {
		return al.get(pos);
	}
	
	public void setCircle (int pos, Circle c) {
		this.al.set(pos, c);
	}
	
	public double calcSumArea () {
		double tong = 0;
		for (var i : al) {
			tong += i.getArea();
		}
		return tong;
	}
	
	double findMinArea () {
		double minArea = al.get(0).getArea();
		for (var i : al) {
			if (minArea > i.getArea()) {
				minArea = i.getArea();
			}
		}
		return minArea;
	}
	
	double findMaxArea () {
		double maxArea = 0;
		for (var i : al) {
			if (maxArea < i.getArea()) {
				maxArea = i.getArea();
			}
		}
		return maxArea;
	}
	
	public String toString() {
		for (var i : al) {
			System.out.println(i.toString());
			System.out.println();
		}
		return "";
	}
}
