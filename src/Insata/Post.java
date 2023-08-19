package Insata;

import Insata.Comment;

import java.time.LocalDate;
import java.util.Arrays;

public  class Post{
    private String image;
    private String description;
    private LocalDate created;
    private Comment[] comments;
    private static int nextId = 1;
    private int id;

    public Post(String image, String description, LocalDate created, Comment[] comments) {
        this.image = image;
        this.description = description;
        this.created = created;
        this.comments = comments;
        this.id = nextId++;

    }
    public int getId() {
        return id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public Comment[] getComments() {
        return comments;
    }

    public void setComments(Comment[] comments) {
        this.comments = comments;
    }



    @Override
    public String toString() {
        return "           Пост" +'\n' +
                "Фото: "+'\n'  + image + '\n' +
                "Описание фото: " + description +'\n' +
                "Дата публикаци: " + created +'\n' +
                "Коментарии: " + Arrays.toString(getComments());

    }
}
