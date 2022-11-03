public class Compte {
	private int NumCompte;
	private String Nom;
	private int Sold; 
	private int DebitMaxAutorise ;
	private static int Numero=0;
  public Compte(String s ,int x ,int dma ){
	  if (x>20 && dma>0){ 
		  NumCompte=++Numero;
		  Nom=s;
		  DebitMaxAutorise=dma;
		  Sold=x;
		  
	  }
	  
  }
  public int getnumcompte(){
	  return NumCompte;
  }
  public String getnom(){
	
	  return Nom;
	  
  }
  public void sethome(String newNom){
	  if (!(Nom.equals(newNom))) 
			{Nom=newNom;}
	  
  }
  public int getsold(){
	  return Sold;
  }
  public void setdma(int d){
	  if(d>0)
	  DebitMaxAutorise=d;
	  
		  
  }
  public int getdma(){
	  return  DebitMaxAutorise;
  }
  
  public void crediter(int x){
	  if (x>0)
		  Sold+=x;
  }
  public void debiter(int x){
	  if (x<=DebitMaxAutorise && Sold>x)
		  Sold-=x;
  }
  public void virer(int x,Compte c){
	  if (x<=c.getsold() && c.getdma()>=x && x>0){c.debiter(x);
	  this.crediter(x);}
		  
  }
  
  
}

