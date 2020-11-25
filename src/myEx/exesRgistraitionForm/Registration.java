package myEx.exesRgistraitionForm;

public class Registration {
    private String email;
    private String userName;
    private String password;

    @Override
    public String toString() {
        return "Registration{" +
                "email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    boolean registrRes(){
        if(email != null && userName != null && password != null) {
            System.out.println("Registration complete!");
            return true;
        }
        else {
            System.out.println("I need to go over!");
            return false;
        }
    }

    public void setEmail(String email) {
        email = email.toLowerCase();
        if(email.contains("@yahoo.com"))
            this.email = email;
        else
            System.out.println("Your email should be Yahoo only");
    }

    public void setUserName(String userName) {
        userName = userName.toLowerCase();
        if(userName.length() > 6)
            this.userName = userName;
        else
            System.out.println("Your email should be longer then 6 chars");
    }

    public void setPassword(String password) {
        password = password.toLowerCase();
        if(password.length() > 6) {
            if(userName == null) {
                System.out.println("You need to create password first");
                return;
            }
            if (!password.contains(userName) || password.length() != userName.length())
                this.password = password;
            else
                System.out.println("You can't make same password as User Name");
        }
        else
            System.out.println("Your password should be longer then 6 chars");
    }
}

class Main{
    public static void main(String[] args) {
        Registration registration = new Registration();
        registration.setEmail("myemail@yahoo.com");
        registration.setUserName("Antonio");
        registration.setPassword("antonio777");
        System.out.println(registration.toString());
        registration.registrRes();
    }
}
