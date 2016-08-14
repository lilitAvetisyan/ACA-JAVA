package office;

/**
 * Created by Lill on 8/13/16.
 */
public interface PowerPoint {
    int slidesNumber();
    int currentSlideNumber();
    Person presenter();

    void beginPresentation();
    void endPresentation();

}
