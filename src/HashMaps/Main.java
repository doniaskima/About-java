// Import the HashMap class
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities);
    //Output 
    //{USA=Washington DC, Norway=Oslo, England=London, Germany=Berlin}
    //Access an Item 
    System.out.println(capitalCities.get("England"));
    //Remove an Item
    capitalCities.remove("Germany");
    System.out.println(capitalCities);
    //Clear
    capitalCities.clear();
    System.out.println(capitalCities);
    //Output = {}
    //HashMap Size
    System.out.println(capitalCities.size());
    //Output =4
    //Loop Through a HashMap
    // Print keys
    for (String i : capitalCities.keySet()) {
    System.out.println(i);
    //Output=>
    //USA
    // Norway
    // England
    // Germany
    // Print values
    for (String i : capitalCities.values()) {
      System.out.println(i);
    }
    //Washington DC
    // Oslo
    // London
    // Berlin


    // Print keys and values
     for (String i : capitalCities.keySet()) {
       System.out.println("key: " + i + " value: " + capitalCities.get(i));
     

       //key: USA value: Washington DC
       //key: Norway value: Oslo
       // key: England value: London
       // key: Germany value: Berlin
}
 
 

