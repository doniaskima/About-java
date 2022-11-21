public class TestAnimalerie {
    public static void main(String[] args) {
        Animalerie animal = new Animalerie(4);

        Chat chat1 = new Chat("chat", "cutie", "Miao Miao");
        Chat chat2 = new Chat("chat", "cutie", "Miao Miao");

        Chien chien = new Chien("Berger", "Mark", "Hab Hab");
        animal.addAnimal(chat1);
        animal.addAnimal(chat2);
        animal.addAnimal(chien);

        for (int i = 0; i < animal.nb; i++) {
            System.out.println(animal.T[i].toString());
        }



    }
}
