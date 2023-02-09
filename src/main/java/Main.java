import Classes.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();
        Cashier cashier1 = new Cashier("Susan",1);
        Cashier cashier2 = new Cashier("jack",19);
        Cashier cashier3 = new Cashier("hellin",3);
        Product item1 = new Product("biscuit",30,2);
        Product item2 = new Product("samvita",22,1);
        Product item3 = new Product("Oat",31,23);
        Cashier cashier= new Cashier();
        Customer buy = new Customer();


        List<Product> item = new ArrayList<>();
        List<Cashier> addCashier = new ArrayList<>();


        item.add(item1);
        item.add(item2);
        item.add(item3);
        addCashier.add(cashier1);
        addCashier.add(cashier2);
        addCashier.add(cashier3);
        Product seller = new Product();


        Store store = new Store(item);
        cashier.saleProduct(item1);
        System.out.println(cashier.saleProduct(item1));
        System.out.println("********************");
        System.out.println(buy.CustomerBuy(item1));

        System.out.println("********************");
        System.out.println(cashier.dispenseCash(item1));


        System.out.println("********************");


        System.out.println(item);
        System.out.println(addCashier);
        System.out.println("********************");

        System.out.println(manager.Hire(addCashier));
        System.out.println(manager.Fire(addCashier));



    }
}