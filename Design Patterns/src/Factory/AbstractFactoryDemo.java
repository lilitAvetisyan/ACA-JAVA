package Factory;

/**
 * Created by Lill on 9/27/16.
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {

        AbstractFactory brandFactory = new BrandFactory();
        AbstractFactory entityFactory = new EntityFactory();

        Entity boots = entityFactory.getEntity("BOOTS");
        boots.returnEntity();
        Brand  brand1 = brandFactory.getBrand("NIKE");
        brand1.returnBrand();

        Entity tops = entityFactory.getEntity("TOPS");
        tops.returnEntity();
        Brand brand2 = brandFactory.getBrand("ADIDAS");
        brand2.returnBrand();


    }
}
