package adding;
import java.util.List;

import products.Armor;
import products.Product;


public class AddArmor implements Adding {

	@Override
	public void execute(List <Product> equipment, String name, String form, int cost, int weight,
			int width, int height, int wigth) {
		// TODO Auto-generated method stub
		equipment.add(new Armor(name, cost, weight, height));
		
	}
}
