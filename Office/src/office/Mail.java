package office;

/**
 * Created by Lill on 8/13/16.
 */
public interface Mail {
    int unreadInboxNumber();
    URL url();
    Person owner();

    void logIn();
    void logOut();

}
