
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
		equipment.add(new Armor("Нагрудник", 10, 20, 60));
		equipment.add(new Weapon("Меч", "Колоще-режущее", 5, 5));
		equipment.add(new Armor("Наплечник", 1, 1, 1));
		equipment.add(new Weapon("Меч2", "Колоще-режущее", 10, 2));
		equipment.add(new Shield("Щит", "Круглый", 2, 2, 2, 2, 2));
		System.out.println("Без сортировки :");
		Smith.print(equipment);
		equipment.sort(new SortByWeight());
        System.out.println("C сортировкой :");
        Smith.print(equipment);
        Product.totalCost(equipment);
        System.out.println("Поиск :");
        Smith.searchByCost(equipment, 0, 10);
        equipment.sort(new SortByName());
        System.out.println("C сортировкой :");
        Smith.print(equipment);
	}
}
