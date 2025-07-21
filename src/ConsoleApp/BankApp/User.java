package ConsoleApp.BankApp;

public class User {
    String name, address, phoneno;
    int uid;
    enum rating {
        one ,two, three,four ,five }
    User(int id ,String name,String address, String phoneno ){
        this.uid=id;
        this.name = name;
        this. address=address;
        this.phoneno=phoneno;

    }

}
