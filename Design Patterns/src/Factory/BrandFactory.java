package Factory;

/**
 * Created by Lill on 9/27/16.
 */
public class BrandFactory extends AbstractFactory {
    @Override
    Brand getBrand(String brand) {
        if (brand == null)
            return null;
        if (brand.equalsIgnoreCase("NIKE"))
            return new Nike();
        else if (brand.equalsIgnoreCase("ADIDAS"))
            return new Adidas();

        return null;
    }

    @Override
    Entity getEntity(String entity) {
        return null;
    }
}
