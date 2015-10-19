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
	 * initialization of  variables name, form, cost, weight, width, height, wigth
	 * 
	 * @param name name of the Shield
	 * @param form form of the Shield
	 * @param cost cost of the Shield
	 * @param weight weight of the Shield
	 * @param wigth width of the Shield
	 */
    public Shield (String name, String form, int cost, int weight, int width, int height, int wigth){
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
