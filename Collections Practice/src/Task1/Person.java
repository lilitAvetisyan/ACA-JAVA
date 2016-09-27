package Task1;

/**
 * Created by Lill on 9/22/16.
 */
public class Person {
    String firstName;
    String lastName;
    int idNumber;
    String phoneNumber;



    public Person (String firstName, String lastName, int idNumber, String phoneNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
    }

    public void printInfo ()
    {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber
                        + "\nPhone Numer: " + phoneNumber);
    }

}
