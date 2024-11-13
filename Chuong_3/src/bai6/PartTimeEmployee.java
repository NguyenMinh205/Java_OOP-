package bai6;

import java.util.Scanner;

public class PartTimeEmployee extends Employee{
	//Variable
	private int hoursPerWeek;

	//Constructors
    PartTimeEmployee() {
        super();
    }

    public PartTimeEmployee(String name, int age, char gender, String employeeId, String dateHired, int hoursPerWeek) {
        super(name, age, gender, employeeId, dateHired);
        this.hoursPerWeek = hoursPerWeek;
    }

    //Getter and Setter
    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    //Methods
    @Override
    public void inputData() {
        try (Scanner input = new Scanner(System.in)) {
            super.inputData();
            this.hoursPerWeek = input.nextInt();
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nSo gio lam moi tuan: " + hoursPerWeek;
    }
}
