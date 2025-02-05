import java.util.Optional;

interface UserService{
    default String getWelcomeMessage(){
        return "Welcome, Guest!";
    }
    Optional<String> getUser(String name);

}
class Uservice1 implements UserService{
        public Optional<String> getUser(String name){
              return Optional.ofNullable(name);
        }



    public static void main(String[] args) {
        
        Uservice1 u = new Uservice1();
        String msg1 = u.getUser("Ashwith")
                    .map(name -> "Welcome, "+name+  "!")
                    .orElse(u.getWelcomeMessage());
                    System.out.println(msg1);
    
    String msg2 = u.getUser(null)
                .map(name -> "Welcome, " + name + "!")
                .orElse(u.getWelcomeMessage());
        System.out.println(msg2);

    
      }


}
