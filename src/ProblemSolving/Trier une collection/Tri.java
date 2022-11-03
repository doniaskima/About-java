 
import java.util.Collection;
import java.util.ArrayList;

public class Tri {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("donia skima");
        list.add("marwa majdoub");
        list.add("islem skima");
        list.add("sirine sarray");
        list.add("jiji skima");
        list.add("hanin dhaou");
        System.out.println("Avant le tri");
        for (String s : list) {
            System.out.println("\t" + s);
        }
        Collections.sort(list);
        System.out.println("Apres le tri");
        for (String s : list) {
            System.out.println("\t"+s);
        }
        
       
    }
}
