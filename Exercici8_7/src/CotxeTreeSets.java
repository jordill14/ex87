import java.util.TreeSet;

public class CotxeTreeSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creem 4 TreeSet
		TreeSet <Cotxe> lista1 = new TreeSet<Cotxe>(); 
		TreeSet <Cotxe> lista2 = new TreeSet<Cotxe>();
		TreeSet <CotxePot> lista3 = new TreeSet<CotxePot>();
		TreeSet <CotxePot> lista4 = new TreeSet<CotxePot>();
		//Definim 6 objectes de la classe Cotxe
		Cotxe cAlfa = new Cotxe("Alfa Romeo", "Giulia", 2900, 6);
		Cotxe cDacia = new Cotxe("Dacia", "Sandero", 1200, 4);
		Cotxe cFord = new Cotxe("Ford", "Focus", 2000, 4);
		Cotxe cOpel = new Cotxe("Opel", "Insignia", 2200, 4);
		Cotxe cIbiza = new Cotxe("Seat", "Ibiza", 1600, 4);
		Cotxe cHyundai = new Cotxe("Hyundai", "Atos", 1500, 3);
		//Afegim els objectes de la classe Cotxe al primer TreeSet
		lista1.add(cAlfa);
		lista1.add(cDacia);
		lista1.add(cFord);
		lista1.add(cOpel);
		lista1.add(cIbiza);
		lista1.add(cHyundai);
		//Imprimim lista1 amb criteri FIFO
		while(!lista1.isEmpty()){
			System.out.println(lista1.pollFirst());
		}
		
		
	
		//Afegim els objectes de la classe Cotxe al segon TreeSet
		lista2.add(cAlfa);
		lista2.add(cDacia);
		lista2.add(cFord);
		lista2.add(cOpel);
		lista2.add(cIbiza);
		lista2.add(cHyundai);
		System.out.println("\n");
		//Imprimim lista2 amb criteri LIFO
		while(!lista2.isEmpty()){
			System.out.println(lista2.pollLast());
		}
		//Definim 6 objectes de la classe CotxePot
		CotxePot cAlfaP = new CotxePot("Alfa Romeo", "Giulia", 2900, 6);
		CotxePot cDaciaP = new CotxePot("Dacia", "Sandero", 1200, 4);
		CotxePot cFordP = new CotxePot("Ford", "Focus", 2000, 4);
		CotxePot cOpelP = new CotxePot("Opel", "Insignia", 2200, 4);
		CotxePot cIbizaP = new CotxePot("Seat", "Ibiza", 1600, 4);
		CotxePot cHyundaiP = new CotxePot("Hyundai", "Atos", 1500, 3);
		//Afegim els objectes de la classe CotxePot al tercer TreeSet
		lista3.add(cAlfaP);
		lista3.add(cDaciaP);
		lista3.add(cFordP);
		lista3.add(cOpelP);
		lista3.add(cIbizaP);
		lista3.add(cHyundaiP);
		System.out.println("\n");
		//Imprimim lista3 amb criteri FIFO
		while(!lista3.isEmpty()){
			System.out.println(lista3.pollFirst());
		}
		//Afegim els objectes de la classe CotxePot al quart TreeSet
		lista4.add(cAlfaP);
		lista4.add(cDaciaP);
		lista4.add(cFordP);
		lista4.add(cOpelP);
		lista4.add(cIbizaP);
		lista4.add(cHyundaiP);
		System.out.println("\n");
		//Imprimim lista4 amb criteri LIFO
		while(!lista4.isEmpty()){
			System.out.println(lista4.pollLast());
		}
	}

}
