package entities;

    public class Rectangle {
    
    public double height;
    public double width;


    public double area(){

    return height * width;

    }

    public double perimeter(){
    
    return (height * 2) + (width * 2);

    }   

    public double diagonal(){

    return Math.sqrt(((height * 2) + (width * 2)));

    }

    public String toString(){

    return "Area = " + area() + "\nPerimeter = " + perimeter() + "\nDiagonal = " + diagonal();

    }


}
