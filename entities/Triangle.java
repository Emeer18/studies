package entities;

public class Triangle {
    public Double a;
    public Double b;
    public Double c;
    public Double p;

    public double area() {

        p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        
    }

    public static void imprimeArea(double xa, double ya){

        if (xa > ya) {

            System.out.printf("The Area Height é : %.2f\n" , xa);
        }
            else { 
            
            System.out.printf("The Area Height ér : %.2f\n" , ya);
        }

    }

}
