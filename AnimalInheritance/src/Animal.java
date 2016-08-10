
public abstract class Animal
{
    //    private boolean isAPet;
    private int yearsToLive;
    private String color;
    private Size size;

    public Animal( int yearsToLive, Size size, String color)
    {
        this.yearsToLive = yearsToLive;
        this.size = size;
        this.color = color;
    }
//    public abstract void voice();

    @Override
    public String toString()
    {
        return "Here is information about this animal  \nIt usually dies at age: " + yearsToLive + "\nIt has this color: " + color + "\nIt has this size parameters: " + size;
    }

}