
package loops;
import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        int choice;
        System.out.println("Pick one : 1. Hi\t1. Hey\t2. Hello\t ");
        Scanner s = new Scanner (System.in);
        choice= s.nextInt();
        switch(choice)
        {
            case 1: System.out.println("You said Hi");
                 break;
            case 2: System.out.println("You said Hey ");
                  break;
            case 3: System.out.println("You said Hello");
                 break;
            default : System.out.println("Invalid Choice");
        }
        
    }
    
}
