package pkgMain;

import pkgexcptions.TrangleException;

public class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle(){
		this.side1=1.0;
		this.side2=1.0;
		this.side3=1.0;
	}
    
	public Triangle(double side1,double side2,double side3) throws TrangleException{
    	this.side1=side1;
    	this.side2=side2;
    	this.side3=side3;
    	
    	
    }
	
	public double getside1(){
		return side1;
	}
	public double getside2(){
		return side2;
	}
	public double getside3(){
		return side3;
	}
	private void checkArea() throws TrangleException{
	
		
		double s= (0.5) * getPerimeter();
		   double squareArea=s * (s- side1) * (s - side2) * (s - side3);
		   if (squareArea>0){
	
		   }
		   else{
			 throw new TrangleException(this); 
		   }

	}
	
	//Override
    public double getArea(){
	   
	   double s= 0.50 *getPerimeter();
	   return Math.sqrt(s * (s- side1) * (s - side2) * (s - side3));

	   
   }
    
   @Override
   public double  getPerimeter(){
	   return side1+side2+side3;
   }
   @Override
   public String toString(){
	return "The area of the triangle is" +getArea()+"It's Perimeter is"+getPerimeter();	
}

}
