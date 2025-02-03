import java.util.Scanner;

interface Details {
    String director = "RajaMouli";
    String musicComposer ="Keeravani";
    String cinematographer = "Senthi Kumar";
    public void movie();

}
 abstract class Crew implements Details {
    private String Script;
    public void crewDetails(){
        System.out.println("Name of The Director :" +director);
        System.out.println("Name of The Music Composer :" +musicComposer);
        System.out.println("Name of The CinematoGrapher :" +cinematographer);
    
        

    }
    private void script(){
        System.out.println("Click the below link  : ");
        System.out.println("www.moviescript.in");
    }
    public String getScript(){
        return "Script";
    }
    public void setScript(String draft){
        this.Script = draft;
        System.out.println("If You need the " + Script);
    }
    public void displayScriptDetails() {
        script();
        
    }

}
class Bahubali extends Crew {
    public void movie() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Hero Name of Movie Bahubali : ");
        String Hero = sc.nextLine();
        System.out.println("Crew Deatls of Bahubali Movie are :");
        System.out.println("Name of the MainLead : "+Hero);
        crewDetails();
        getScript();
        
        
    }
}
class RRR extends Crew{ 
    public void movie(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Hero Names of Movie RRR : ");
        String Hero1 = sc.nextLine();
        String Hero2 = sc.nextLine();
        System.out.println("Crew Deatls of RRR Movie are :");
        System.out.println("Names of the MainLead : "+Hero1 + " and  "   +Hero2);
        crewDetails();
        getScript();
        


    }

    
}




public class Oops {
    public static void main(String[] args) {
        Bahubali b= new Bahubali();
        b.movie();
        b.getScript();
        b.setScript(" Script of Bahubali");
        b.displayScriptDetails();
        
        RRR rrr= new RRR();
        rrr.movie();
        rrr.getScript();
        rrr.setScript("Script of RRR");
        rrr.displayScriptDetails();
        
    }
    
}
