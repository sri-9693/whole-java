package polydemo;

public class Triangle extends Shape
{
     private double base,height;
     public Triangle(double base,double height)
     {
    	 this.base = base;
    	 this.height = height;
     }
     public double area()
     {
    	 return (base * height)/2;
     }

}
