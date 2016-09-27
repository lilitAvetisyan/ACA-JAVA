package Factory;

/**
 * Created by Lill on 9/27/16.
 */
public class EntityFactory extends AbstractFactory {

    @Override
    String getBrand(String brand) {
        return null;
    }

    @Override
    Entity getEntity(String entity) {
        if (entity == null)
            return null;
        if (entity.equalsIgnoreCase("BOOTS"))
            return new Boots();
        else if (entity.equalsIgnoreCase("TOPS"))
            return  new Tops();
        else if (entity.equalsIgnoreCase("PANTS"))
            return new Pants();
        else if (entity.equalsIgnoreCase("SOCKS"))
            return new Socks();

        return null;

    }
}
