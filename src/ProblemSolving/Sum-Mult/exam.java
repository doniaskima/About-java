public class exam {
      void show(int a, char b){
        System.out.println("Good");
     };
      void  show(char a, int b){
         System.out.println("job");
        
     }

     public static void main(String[] args) {
        exam m = new exam();
        m.show(10,'A');
        m.show('A',10);

     }
   
}
