//Calculate and return the area of the rectangle. The area should be rounded off to two decimal digits.
//Calculate and return the perimeter of the rectangle. The perimeter should be rounded off to two decimal digits.

class Rectangle {
    //Implement your code here
    public float length;
    public float width;
    public double calculateArea(){
        double getArea=(length*width);
        double roundOff1=Math.round(getArea*100.0)/100.0;
        return roundOff1;
    }
    public double calculatePerimeter(){
        double getPerimeter=2*(length+width);
        double roundOff2=Math.round(getPerimeter*100.0)/100.0;
        return roundOff2;

    }

}

class Tester {

    public static void main(String args[]) {

        Rectangle rectangle=new Rectangle();
        //Assign values to the member variables of Rectangle class
        rectangle.length=12f;
        rectangle.width=5f;

        //Invoke the methods of the Rectangle class to calculate the area and perimeter
        double area=rectangle.calculateArea();
        double perimeter=rectangle.calculatePerimeter();

        //Display the area and perimeter using the lines given below
        System.out.println("Area of the rectangle is "+area);
        System.out.println("Perimeter of the rectangle is "+perimeter);
    }

}