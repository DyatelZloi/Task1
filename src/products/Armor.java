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
	 * @return the protection of armor
	 */
    public int getProtection() {
		return protection;
	}

    /**
     * 
     * @param set the protection of armor
     */
	public void setProtection(int protection) {
		this.protection = protection;
	}

	/**
	 * initialization of  variables name, cost, weight, protection
	 * 
	 * @param name name of the armor
	 * @param cost cost of the armor
	 * @param weight weight of the armor
	 * @param protection protection of the armor
	 */
	public Armor (String name, int cost, int weight, int protection){
        this.name = name;
        this.cost = cost;
        this.weight = weight;
        this.protection = protection;
    }
}
