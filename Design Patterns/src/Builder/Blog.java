package Builder;

/**
 * Created by Lill on 9/27/16.
 */
public class Blog {
    private String header;
    private String fooer;
    private String rightPane;
    private String leftPane;
    private String middleSection;

    Blog(){}

    void setFooer(String fooer) {
        this.fooer = fooer;
    }

    void setHeader(String header) {
        this.header = header;
    }

    void setLeftPane(String leftPane) {
        this.leftPane = leftPane;
    }

    void setMiddleSection(String middleSection) {
        this.middleSection = middleSection;
    }

    void setRightPane(String rightPane) {
        this.rightPane = rightPane;
    }

    private static class BlogDirector{
        public Blog buildAnotherBlog(BlogBuilder builder)
        {
            return builder.initBlog().addHeader("The Header").addFooter("The Footer").addMiddleSection("My middle section").buildBlog();
        }
    }
}
