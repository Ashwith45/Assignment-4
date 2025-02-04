import java.util.HashSet;
import java.util.Scanner;

public class HashsetEXP {
    public static void main(String[] args) {
        HashSet<String> cityNames = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Four City Names : " );
        for(int i =0; i<4; i++){
            String city = sc.nextLine();
            cityNames.add(city);
        }
        System.out.println("Enter same city or diffent from the above entered cities : ");
        String city = sc.nextLine();
        if(cityNames.contains(city)) {
            System.out.println("You all ready entered this city Name !!!  " );
           
        }
        else {
            
            
            cityNames.add(city);

        
        }
        System.out.println("The cities you entered are : " +cityNames);

        System.out.println("Enter any city from the above enter to remove :");
        city =sc.nextLine();

        cityNames.remove(city);
        System.out.println("Cities after removing " + city +" " +cityNames);


    }
    
}
