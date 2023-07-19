import java.util.ArrayList;
import java.util.Scanner;

public class qsbjava2 extends qsbclass implements inface{ 
    int ok = (int) (Math.random() *10);
    String  ss;

    public qsbjava2(){
        ss = "dd";
    }
    public qsbjava2(String s1){
        ss = s1;
    }

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
        super.pf2();
    }

    @Override
    public void plau() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'plau'");
    }

    

}