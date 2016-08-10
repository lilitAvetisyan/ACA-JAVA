
public abstract class Animal
{
    //    private boolean isAPet;
    private int yearsToLive;
    private Size size;

    public Animal( int yearsToLive, Size size)
    {
        this.yearsToLive = yearsToLive;
        this.size = size;
    }
//    public abstract void voice();

    @Override
    public String toString()
    {
        return "Animal  \nUsually dies at age: " + yearsToLive + "\nhas this size parameters: " + size;
    }

}