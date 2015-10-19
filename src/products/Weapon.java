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
	 * initialization of variables {@link Weapon.name} {@link Weapon.damageType} {@link Weapon.cost} {@link Weapon.weight}
	 * 
	 * @param name name of the Weapon
	 * @param damageType damageType of the Weapon
	 * @param cost cost of the Weapon
	 * @param weight weight of the Weapon
	 */
    public Weapon (String name, String damageType, int cost, int weight){
        this.name = name;
        this.damageType = damageType;
        this.cost = cost;
        this.weight = weight;
    }

	/**
	 * @return the damageType of Weapon
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
