package adding;
import java.util.List;

import products.Product;
import products.Weapon;

public class AddWeapon implements Adding {

	@Override
	public void execute(List <Product> equipment, String name, String form, int cost, int weight,
			int width, int height, int wigth) {
		
		// TODO Auto-generated method stub
		equipment.add(new Weapon(name, form, cost, weight));
	}
}
