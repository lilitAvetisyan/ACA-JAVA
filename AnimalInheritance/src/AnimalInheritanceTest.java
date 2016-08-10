/**
 * Created by Lill on 8/10/16.
 */
public class AnimalInheritanceTest
{
    public static void main(String[] args)
    {
        Size dogSize = new Size(15, 70, 70);
        Dog dog = new Dog(10, dogSize,"Black", "Bark", true);

        Size fishSize = new Size(1, 10, 5);
        Fish fish = new Fish(5, fishSize, "White", "Sea");


        Animal zoo[] = new Animal[2];
        zoo[0] = fish;
        zoo[1] = dog;

        for (Animal a: zoo)
        {
            System.out.println(a);
            System.out.println();
        }


    }
}
