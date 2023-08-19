package Insata;

import java.util.Arrays;

public class DataBase {
    private UserName[] userName;
    private Profile[] profile;


    public DataBase(UserName[] userName, Profile[] profile) {
        this.userName = userName;
        this.profile = profile;
    }

    public DataBase() {
        
    }

    

    public UserName[] getUserName() {
        return userName;
    }

    public void setUserName(UserName userName) {
        this.userName = new UserName[]{userName};
    }

    public Profile[] getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = new Profile[]{profile};
    }
    public void poiskPost(int id) {
        for (UserName user : userName) {
            for (Profile prof : user.getProfile()) {
                for (Post post : prof.getPosts()) {
                    if (post.getId() == id) {
                        System.out.println("Фото: ");
                        System.out.println(post.getImage());
                        System.out.println("Описание: ");
                        System.out.println(post.getDescription());
                        System.out.println("Коментарии: ");
                        for (Comment comment : post.getComments()) {
                            System.out.println(comment.getText());
                        }
                        return;
                    }
                }
            }
        }
    }
    public Post savePost(int id, Post possst) {
        for (UserName user : userName) {
            for (Profile prof : user.getProfile()) {
                if (user.getId() == id) {
                    Post[] posts = Arrays.copyOf(prof.getPosts(),prof.getPosts().length);
                    prof.setPosts(posts);
                    return possst;
                }
            }
        }
        return null;
    }

    public Comment saveComment(int idPost,int id, Comment coment ) {

            for (Profile prof : profile) {
                if (prof.getId() == id) {
                    for (int i = 0; i < prof.getPosts().length; i++) {
                        if(prof.getPosts()[i].getId()==idPost){
                            Comment [] comments = Arrays.copyOf(prof.getPosts()[i].getComments(),
                                    prof.getPosts()[i].getComments().length+1);
                            comments[comments.length-1]=coment;
                            prof.getPosts()[i].setComments(comments);
                            return coment;

                        }

                    }
                }
            }

        return null;
    }

    //    public Insata.Post [] savePost(int id, Insata.Post poost) {
//        for (int i = 0; i < userName.length; i++) {
//            if (userName[i].getId() == id) {
//                Insata.Post [] ppp = Arrays.copyOf(prof, profile.length + 1);
//                ppp[ppp.length - 1] = profileeeee;
//                profile = ppp;
//                return profile;
//            }
//        }
//        return null;
//    }
    public Comment poiskComent(int idComment, int profId) {
            for (Profile prof : profile) {
                if (prof.getId() == profId) {
                    for (Post post : prof.getPosts()) {
                        for (Comment comment : post.getComments()) {
                            if (comment.getId() == idComment) {
                                return comment;
                            }
                        }
                    }
                }
            }

        return null;
    }
    public Profile poiskProfile(int id) {
        for (UserName user: userName) {
             for (Profile prof :user.getProfile()) {

                 if (prof.getId()== id) {
                        return (prof);
                 }



             }

        }
        return null;

    }

    public void poiskUser(int id) {
        for (UserName user: userName) {

                if (user.getId()== id) {
                    System.out.println(user);
                }

        }
    }
    public void updeitPfofil (int id, Profile profileId){
        for (int i = 0; i < profile.length ; i++) {
            if (this.profile[i].getId()==id){
                this.profile[id] = profileId;
                System.out.println(profileId);
            }



        }
    }


    public UserName[] saveUser(UserName users) {
        for (UserName pp : this.userName) {
            if (!pp.equals(users)) {
                UserName[] ppp = new UserName[userName.length + 1];
                for (int i = 0; i < this.userName.length; i++) {
                    ppp[i] = this.userName[i];
                }
                ppp[ppp.length - 1] = users;
                userName = Arrays.copyOf(ppp, ppp.length);
                break;
            }
        }
        return this.userName;
    }

    public Profile[] saveProfilllll(int id, Profile profileeeee) {
        for (int i = 0; i < profile.length; i++) {
            if (profile[i].getId() == id) {
                Profile[] ppp = Arrays.copyOf(profile, profile.length + 1);
                ppp[ppp.length - 1] = profileeeee;
                profile = ppp;
                return profile;
            }
        }
        return null;
    }






    public  Profile[] deleteProffle(int id) {
        for (int i = 0; i <profile.length; i++) {
            if (profile[i].getId() == id) {
                for (int j = i; j < profile.length - 1; j++) {
                    profile[j] = profile[j + 1];
                }
                Profile[] profqq = Arrays.copyOf(profile, profile.length - 1);
                profile = profqq;
                System.out.println("Профиль с ID " + id + " удален.");
                return profile;
            }

        }
        return null;
    }








    public void deleteUzer(int id) {
        for (int i = 0; i < userName.length; i++) {
            if (userName[i].getId() == id) {
                for (int j = i; j < userName.length - 1; j++) {
                    userName[j] = userName[j + 1];
                }
                UserName[] userqq = Arrays.copyOf(userName, userName.length - 1);
                userName = userqq;
                System.out.println("Профиль с ID " + id + " удален.");
                return;
            }
        }
        System.out.println("Профиль с ID " + id + " не найден.");
    }

    public void deleteCommentById(int commentId) {
        for (int p = 0; p < userName.length; p++) {
        for (Profile prof : profile) {
            for (Post post : prof.getPosts()) {
                Comment[] comments = post.getComments();
                for (int i = 0; i < comments.length; i++) {
                    if (comments[i].getId() == commentId) {
                        for (int j = i; j < comments.length - 1; j++) {
                            comments[j] = comments[j + 1];
                        }
                        Comment[] newComments = Arrays.copyOf(comments, comments.length - 1);
                        post.setComments(newComments);
                        System.out.println("Комментарий с ID " + commentId + " удален.");
                        return;
                    }
                }
            }
        }
        }
        System.out.println("Комментарий с ID " + commentId + " не найден.");
    }


    @Override
    public String toString() {
        for (int i = 0; i < userName.length; i++) {
            System.out.println(userName[i] );
            System.out.println(profile[i]);
        }

        return "";
    }
}

