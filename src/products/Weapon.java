package products;

/**
 * Created by Nikifor_Malkov on 18-Oct-15.
 * Weapon extends class Product
 * @author Nikifor Malkov
 */
public class Weapon extends Product{
	
	/**
	 * Sets the damage type
	 */
	protected String damageType;
	
	/**
	 * initialization of variables name, damageType, cost, weight
	 * 
	 * @param name
	 * @param damageType
	 * @param cost
	 * @param weight
	 */
    public Weapon (String name, String damageType, int cost, int weight){
        this.name = name;
        this.damageType = damageType;
        this.cost = cost;
        this.weight = weight;
    }

	/**
	 * @return the damageType
	 */
	public String getDamageType() {
		return damageType;
	}

	/**
	 * @param damageType the damageType to set
	 */
	public void setDamageType(String damageType) {
		this.damageType = damageType;
	}
}
