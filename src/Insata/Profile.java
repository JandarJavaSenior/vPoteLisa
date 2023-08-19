package Insata;

import Insata.Post;

import java.time.LocalDate;
import java.util.Arrays;

public class Profile{
    private String full_name;
    private LocalDate data_of_birth;
    private String gender;
    private String bio;
    private Post[] posts;
    private int id;


    public Profile(String full_name, LocalDate data_of_birth, String gender, Post[] posts) {
        this.full_name = full_name;
        this.data_of_birth = data_of_birth;
        this.gender = gender;
        this.posts = posts;


    }

    public String getFull_name() {
        return full_name;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public LocalDate getData_of_birth() {
        return data_of_birth;
    }

    public void setData_of_birth(LocalDate data_of_birth) {
        this.data_of_birth = data_of_birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Post[] getPosts() {
        return posts;
    }

    public void setPosts(Post[] posts) {
        this.posts = posts;
    }

    public void commentsssss(int idPost){
        for (Post pp: posts) {
            if (pp.getId()==idPost) {
                System.out.println("Фото!!!\n");
                System.out.println(pp.getImage());
                System.out.println("Описание фотогорафии!\n");
                System.out.println(pp.getDescription());
                System.out.println(Arrays.toString(pp.getComments()));
            }
        }

    }

    public void updateComment(int id, String newText) {
        for (int i = 0; i < posts.length; i++) {
            Comment[] comments = posts[i].getComments();
            for (int j = 0; j < comments.length; j++) {
                if (comments[j].getId() == id) {
                    comments[j].setText(newText);
                    System.out.println("Комментарий обновлен!");
                    System.out.println(newText);
                    return;
                }
            }
        }
        System.out.println("Комментарий с id " + id + " не найден.");
    }


    public void deleteComment(Comment commentToDelete) {
        for (int i = 0; i < posts.length; i++) {
            Comment[] comments = posts[i].getComments();
            for (int j = 0; j < comments.length; j++) {
                if (comments[j] == commentToDelete) {
                    System.arraycopy(comments, j + 1, comments, j, comments.length - j - 1);
                    comments[comments.length - 1] = null;
                    System.out.println("Комментарий удален.");
                    return;
                }
            }
        }
        System.out.println("Указанный комментарий не найден.");
    }



    @Override
    public String toString() {
        return "           Профиль " +'\n' +
                "Имя: " + full_name + '\n' +
                "Дата рождения: " + data_of_birth +'\n'+
                "Пол: " + gender + '\n' +
                "Биография: " + bio + '\n' +
                "Посты: " +"количество постов : 3"+'\n'+
                "ID пользователя: " + id +'\n';
    }
}
