import java.util.ArrayList;
import java.util.Scanner;

public class qsbjava2 extends qsbclass{ 
    int ok = (int) (Math.random() *10);

    ArrayList<Integer> dd = new ArrayList<Integer>();

    public void pp() {
        
        System.out.println(ok);
        System.out.print("waiting in ... ");
        try (Scanner scanner = new Scanner(System.in)) {
            
            String a = scanner.nextLine();
            System.out.println("input:" +a);
        }
        this.pf(1);
    }

    void pf2(){
       
        System.out.println("pf 2 extends");
        
    }

}