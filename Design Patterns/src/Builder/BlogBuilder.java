package Builder;

/**
 * Created by Lill on 9/27/16.
 */
interface BlogBuilder {

    BlogBuilder initBlog();
    BlogBuilder addHeader(String header);
    BlogBuilder addFooter(String footer);
    BlogBuilder addRightPane (String pane);
    BlogBuilder addLeftPane(String pane);
    BlogBuilder addMiddleSection(String section);

    void validateBlog();
    Blog buildBlog();

}
