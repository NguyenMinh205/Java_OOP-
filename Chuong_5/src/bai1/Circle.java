package bai1;

public class Circle {
	protected double radius;

	public Circle() {

	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return (radius * radius * Math.PI);
	}

	public String toString() {
		return "Ban kinh: " + this.radius + "\nDien tich: " + this.getArea();
	}
}
