package Factory;

/**
 * Created by Lill on 9/27/16.
 */
public abstract class AbstractFactory {
    abstract Brand getBrand(String brand);
    abstract Entity getEntity(String entity);
}
