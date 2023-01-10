//clonage en general est la creation d'un nouvel objet a partir  d'une instance déjà existante
//Pour qu'un objet soit copiable (clonable), sa classe doit implanter la méthode clone() de l'interface Clonable. En fait, la méthode clone() est définie pour la
//classe Object et s'applique donc à tous les objets Java. 
//Cette redéfinition peut se limiter à faire appel à super.clone()

class Cellule extends Object implements Cloneable {
    int i = 0;
    int[] t = { 1, 2 };
    //Method
    public Object clone() {
        try{

            return super.clone();

        }catch(CloneNotSupportedException){
            throw new InternalError();
        }

    }
    public void afficher(){
       System.out.println(i +" "+ t[0]+" "+t[1]);
    }
}


class TestClone {
 public static void main(String args[]){
Cellule x = new Cellule(); // x Objet Cellule
x.afficher();
Cellule y = (Cellule) x.clone(); // y clone de x
y.afficher();
 }
}


//Result 
//i=0 t=(1, 2) // valeurs de la cellule x
//i=0 t=(1, 2) // valeurs de la cellule y