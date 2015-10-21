package adding;
import java.util.List;

import products.Armor;
import products.Product;

/**
 * Created by Nikifor_Malkov on 20-Oct-15.
 *
 * @author Nikifor Malkov
 */
public class AddArmor implements Adding {

	@Override
	public void execute(List <Product> equipment, String name, String form, int cost, int weight,
			int width, int height, int wigth) {
		// TODO Auto-generated method stub
		equipment.add(new Armor(name, cost, weight, height));
		
	}
}
