package set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;
import java.util.TreeSet;

public class set {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<String> parkingLot = new HashSet<String>();
		
		
		
		while(true) {
			String input = sc.nextLine();
			if (input.equals("End")) {
				break;
				
			}else {
				String[] reminder = input.split(", ");
			if (reminder[0].equals("IN")) {
				parkingLot.add(reminder[1]);
				System.out.println(parkingLot.size());
			}else {
				parkingLot.remove(reminder[1]);
				System.out.println(parkingLot.size());
			}
				
			}
		}
		Iterator parkingLotIterator   = parkingLot.iterator();
		while(parkingLotIterator.hasNext()) {
			System.out.println(parkingLotIterator.next());
		}
    
	}

}
