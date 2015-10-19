
import java.util.ArrayList;
import forge.Smith;
import products.Armor;
import products.Product;
import products.Shield;
import products.Weapon;
import sorting.SortByWeight;
import sorting.SortByName;

/**
 * Created by Nikifor_Malkov on 18-Oct-15.
 *
 * @author Nikifor Malkov
 */
public class Main {

	/**
     * Application starting point.
     *
     * @param args input arguments array
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Product> equipment = new ArrayList <Product>();
		equipment.add(new Armor("Steel breastplate", 10, 20, 60));
		equipment.add(new Weapon("Sword", "Colome-cutting", 5, 5));
		equipment.add(new Armor("Shoulders", 1, 1, 1));
		equipment.add(new Weapon("Sword2", "Colome-cutting", 10, 2));
		equipment.add(new Shield("Shield", "Round", 2, 2, 2, 2, 2));
		System.out.println("without sorting :");
		Product.print(equipment);
		equipment.sort(new SortByWeight());
        System.out.println("with sorting :");
        Product.print(equipment);
        Product.totalCost(equipment);
        System.out.println("Search :");
        Product.searchByCost(equipment, 0, 10);
        equipment.sort(new SortByName());
        System.out.println("with sorting :");
        Product.print(equipment);
	}
}
