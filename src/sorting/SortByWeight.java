package sorting;

import java.util.Comparator;
import products.Product;

/**
 * Created by Nikifor_Malkov on 18-Oct-15.
 * SortByWeight implements class Comparator
 * @author Nikifor Malkov
 */
public class SortByWeight implements Comparator <Product>{

	/**
	 * 
	 */
	public int compare(Product arg0, Product arg1) {
			
		int price1 = arg0.getWeight();
	    int price2 = arg1.getWeight();
	        
	    if(price1 > price2) 
	        return 1;
	    else if(price1 < price2) 
	        return -1;
	    else 
	        return 0;
	}
}
