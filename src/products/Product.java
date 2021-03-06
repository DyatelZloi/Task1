package products;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nikifor_Malkov on 18-Oct-15.
 *
 * @author Nikifor Malkov
 */
public class Product {
	
	/**
	 * Total cost of the product
	 */
    private static int totalCost;
    
	/**
     * Total names of the product
     */
    private static String totalName;
    
	/**
	 * Cost of product
	 */
    protected int cost;
    
    /**
     * Weight of product
     */
    protected int weight;
    
    /**
     * Name of product
     */
    protected String name;
    
    /**
     * 
     */
    Product(){
    }
	
    /**
     * initialization of  variables name, cost
     * 
     * @param name of product
     * @param cost of product
     */
    public Product (String name, int cost){
        this.name = name;
        this.cost = cost;
    }

	/**
	 * @return the cost of product
	 */
	public int getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(int cost) {
		this.cost = cost;
	}

	/**
	 * @return the weight of product
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	/**
	 * @return the name of product
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
     * 
     * @return toralCost of products
     */
    public static int getTotalCost() {
		return totalCost;
	}

    /**
     * 
     * @return totalName of products
     */
	public static String getTotalName() {
		return totalName;
	}
		
	/**
     * Calculate the full cost
     * 
     * @param productList that will be calculated
     */
    public static int totalCost(List<Product> productList){
    	for (Product product : productList)
            totalCost += product.getCost();
    	return getTotalCost();
    }
    
    /**
     * convert to a string
     */
    @Override
	public String toString() {
		return "Product [name = " + this.name + ", cost = " + this.cost + ", weight = " + this.weight + "]";
	}
    
    /**
     * 
     * @param productList the List to be searched
     * @param minCost set min cost
     * @param maxCost set max cost
     */
    public static List<Product> searchByCost(List<Product> productList, int minCost, int maxCost){
    	ArrayList <Product> outputList = new ArrayList <Product>();
		for(Product product : productList)
    		if (product.getCost() > minCost && product.getCost() < maxCost)
    			outputList.add(product);
		return outputList;	
    }
}
