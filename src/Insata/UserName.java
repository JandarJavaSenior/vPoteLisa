package Insata;
public class UserName {

    private String userName;
    private String email;
    private String password;
    private Profile profile;
    public static int nextId = 1;
    private int id;

    public UserName(String userName, String emaill, String password, Profile profile) {
        this.userName = userName;
        this.email = emaill;
        this.password = password;
        this.profile = profile;
        this.id = nextId++;
        profile.setId(id);
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public UserName() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmaill() {
        return email;
    }

    public void setEmaill(String emaill) {
        this.email = emaill;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Profile[] getProfile() {
        return new Profile[]{profile};
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public void seachPost(String miniText) {
        boolean found = false;

        for (int i = 0; i < profile.getPosts().length; i++) {
            if (profile.getPosts()[i].getImage().contains(miniText)) {
                System.out.println(profile.getPosts()[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Нет такого поста!");
        }
    }

    public void deletePostById(int id) {
        boolean found = false;
                for (Post post : profile.getPosts()) {
                    if (post.getId() == id) {
                        Post[] updatedPosts = new Post[profile.getPosts().length - 1];
                        int indexToRemove = -1;

                        for (int i = 0, j = 0; i < profile.getPosts().length; i++) {
                            if (post.getId() != id) {
                                updatedPosts[j++] = profile.getPosts()[i];
                            } else {
                                indexToRemove = i;
                            }
                        }

                        profile.setPosts(updatedPosts);
                        found = true;
                        System.out.println("Пост удален!");
                        return;
                    }
                }

        if (!found) {
            System.out.println("Нет такого поста!");
        }


    }


    @Override
    public String toString() {
        return
                "\nНик: " + userName + '\n' +
                "Email: " + email + '\n' +
                "Пароль: " + password + '\n' +
                "Профиль: " +'\n' +
                "ID: " + id+'\n' ;
    }
}
