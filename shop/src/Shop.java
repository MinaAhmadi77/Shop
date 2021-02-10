//import com.sun.org.apache.xpath.internal.operations.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Shop {
    public String name;
    public ArrayList<Customer> c1=new ArrayList<>();


    public Shop(String name) {
        this.name=name;
    }

    public void addCustomer(Customer c) {
        c1.add(c);

    }
//
//    public Customer[] getCustomers() {
//    }
//
//    public void addRepository(Repository r) {
//    }
//
//    public Repository[] getRepositories() {
//    }
//
//    public int getIncome() {
//    }
//
//    public void setIncome(int income) {
//    }
//
//    public void addGood(Good g) {
//    }
//
//    public void increamentGood(Good g, int amount) {
//    }
//
//    public Good[] getGoods() {
//    }
//
//    public void addDiscount(Discount d, Customer c) {
//    }
//
//    public HashMap<Good, Integer> getItemsSold() {
//    }
//
//    public void addDiscount(Discount discount) {
//    }

    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        Shop shop=new Shop("sh");
        ArrayList<Customer> cu=new ArrayList<Customer>();
        ArrayList<Good> go=new ArrayList<>();
        int t=0;
        while(true){
            String a=in.nextLine();
            System.out.println(t);

            if(a.equals("terminate")) break;
            else{
                t++;
                System.out.println(a);
            }
           // in.nextLine();
        }
        System.out.println(t);
        while (true) {
            String a=in.nextLine();
            if(a.equals("terminate")) break;
            else {
                if (a.equals("add")) {
                  //  in.nextLine();

                    String in2 = in.nextLine();
                    if (in2.equals("customer")) {

                        int id = in.nextInt();
                        in.nextLine();
                        String name = in.nextLine();
                        Customer c = new Customer(name, id);
                        shop.addCustomer(c);
                        cu.add(c);
                      //  System.out.println(cu.size());

                    }
                    else if(in2.equals("good")){
                        int id2=in.nextInt();
                        String name2=in.nextLine();
                        int price=in.nextInt();
                        int num=in.nextInt();
                        Good g=new Good(name2,id2,price);
                        go.add(g);


                    }
                }
            }

        }
        System.out.println(cu.size());



    }
}

class Customer {
    public String name;
    public int ID;
    public Customer(String name, int ID){
        this.name=name;
        this.ID=ID;
    }
//    public String getName(){}
//    public int getID(){}
//    public int getBalance(){}
//    public void setBalance(int amount){}
//    public void addOrder(Order order){}
//    public Order[] getTotalOrders(){}
//    public Order[] getPendingOrders(){}
//    public Order[] getSubmittedOrders(){}
//    public void submitOder(Order order){}
//



}

class Good {
    public String name;
    public int ID;
    public int price;

    public Good(String name, int ID, int price){
        this.name=name;
        this.ID=ID;
        this.price=price;
    }
//    public int getID(){}
//    public int getPrice(){}
//    public String getName(){}
//

}

class Repository {
//    public Repository(int id, int capacity){}
//    public int getID(){}
//    public int getCapacity(){}
//    public int getFreeCapacity(){}
//    public HashMap<Good,Integer> getGoods(){}
//    public void addGood(Good g, int amount){}
//
//    public void removeGood(Good g, int amount){}
//

}

class Order {
//    public Order(int ID, Customer c){}
//    public int getID(){ }
//    public String getStatus(){}
//    public void setStatus (String status){}
//    public void addItem (Good good, int amount){}
//    public void removeItem (Good good){}
//    public HashMap<Good, Integer> getItems(){}
//    public int calculatePrice(){}
//    public void addDiscount(Discount discount){}

}

class Discount {
//    public Discount(int ID, int percent){}
//    public void setOrder (Order order){}
//    public Order getOrder(){}
//    public int getPercentage(){}
}


