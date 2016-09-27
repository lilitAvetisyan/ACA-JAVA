package Builder;

/**
 * Created by Lill on 9/27/16.
 */
public class SomeBlogBuilder implements BlogBuilder {

    private Blog blog;

    @Override
    public BlogBuilder initBlog() {
        blog = new Blog();
        return  this;
    }

    @Override
    public BlogBuilder addHeader(String header) {
        this.blog.setHeader(header);
        return this;
    }

    @Override
    public BlogBuilder addFooter(String footer) {
        this.blog.setFooer(footer);
        return this;
    }

    @Override
    public BlogBuilder addRightPane(String pane) {
        this.blog.setRightPane(pane);
        return this;
    }

    @Override
    public BlogBuilder addLeftPane(String pane) {
        this.blog.setLeftPane(pane);
        return this;
    }

    @Override
    public BlogBuilder addMiddleSection(String section) {
        this.blog.setMiddleSection(section);
        return this;
    }

    @Override
    public void validateBlog() {
    }

    @Override
    public Blog buildBlog() {
        validateBlog();
        return blog;
    }
}
