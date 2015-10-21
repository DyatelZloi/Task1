
import java.util.ArrayList;
import java.util.Collections;

import adding.AddArmor;
import adding.AddShield;
import adding.AddWeapon;
import forge.Equipment;
import products.Product;
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
		Equipment equip = new Equipment(new ArrayList <Product>());
		equip.setStrategy(new AddWeapon());
		equip.executeStrategy(equip.getEquipment(), "Sword1", "Colome-cutting", 5, 5, 0, 0, 0);
		equip.setStrategy(new AddShield());
		equip.executeStrategy(equip.getEquipment(), "Shield", "Round", 2, 2, 2, 2, 2);
		equip.setStrategy(new AddWeapon());
		equip.executeStrategy(equip.getEquipment(), "Sword2", "Colome-cutting", 5, 5, 0, 0, 0);
		equip.setStrategy(new AddArmor());
		equip.executeStrategy(equip.getEquipment(), "Steel breastplate", null, 10, 20, 60, 0, 0);
		equip.setStrategy(new AddArmor());
		equip.executeStrategy(equip.getEquipment(), "Shoulders", null, 1, 1, 1, 0, 0);
		System.out.println("without sorting :");
		Equipment.printEquipment(equip.getEquipment());
		Collections.sort(equip.getEquipment(), new SortByWeight());
        System.out.println("with sorting :");
        Equipment.printEquipment(equip.getEquipment());
        System.out.println("Total cost = " + Product.totalCost(equip.getEquipment()));
        System.out.println("Search :");
        Product.searchByCost(equip.getEquipment(), 0, 10);
        Collections.sort(equip.getEquipment(),new SortByName());
        System.out.println("with sorting :");
        Equipment.printEquipment(equip.getEquipment());
	}
}
