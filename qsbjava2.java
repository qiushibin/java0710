
import java.util.Scanner;

public class qsbjava2{
    int ok = (int) (Math.random() *10);

    public void pp() {
        
        System.out.println(ok);
        System.out.print("waiting in ... ");
        try (Scanner scanner = new Scanner(System.in)) {
            
            String a = scanner.nextLine();
            System.out.println("input:" +a);
        }
    
    }
}