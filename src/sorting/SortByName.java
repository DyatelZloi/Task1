package sorting;

import java.util.Comparator;

import products.Product;

/**
 * Created by Nikifor_Malkov on 19-Oct-15.
 * SortByWeight implements class Comparator
 * @author Nikifor Malkov
 */
public class SortByName implements Comparator <Product>{

    @Override
    public int compare(Product arg0, Product arg1) {
        String name1 = arg0.getName();
        String name2 = arg1.getName();
        return name1.compareToIgnoreCase(name2);
    }
}
