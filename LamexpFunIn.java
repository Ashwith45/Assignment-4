import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

interface  StringProcessor {
     String  process(String str) ;
        

}


public class LamexpFunIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of Names you want to enter : ");
        int n = sc.nextInt();
        
        List <String> list =new ArrayList<>() ;
        System.out.println("Enter  " + n + "  Names "); 
        for(int i=0;i<=n;i++){
            
            list.add(sc.nextLine());
        }
        
       list.sort(Comparator.reverseOrder());
       
       System.out.println("Names after arranging them in Reverse Alphabetical Order : " +list);
       StringProcessor sp = String :: toUpperCase;
      
       System.out.println("Names after converting into Uppercase : ");
    
       for(String names : list){
        
        System.out.println(sp.process(names));
       }
       
       sc.close();
    }
   
    
}
