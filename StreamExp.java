import java.util.*;


public class StreamExp {
    public static void main(String[] args) {
        HashMap <String,Integer> rs = new HashMap<>();
       
        rs.put("ODI",11000);
        rs.put("TEST",4200);
        rs.put("T20",4300);
        

            int result = rs.values().stream().reduce(0,(c,e) -> c+e);
            System.out.println(result);
        
        
        
        
        


    }
}
