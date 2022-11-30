public class Chat extends Animal {
     public Chat(String nom, String race, String bruit) {
       
      super(nom, race, bruit);
    };
  
    public void miauler() {
      System.out.println(bruit);
    }
  
  }