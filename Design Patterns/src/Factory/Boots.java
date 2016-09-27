package Factory;

/**
 * Created by Lill on 9/27/16.
 */
public class Boots implements Entity {
    @Override
    public void returnNikeEntity() {
        System.out.println("Returning Nike  Boots");

    }

    @Override
    public void returnAdidasEntity() {
        System.out.println("Returning Adidas  Boots");

    }
}
