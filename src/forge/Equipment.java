package forge;

import java.util.ArrayList;
import java.util.List;

import adding.Adding;
import products.Product;


public class Equipment {
	
	private ArrayList <Product> equipment = new ArrayList <Product>();
	private Adding adding;
	
	public void add(List <Product> equipment, Product product1){
		equipment.add(product1);
	}
	
	/**
     * printing list of products
     * @param productList list of Product needs to be printed
     */
    public static void printEquipment (List<Product> productList){
    	for (Product product : productList) 
            System.out.println(product.toString());
    }

	/**
	 * @return the equipment
	 */
	public ArrayList <Product> getEquipment() {
		return equipment;
	}

	/**
	 * @param equipment the equipment to set
	 */
	public void setEquipment(ArrayList <Product> equipment) {
		this.equipment = equipment;
	}

	public void setStrategy(Adding adding) {
        this.adding = adding;
    }
	
	public void executeStrategy(List <Product> equipment, String name, String form, int cost, int weight, int width, int height, int wigth) {
        adding.execute(equipment, name, form, cost, weight, width, height, wigth);
    }
}
