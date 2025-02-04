import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashmapExp {
    public static void main(String[] args) {
        int roll=0;
        String name ="";
        HashMap <Integer, String> student = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        System.out.println(" Recording Five Student details  : ");
        for(int i=0 ; i< 5; i++){
            System.out.println("Enter Roll No. : ");
            roll = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Student Name of Above Roll No. : ");
            name = sc.nextLine();
            student.put(roll,name);
            
        }
       
        
        System.out.println("Student details are : " +student);
        System.out.println("Student Names : ");
        for( Map.Entry<Integer,String> stu : student.entrySet()){
            System.out.println(stu.getValue());

        }
        System.out.println("Enter any of the Student Roll No. to delete : ");
        int n= sc.nextInt();
        student.remove(n);
        System.out.println("Student details after deleting one of the student's info : " +student);
    }
    
}
