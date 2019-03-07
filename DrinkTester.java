import java.util.ArrayList;

/**
 * 
 * @author Bryan Williams
 * When the application starts add 3 drink instances to a list or array, one should be Orange Juice 
 * of type juice (not carbonated, made from oranges), one should be Budweiser of type beer (carbonated, 5% alcohol) 
 * and the third should be Pepsi of type soda (carbonated). Then loop through the list/array and output the 
 * description of all 3 drinks, I expect it to display something like: “Orange Juice, not carbonated, made from 
 * oranges. Budweiser, carbonated, 5%. Pepsi, carbonated.”
 *
 */

public class DrinkTester {

	public static void main(String[] args) {
		ArrayList<Object> Drinks = new ArrayList<>();
		
		Juice juice = new Juice("Orange Juice", false, "made from oranges");
		Beer beer = new Beer("Budweiser", true, "5%");
		Soda soda = new Soda("Pepsi", true);
		
		Drinks.add(juice);
		Drinks.add(beer);
		Drinks.add(soda);
		
		for(Object i : Drinks) {
			System.out.println(i.toString());
		}
		
	}
	
}