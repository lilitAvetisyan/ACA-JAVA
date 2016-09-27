package Factory;

/**
 * Created by Lill on 9/27/16.
 */
public class Socks implements Entity {
    @Override
    public void returnEntity() {
        System.out.println("Returning Socks");
    }

}
