package il.co.sahar.view;

import java.io.Serializable;
import java.util.Objects;

public class BlogPost extends BaseEntity implements Serializable {
    private String author;
    private String title;
    private String content;
    private long date;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BlogPost blogPost = (BlogPost) o;
        return date == blogPost.date && Objects.equals(author, blogPost.author) && Objects.equals(title, blogPost.title) && Objects.equals(content, blogPost.content);
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public BlogPost(String idFs, String author, String title, String content, long date) {
        super(idFs);
        this.author = author;
        this.title = title;
        this.content = content;
        this.date = date;
    }
}
