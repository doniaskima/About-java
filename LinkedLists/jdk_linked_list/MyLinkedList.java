import java.util.LinkedList;


public class MyLinkedList {
    Employee DoniaSkima = new Employee("Donia","Skima",123);
    Employee MarwaMajdoub = new Employee("Marwa", "Majdoub", 129);
    Employee IslemSkima = new Employee("Islem","Skima",232);
    Employee JihenMajdoub = new Employee("Jihen", "Majdoub", 3293);


    LinkedList<Employee> list = new LinkedList<>();
    list.addFirst(DoniaSkima);
    list.addFirst(MarwaMajdoub);
    list.addFirst(JihenMajdoub);

    System.out.println(list.size());
    for(Employee node:list)
    {
        System.out.println(node.toString());
    }
    

    list.addLast(IslemSkima);
    System.out.println(list.size());
    for(Employee node: list) {
        System.out.println(node.toString());
    }

    list.removeLast();
    System.out.println(list.size());
    for(Employee node: list) {
        System.out.println(node.toString());
    }

}
