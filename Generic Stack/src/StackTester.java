/**
 * Created by Lill on 8/31/16.
 */
public class StackTester {
    public static void main(String []args)
    {
        Stack<Integer> stackOfInt  = new Stack<Integer>(5);

        stackOfInt.push(1);
        stackOfInt.push(2);
        stackOfInt.push(3);
        stackOfInt.push(4);
        stackOfInt.push(5);
        stackOfInt.push(6);

        while (!stackOfInt.isEmty())
        {
            System.out.println(stackOfInt.pop());

        }



    }
}
