package entities;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class File {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    
        List<String> list = new ArrayList<>();

        list.add("Emerson");
        list.add("Lucas");
        list.add("Bertelli");
        list.add("Cardoso");

        list.remove(1);
         
        for (String obj : list) {
            System.out.println(obj);
        }

        System.out.println("-----------------------------------------");

        list.removeIf(obj -> String.valueOf(obj).charAt(0) == '1');

        for (String obj : list) {
            System.out.println(obj);
        }

        System.out.println("-----------------------------------------");

        String value = list.stream().filter(obj ->obj.charAt(0) == 'C').findFirst().orElse(null);
        System.out.println(value);
    }
}
