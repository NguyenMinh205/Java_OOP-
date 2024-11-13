package bai7;

public class Circle implements GeometricObject{
	//Variable
	protected double radius;

	//Constructors
	public Circle () {
		
	}
	
    public Circle(double radius){
        this.radius = radius;
    };

    //Getter and Setter
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
    	this.radius = radius;
    }

    //Override methods
    @Override
    public double getPerimeter()
    {
        double c = 2 * Math.PI * radius;
        return c;
    }

    @Override
    public double getArea()
    {
        double s = Math.PI * radius * radius;
        return s;
    }
}
