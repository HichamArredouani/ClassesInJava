public class User {

    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;


    }
    public void changePassword(String newPassword) {
        this.password = newPassword;
    }

}


