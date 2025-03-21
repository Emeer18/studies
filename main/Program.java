import java.util.Scanner;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {
    public static void main(String[] args) throws java.text.ParseException {

    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    
    Post p1 = new Post(
        sdf.parse("21/06/2018 13:05:44"),
        "Traveling to New Zealand",
        "I'm going to visit this wonderful country!",
        12
    );

    System.out.println("Digite a quantidade de comentários: ");

    int n = sc.nextInt();
    sc.nextLine();

    for (int i = 0; i < n; i++) {
        p1.addComment(new Comment(sc.nextLine()));
    }

    System.out.println(p1.toString());

    sc.close();
    }
}