public class Animalerie {
    public Animal T[];
    public int nb;

    public Animalerie(int n) {
        T = new Animal[n];
        nb = 0;
    }

    public void addAnimal(Animal v){
       T[nb] = v; 
       nb++;
       System.out.println(this.nb);
    }

}
