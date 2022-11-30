 
public class TestVecteur {
public static void main(String[] args){
		Vecteur v1,v2,w;
		v1=new Vecteur(4,2);
		v2=new Vecteur(4,5);
		double x=v1.prod_scal(v2);
		System.out.print("le produit scalaire de v1 et v2="+x);
		v1.affiche();
		System.out.println();
		v2.affiche();
		w= Vecteur.somme(v1, v2);
		System.out.println();
		w.affiche();
	}

}