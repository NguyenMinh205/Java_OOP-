package bai8;

public class Rectangle extends Shape{
	//Variables
	private int length;
    private int width;

    //Constructors
    public Rectangle() {
        super();
    }

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    //Getter and Setter
    public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	//Methods
	@Override
    public double getArea()
    {
        return length * width;
    }

    public String toString()
    {
        return "Dien tich hinh chu nhat la: " + getArea() + " va co " + super.toString();
    }
}
