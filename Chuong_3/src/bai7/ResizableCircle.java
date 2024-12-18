package bai7;

public class ResizableCircle extends Circle implements Resizable{
	//Methods
    public ResizableCircle(double radius) {
		super(radius);
	}

	@Override
    public void resize(int percent)
    {
        super.radius *= (percent/100.0);
    }
}
