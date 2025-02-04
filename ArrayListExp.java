import java.util.ArrayList;

public class ArrayListExp {
    public static void main(String[] args) {
        ArrayList<Integer> alist = new ArrayList<>();
        alist.add(45);
        alist.add(18);
        alist.add(7);
        alist.add(10);
        alist.add(93);
        System.out.println("ArrayList Before Rmoving and Updating : " +alist);
        alist.remove(3);
        System.out.println("ArrayList After Removing 3rd Element: " +alist);
        alist.set(1,17);
        System.out.println("ArrayList After changing second Element : " +alist);
        System.out.println("Updated ArrayList elements : ");
        for(int arrlist : alist){

            System.out.println( arrlist);
        }



    }
    
}
