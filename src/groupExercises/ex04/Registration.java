package groupExercises.ex04;

public class Registration {
    private String email;
    private String userName;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.contains("@yahoo.com"))
            this.email = email;
        else
            System.out.println("Wrong email!");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if(userName.length() > 6)
            this.userName = userName;
        else
            System.out.println("You should put more then 6 characters!!!");
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(userName == null) {
            System.out.println("You can add password after correct User Name only");//null check;
            return;
        }
        if( password != null && password.length() > 6 && !password.contains(userName))
            this.password = password;
        else
            System.out.println("Sorry incorrect password");
    }
}
class Main{
    public static void main(String[] args) {
        Registration registration = new Registration();
        registration.setEmail("myemail@yahoo.com");
        registration.setUserName("Anton");
        registration.setPassword("pass123");


    }
}
