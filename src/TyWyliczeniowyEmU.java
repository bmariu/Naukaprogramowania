
public class TyWyliczeniowyEmU {
	
	
	public enum DzienTygodnia{
		Poniedzia�ek(1),Wtorek(2),�roda(3),Czwarek(4),Pi�tek(5),Sobota(6),Niedziela(7);        // typ wyliczeniow przydaje sie jak mamy okreslon� liczb� obiket�w 
																		//moze byc sam albo rozrzezamy go o dodatkowe paametry wtedy potrzebuje konstruktor
	private int numerDnia;												// dodatkowych parametro do obiektu moze byc kilka, definjuje to sie konstruktorze� 		
		private DzienTygodnia(int ndnia)
		{
		numerDnia = ndnia;	
		
		
		
		}
		public void konweruj()    //typ wyliczeniowy jest kas� i moze r�wniez posiadac metody , mog� r�wniez przedefiniowa� istniej�ce metody 
		{
			if(this==DzienTygodnia.Pi�tek) 
			{	System.out.println("Lubi� pi�tek");
				
			}
			
		}
	
	};

		
	
		
	
	
			

	public static void main(String[] args) {
		
DzienTygodnia dzien = DzienTygodnia.Pi�tek;
System.out.println(dzien);
dzien.konweruj();


	}

}
