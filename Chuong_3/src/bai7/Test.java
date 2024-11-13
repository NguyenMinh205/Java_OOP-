package bai7;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap ban kinh: ");
		double radius = input.nextDouble();
        ResizableCircle rc = new ResizableCircle(radius);
        System.out.println("Ban kinh truoc khi resize: " + rc.getRadius());
        System.out.print("Nhap ti le ma ban muon ban kinh hien tai thay doi "
        		+ "(VD: nhap 60% tuc ban kinh hien tai resize con 60% so voi ban dau): ");
		int percent = input.nextInt();
		rc.resize(percent);
        System.out.println("Ban kinh sau khi resize: " + rc.getRadius());
        System.out.println("Chu vi: " + rc.getPerimeter());
        System.out.println("Dien tich: " + rc.getArea());
        input.close();
    }
}
