package entities;

public class Aluno {
    
    public double grade1;
    public double grade2;
    public double grade3;
    public double name;
    public double media;

    public void calculaMedia(){

        media = grade1 + grade2 + grade3;
        double rest = 60 - media;
        

        if (media < 60.0) {

            System.out.println("Missing, " + rest + " Points");
            
        }

        else {
            System.out.println("FINAL GRADE\nPASS");
        }
    }

}