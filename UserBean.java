public class UserBean {
    private String password;

    public UserBean() {}

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean checkPassword(String enteredPassword) {
        return password != null && password.equals(enteredPassword);
    }
}
