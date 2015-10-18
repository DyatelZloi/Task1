package sorting;

import java.util.Comparator;

import products.Product;

public class SortByName implements Comparator <Product>{

    @Override
    public int compare(Product arg0, Product arg1) {
        String name1 = arg0.getName();
        String name2 = arg1.getName();
        return name1.compareToIgnoreCase(name2);
    }
}
