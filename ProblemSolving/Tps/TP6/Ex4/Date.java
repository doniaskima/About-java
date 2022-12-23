import java.util.*;

public class Date 
{
	private int jour;
	private int mois;
	private int annee;
	
	
	public Date(int j , int m , int a)throws DateException
	{
		ArrayList <Integer>d31 = new ArrayList<Integer>();
		ArrayList <Integer>d30 = new ArrayList<Integer>();
		
		d30.add(4);
		d30.add(6);
		d30.add(9);
		d30.add(11);
		
		d31.add(1);
		d31.add(3);
		d31.add(5);
		d31.add(7);
		d31.add(8);
		d31.add(10);
		d31.add(12);
		
		if (j > 31 || m>12)
		{
			throw new DateException("date invalide");
		}
		
		
		if ( j <= 31 && m!=2)
		{
			if ( d31.contains(m) == false  )
			{
				throw new DateException("date invalide");
			}	
		}
		else if ( j <= 30 && m!=2)
		{
			if (d30.contains(m) == false)
			{
				throw new DateException("date invalide");
			}
		}
		else
		{
			if (m != 2)
			{
				throw new DateException("date invalide");
			}
			
			if (a % 4 != 0)
			{
				throw new DateException("date invalide");
			}
		}
		
		
		this.annee = a;
		this.mois = m;
        this.jour = j;
        
       System.out.println(m+"/"+j+"/"+a);

	}

}