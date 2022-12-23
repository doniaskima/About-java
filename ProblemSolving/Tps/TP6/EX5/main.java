public void main{



	public class NumberOutOfRangeException extends Exception {
		public NumberOutOfRangeException(String msg) {
			super(msg);
		}
	
	}
	
		public int get_val() {
			return (this.valeur);
		}
	
		public int get_coef() {
			return (this.coef);
		}
	
		public class Etudiant {
			private String nom;
			private String prenom;
			private Note notes[] = new Note[50];
			private int id;
			private int nb = 0;
	
			public Etudiant(String n, String p, int id) {
				this.nom = n;
				this.prenom = p;
				this.id = id;
			}
	
			public void ajouter_note(Note n) {
				notes[nb] = n;
				nb++;
			}
	
			public float moyenne() {
				float s = 0;
	
				for (int i = 0; i < nb; i++) {
					s += notes[i].get_val() * notes[i].get_coef();
				}
	
				if (nb == 0) {
					return 0;
				}
	
				return (s / nb);
			}
	
		}
	
		public class Note {
			private String unite;
			private int valeur;
			private int coef;

			public Note(String u, int v, int c) throws NumberOutOfRangeException {
				this.unite = u;
				if (v > 20 || v < 0) {
					throw new NumberOutOfRangeException("number out of range");
				} else {
					this.valeur = v;
				}
				if (c < 1 || c > 4) {
					throw new NumberOutOfRangeException("number out of range");
				} else {
					this.coef = c;
				}
			}
		}

		public static void main(String[] args) {
		
			try {
				Etudiant donia = new Etudiant("donia" , "Skima" , 1);
				Note x = new Note("fucking Reseau" , 1 , 1);
				Note y = new Note("graphe" , 6 , 1);
				Note z = new Note("english" , 16 , 1);
				donia.ajouter_note(x);
				donia.ajouter_note(y);
				donia.ajouter_note(z);
				
				System.out.println("moyenne = " + donia.moyenne());
				
			}catch(  NumberOutOfRangeException e ) {
				e.printStackTrace();
			}
	}
	

}