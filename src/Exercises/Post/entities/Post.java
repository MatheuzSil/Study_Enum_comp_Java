package Exercises.Post.entities;

public class Post {
    private String title;
    private String content;
    private Integer likes;

    public Post(String title, String content, Integer likes){
        this.title = title;
        this.content = content;
        this.likes = likes;
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

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }
}
