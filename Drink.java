/** 
 * @author Bryan Williams
 * 
 * Create an application that demonstrates your object orientated skills and that follows normal 
 * coding standards as you understand them (e.g. naming conventions etc). The application should 
 * display information about three drink types. The three drink types should be beer, juice and 
 * soda derived from a common drink object that has base properties that indicate the drink name, 
 * whether it is carbonated and a calculated description of the drink. The juice derived type should 
 * have a string property that indicates the fruit the juice it is made from, and the beer should have 
 * a property that indicates the alcohol content. The description should be overridden in each type so 
 * that for a soda it includes the soda name and if it is carbonated, a juice should also include the
 * fruit name, a beer should add the alcohol content.
 * 
 */

public class Drink {
	
	/**
	 * Private variables
	 */
	private String drinkName;
	private Boolean isCarbonated;
	private String drinkDescription;
	
	/**
	 * Constructor
	 * @param drinkName
	 * @param isCarbonated
	 */
	public Drink(String drinkName, Boolean isCarbonated) {
		setDrinkName(drinkName);
		setIsCarbonated(isCarbonated);
	}
	
	/**
	 * Overridden Constructor
	 * @param drinkName
	 * @param isCarbonated
	 * @param drinkDescription
	 */
	public Drink(String drinkName, Boolean isCarbonated, String drinkDescription) {
		setDrinkName(drinkName);
		setIsCarbonated(isCarbonated);
		setDrinkDescription(drinkDescription);
	}
	
	/**
	 * Getter method returns name of drink
	 * @return drinkName
	 */
	public String getDrinkName() {
		return drinkName;
	}
	
	/**
	 * Setter method sets name of drink
	 * @param drinkName
	 */
	public void setDrinkName(String drinkName) {
		this.drinkName = drinkName;
	}
	
	/**
	 * Getter method returns true if drink is carbonated and false if not
	 * @return isCarbonated
	 */
	public String getIsCarbonated() {
		if(isCarbonated == true) {
			return "carbonated";
		} else {
			return "not carbonated";
		}
	}
	
	/**
	 * Setter method sets true if drink is carbonated and false if not
	 * @param isCarbonated
	 */
	public void setIsCarbonated(Boolean isCarbonated) {
		this.isCarbonated = isCarbonated;
	}
	
	/**
	 * Getter method gets description of drink
	 * @return drinkDescription
	 */
	public String getDrinkDescription() {
		return drinkDescription;
	}
	
	/**
	 * Setter method sets drink description
	 * @param drinkDescription
	 */
	public void setDrinkDescription(String drinkDescription) {
		this.drinkDescription = drinkDescription;
	}
	
	@Override
	public String toString() {
		if (getDrinkDescription() != null) {
			return (this.getDrinkName() + ", " + this.getIsCarbonated() + ", " +
					this.getDrinkDescription() + ".");
		} else {
			return (this.getDrinkName() + ", " + this.getIsCarbonated() + ".");
		}
	}
	
}