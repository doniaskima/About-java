class UtiliseFinaly{

    static int moyenne(String[] liste) throws NumberFormatException {
        int somme = 0, entier, nbNotes = 0;
        int i = 0;
        for (i = 0; i < liste.length; i++) {
            try {
                entier = Integer.parseInt(liste[i]);
                somme += entier;
                nbNotes++;
            } finally {
                System.out.println("donne traitee" + liste[i]);
            }
        }
        return somme / nbNotes;
    }

    public static void main(String[] args) {
        try{
            System.out.println("La moyenne est" +moyenne(args));
        } catch (NumberFormatException e) {
            System.out.println("Ereur sur vos entiers");
        }
    }

}