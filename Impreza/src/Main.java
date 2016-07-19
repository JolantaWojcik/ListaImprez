import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	/*
	 * Stworz klase Impreza (nazwa, data[String], koszt, liczba uczestnikow)
	 * w manie stworz liste Imprez (5-10 imprez) a nastepnie:
	 * - znajdz najdrozsza impreze
	 * - znajdz najtansza impreze
	 * - wypisz wszystkie imprezy ktorych koszt jest wieksz niz 3000pln
	 * - usun imprezy ktorych liczba uczestnikow jest wieksza niz 1000
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Impreza> impreza = new ArrayList<>();
		Impreza imprezaObject = new Impreza();	
		List<Integer> listOfCosts = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			imprezaObject.setName("jakas impreza");
			imprezaObject.setDate("18/7/2016");
			imprezaObject.setCost((int) (Math.random() * 10000));
			imprezaObject.setNumberOfMembers((int) (Math.random() * 10000));
			
			listOfCosts.add(imprezaObject.getCost());
		
			impreza.add(new Impreza( imprezaObject.getName(), imprezaObject.getDate(), 
				imprezaObject.getCost(), imprezaObject.getNumberOfMembers()));
		}
		
		impreza.forEach(System.out::println);
		System.out.println("#####");
		
		//1.
		int max = Collections.max(listOfCosts);
		for(Impreza i : impreza){
			if(i.getCost()==max){
				System.out.println("Najdrozsza impreza kosztuje: "+ max);
			}
		}
		
		//2.
		int min = Collections.min(listOfCosts);
		for(Impreza i : impreza){
			if(i.getCost()==min){
				System.out.println("Najtansza impreza kosztuje: "+ min);
			}
		}
		
		//3.
		for(Impreza i : impreza){
			if(i.getCost()>3000){
				System.out.println("Powyzej 3000: "+ i.getCost() + " "+ i.getName());
			}
		}
		
		//4. 
		impreza.removeIf(cena -> cena.getCost()>1000);
		
		System.out.println("#####");
		impreza.forEach(System.out::println);

	}

}
