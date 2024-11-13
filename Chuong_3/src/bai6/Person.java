package bai6;

import java.util.Scanner;

public class Person {
	//Variables
	private String name;
    private int age;
    private char gender;

    //Constructors
    public Person() {
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    //Methods
    public void inputData() {
        try (Scanner input = new Scanner(System.in)) {
        	System.out.print("Nhap ten: ");
            this.name = input.nextLine();
            System.out.print("Nhap tuoi: ");
            this.age = input.nextInt();
            System.out.print("Nhap gioi tinh: ");
            this.gender = input.nextLine().charAt(0);
        }
    }

    @Override
    public String toString() {
        return "Ten: " + name + ", tuoi: " + age + ", gioi tinh: " + gender;
    }
}
