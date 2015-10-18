package products;

/**
 * Created by Nikifor_Malkov on 18-Oct-15.
 * Armor extends class Product
 * @author Nikifor Malkov
 */
public class Armor extends Product{
	
	/**
	 * Determines the protection of the armor
	 */
	protected int protection;
	
	/**
	 * 
	 * @return the protection
	 */
    public int getProtection() {
		return protection;
	}

    /**
     * 
     * @param set the protection
     */
	public void setProtection(int protection) {
		this.protection = protection;
	}

	/**
	 * initialization of  variables {@link Armor.name} {@link Armor.cost} {@link Armor.weight} {@link Armor.protection}
	 * 
	 * @param name name of armor
	 * @param cost cost of armor
	 * @param weight weight of armor
	 * @param protection protection of the armor
	 */
	public Armor (String name, int cost, int weight, int protection){
        this.name = name;
        this.cost = cost;
        this.weight = weight;
        this.protection = protection;
    }
}
