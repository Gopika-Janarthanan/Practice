package ConsoleApp.EcommerceApp;

public class Product {
    String productname,price,companyname;
    int pro_id;
    Product(int proid,String proname,String price, String companyname){
        this.pro_id=proid;
        this.productname=proname;
        this.price=price;
        this.companyname=companyname;
    }
}
