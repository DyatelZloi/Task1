package adding;

import java.util.List;

import products.Product;

public interface Adding {
	
	public void execute(List<Product> equipment, String name, String form, int cost,
			int weight, int width, int height, int wigth);
}
/**
*equip.add(new Armor("Shoulders", 1, 1, 1));
*equip.add(new Weapon("Sword2", "Colome-cutting", 10, 2));
*equip.add(new Shield("Shield", "Round", 2, 2, 2, 2, 2));
*/