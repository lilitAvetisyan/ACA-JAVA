package Factory;

/**
 * Created by Lill on 9/27/16.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){

        if(choice.equalsIgnoreCase("ENTITY")){
            return new EntityFactory();

        }else if(choice.equalsIgnoreCase("BRAND")){
            return new BrandFactory();
        }

        return null;
    }
}
