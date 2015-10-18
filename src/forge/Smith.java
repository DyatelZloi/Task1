package forge;

import java.util.ArrayList;
import java.util.List;
import products.Product;

/**
 * Created by Nikifor_Malkov on 18-Oct-15.
 *
 * @author Nikifor Malkov
 */
    public class Smith {
    
    /**
     * 
     * @param productList 
     */
    public static void print (List<Product> productList){
    	for (Product product : productList) 
            System.out.println(product.toString());
    }
    
    /**
     * 
     * @param productList set List
     * @param min set min cost
     * @param max set max cost
     */
    public static void searchByCost(List<Product> productList, int min, int max){
    	ArrayList <Product> outputList = new ArrayList <Product>();
		for(Product product : productList)
    		if (product.getCost() > min && product.getCost() < max)
    			outputList.add(product);
		for (Product product : outputList)
			System.out.println(product.toString());
			
    }
}
