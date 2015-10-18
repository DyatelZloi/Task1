package products;

public class Shield extends Product{
	
	/**
	 * form of the Shield
	 */
	protected String form;
	
	/**
	 * Height of the Shield
	 */
	protected int height;
	
	/**
	 * Wigth of the Shield
	 */
	protected int wigth;
	
	/**
	 * Create Weapon
	 * 
	 * @param name
	 * @param damageType
	 * @param cost
	 * @param weight
	 * @param wigth 
	 */
    public Shield (String name, String form, int cost, int weight, int height, int width, int wigth){
        this.name = name;
        this.form = form;
        this.cost = cost;
        this.weight = weight;
        this.height = height;
        this.wigth = wigth;
    }

	/**
	 * @return the form
	 */
	public String getForm() {
		return form;
	}

	/**
	 * @param form the form to set
	 */
	public void setForm(String form) {
		this.form = form;
	}
}
