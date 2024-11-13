package bai6;

import java.util.Scanner;

public class Employee extends Person {
	//Variables
	private String employeeId;
    private String dateHired;

    //Constructors
    public Employee() {
        super();
    }

    public Employee(String name, int age, char gender, String employeeId, String dateHired) {
        super(name, age, gender);
        this.employeeId = employeeId;
        this.dateHired = dateHired;
    }

    //Getter and Setter
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDateHired() {
        return dateHired;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    
    @Override
    public void inputData() {
        try (Scanner input = new Scanner(System.in)) {
            super.inputData();
            System.out.print("Nhap ID nhan vien: ");
            this.employeeId = input.nextLine();
            System.out.print("Nhap ngày thuê: ");
            this.dateHired = input.nextLine();
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nID nhan vien: " + employeeId + ", ngay thue: " + dateHired;
    }
}
