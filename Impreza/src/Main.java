import java.util.ArrayList;
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
		
		for (int i = 0; i < 10; i++) {
			imprezaObject.setName("jakas impreza");
			imprezaObject.setDate("18/7/2016");
			imprezaObject.setCost((int) (Math.random() * 10000));
			imprezaObject.setNumberOfMembers((int) (Math.random() * 10000));
		
			impreza.add(new Impreza( imprezaObject.getName(), imprezaObject.getDate(), 
				imprezaObject.getCost(), imprezaObject.getNumberOfMembers()));
		}
		
		impreza.forEach(System.out::println);
		System.out.println("#####");
		
		for(int i=0; i<impreza.size()-1; i++){
			if(impreza.get(i).getCost()>3000){
				System.out.println("Powyzej 3000: "+ impreza.get(i));
			}
			if(impreza.get(i).getCost()>impreza.get(i+1).getCost()){
				System.out.println("Najdrozsza: "+ impreza.get(i));
			}
		//	if(impreza.get(i).getCost()<impreza.get(i+1).getCost()){
			//	System.out.println("Najtansza: "+ impreza.get(i));
			//}
		}
		impreza.removeIf(cena -> cena.getCost()>1000);
		
		System.out.println("#####");
		impreza.forEach(System.out::println);

	}

}
