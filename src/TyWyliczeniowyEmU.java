
public class TyWyliczeniowyEmU {
	
	
	public enum DzienTygodnia{
		Poniedzia³ek(1),Wtorek(2),Œroda(3),Czwarek(4),Pi¹tek(5),Sobota(6),Niedziela(7);        // typ wyliczeniow przydaje sie jak mamy okreslon¹ liczbê obiketów 
																		//moze byc sam albo rozrzezamy go o dodatkowe paametry wtedy potrzebuje konstruktor
	private int numerDnia;												// dodatkowych parametro do obiektu moze byc kilka, definjuje to sie konstruktorzeê 		
		private DzienTygodnia(int ndnia)
		{
		numerDnia = ndnia;	
		
		
		
		}
		public void konweruj()    //typ wyliczeniowy jest kas¹ i moze równiez posiadac metody , mogê równiez przedefiniowaæ istniej¹ce metody 
		{
			if(this==DzienTygodnia.Pi¹tek) 
			{	System.out.println("Lubiê pi¹tek");
				
			}
			
		}
	
	};

		
	
		
	
	
			

	public static void main(String[] args) {
		
DzienTygodnia dzien = DzienTygodnia.Pi¹tek;
System.out.println(dzien);
dzien.konweruj();


	}

}
