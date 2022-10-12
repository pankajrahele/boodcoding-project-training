package com.online.restaurant.app;
import com.online.restaurant.customer;
import com.online.restaurant.order;
import com.online.restaurant.vendor;
public class Application {
    public static void main(String[]args){
        customer pankaj = new customer();
        pankaj.setName("Pankaj");
        pankaj.setCity("Nagpur");
        pankaj.setAddress("Nandanwan,Nagpur");
        pankaj.setState("Maharashtra");
        pankaj.setEmailId("pankaj.com");
        pankaj.setPhoneNumber(914666105);

        System.out.println("Name:"+pankaj.getName());
        System.out.println("City:"+pankaj.getCity());
        System.out.println("Address:"+pankaj.getAddress());
        System.out.println("State:"+pankaj.getState());
        System.out.println("Email:"+pankaj.getEmailId());
        System.out.println("PhoneNumber:"+pankaj.getPhoneNumber());


        vendor haldiram=new vendor();
        haldiram.setName("Haldiram Veg restaurant");
        haldiram.setAddress("Ajni Square,Nagpur");
        haldiram.setCategory("VEG");
        haldiram.setPhoneNumber(982932887);
        haldiram.setRating(4.8f);
        haldiram.setState("Maharashtra");
        haldiram.setCity("Nagpur");

        System.out.println("\nvendor details:");
        System.out.println("Name:"+haldiram.getName());
        System.out.println("Address:"+haldiram.getAddress());
        System.out.println("Category:"+haldiram.getCategory());
        System.out.println("PhoneNumber:"+haldiram.getPhoneNumber());
        System.out.println("Rating:"+haldiram.getRating());
        System.out.println("State:"+haldiram.getState());
        System.out.println("City:"+haldiram.getCity());

        order order =new order() ;
        order.setCustomerName("pankaj");
        order.setVendorName("haldiram");
        order.setPrice(999.00);
        order.setQuantity(2);
        order.setItemName("pizza");

    }
}
