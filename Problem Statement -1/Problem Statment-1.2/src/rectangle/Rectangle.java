package rectangle;

public class Rectangle {
	private int length,breadth,area;
	
	public void setLength(int length) {
		this.length=length;
	}
    public void setBreadth(int breadth) {
		this.breadth=breadth;
	}
    public void setArea(int area) {
		this.area=area;
	}
    
    public int getLength() {
    	return length;
    	
    }
    public int getBreadth() {
    	return breadth;
    	
    }

    public int getArea() {
	    return area;
	
    }
    
    public Rectangle() {
    	
    }

	public Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	void areaOfRectangle(int length,int breadth)
	{
		area= length*breadth;
	}
	
	 void displayAllInformation() {
		System.out.println("The length of the rectangle is :"+ length);
		System.out.println("The breadth of the rectangle is :"+ breadth);
		System.out.println("The area of the rectangle is :"+ area);
	}
	 
	public void displayAreaOfTestRectangle() {
		
		System.out.println("Length = "+length);
		System.out.println("Beadth = "+breadth);
		System.out.println("Area = "+length*breadth);
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
//		Rectangle obj = new Rectangle(3,5);
//		obj.areaOfRectangle(3, 5);
//		obj.displayAllInformation();
		Rectangle obj = new Rectangle();
		obj.setLength(3);
		obj.setBreadth(5);
		obj.setArea(3*5);
		System.out.println("Length from Getter ="+obj.getLength());
		System.out.println("Breadth from Getter ="+obj.getBreadth());
		System.out.println("Area from Getter ="+obj.getArea());
		//System.out.println(obj.length);
		//System.out.println(obj.breadth);
	}

}
