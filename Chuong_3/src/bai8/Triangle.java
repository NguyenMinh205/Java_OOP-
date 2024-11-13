package bai8;

public class Triangle extends Shape{
	//Variables
	private int base;
    private int height;

    //Constructors 
    public Triangle() {
        super();
    }

    public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    //Getter and Setter
    public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	//Methods
    @Override
    public double getArea()
    {
        return base * height;
    }

    public String toString()
    {
        return "Dien tich hinh tam giac la: " + getArea() + " va co " + super.toString();
    }
}
