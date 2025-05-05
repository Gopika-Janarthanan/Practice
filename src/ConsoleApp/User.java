package ConsoleApp;

public class User {
    String username,email,phoneno,address;
    int userid;

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public String getAddress() {
        return address;
    }

    public int getUserid() {
        return userid;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    User(int userid, String username, String email, String phoneno, String address){
        this.username = username;
        this.email=email;
        this.userid=userid;
        this.phoneno=phoneno;
        this.address=address;
    }


    public void setUsername(String username) {
        this.username = username;
    }
}
