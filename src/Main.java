import model.Users;
import model.Orders;
import model.Items;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Items item1= new Items("Nerd","5666","Levis",12345, "soft");
        Items item2= new Items("pineapple","#A3ER","ERKE",7000, "-");
        Items item3= new Items("tai", "#AH5YH", "PUMA", 9500,"light");
        Items item4= new Items("Mochi","4567","Nike", 9876,"best quality");
        Items item5= new Items("Happiness", "U3456","Levis", 5000, "-");

        ArrayList<Orders> order_list=new ArrayList<>();
        Orders order1=new Orders("5666","1",12345,2, "soft");
        Orders order2=new Orders("A3ER","2",7000,5,"-");
        order_list.add(order1);
        order_list.add(order2);

        Users user1= new Users(1,"laura","laura@gmail.com","985356788", "chuchepati");
        Users user2= new Users(2, "Mike","Mike@gmail.com", "982345676", "bouddha");

        item1.itemformat();

    }
}