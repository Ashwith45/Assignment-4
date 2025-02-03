 class Item {
    String Title;
    String Author;
    int Publication_Year;
    public void displayDetails(){
        System.out.println("Title : "+Title);
        System.out.println("Author : "+Author);
        System.out.println("Publication Year :" +Publication_Year);
    }

}
class Book extends Item {
  String Genre;
  public void bookDetails(){
    displayDetails();

    System.out.println("Genre of The Book : " +Genre );
  }
}
class Magazine extends Item {
    int issueNumber;
    public void magazineDetails(){

     displayDetails();
     System.out.println("Issue Number of the MagaZine : " +issueNumber);
        
    } 
    

}



public class Library {

    public static void main(String[] args) {
        System.out.println("Book Details : ");
        Book book1 = new Book();
        book1.Title = "My Name is ...";
        book1.Author = "Ashwith";
        book1.Publication_Year = 2030;
        book1.Genre = " Comedy Thriller";
        book1.bookDetails();
        System.out.println("MagaZine Details :");
        Magazine m1 = new Magazine();
        m1.Title ="Nature";
        m1.Author = "Warner & Spencer";
        m1.Publication_Year = 2025;
        m1.issueNumber = 1234;
        m1.magazineDetails();


    }


    
}

