package bai8;

public abstract class Shape {
	//Variable
	private String color;

	//Constructors
    public Shape(){
    	
    }
    public Shape(String color)
    {
        this.color = color;
    }
    
    //Getter and Setter
    public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//Methods
    public abstract double getArea();

    public String toString()
    {
        return "mau: " + color;
    }
}
