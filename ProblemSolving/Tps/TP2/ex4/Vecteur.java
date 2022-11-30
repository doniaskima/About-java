public class Vecteur {
	
    private double T[];
    
	public Vecteur (int n) {
		T = new double [n];
		for (int i=0;i<n;i++)
			T[i]=0;

	}
	public Vecteur (int n, double x){
		T=new double[n];
		for(int i=0;i<n;i++)
			T[i]=x;
	}
	public Vecteur(double[]v){
		T=new double[v.length];
		for (int i=0;i<v.length;i++){
			T[i]=v[i];
		}
		
	}
	public double prod_scal(Vecteur w){
		if(w.T.length!=this.T.length)
		{return 0;}
		else{
			double x=0;
			for(int i=0;i<w.T.length;i++){
				x=x+w.T[i]*T[i];
			}
			return x;
		}
		 
		
	}
	public static Vecteur somme (Vecteur v1,Vecteur v2){
		if(v1.T.length!=v2.T.length)
			return null;
		else{
			Vecteur v3=new Vecteur(v1.T.length);
			for (int i=0;i<v1.T.length;i++){
				v3.T[i]=v1.T[i]+v2.T[i];	
			}
			return v3;
		}
	}
	public void affiche (){
		for (int i=0;i<T.length;i++)
			System.out.print(T[i]+"\t");
	}
	
}