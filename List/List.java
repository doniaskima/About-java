// How to create List in java

public class List {
    //Cretaing a List of type String using ArrayList 
    List<String> list = new ArrayList<String>();
    //Creating a list of Type Integer using ArrayList 
    List<Integer> list = new ArrayList<Integer>();
    //Creating a list of type Book using ArrayList 
    List<Book> list = new ArrayList<Book>();
    //Creatnig a lisr of type Linekdlist using LinkedList 
    List<Linekdlist> list = new ArrayList<Linekdlist>;

    //Adding elemnts in the list 
    list.add("Donia");
    list.add("Jihen");
    list.add("Marwa");
    list.add("Sirine");
    list.add("islem");
    list.add("Hanin");
    
    //literating the list element using for-each loop
    for(String friend:list)
    {
        System.out.println(friend);
    }
}
