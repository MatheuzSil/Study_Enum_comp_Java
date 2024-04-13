package Exercises.ProductDelivering.Application;

import Exercises.ProductDelivering.entities.ClientData;
import Exercises.ProductDelivering.entities.OrderItem;
import Exercises.ProductDelivering.entities.Product;
import Exercises.ProductDelivering.entities.Order;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sf1 = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Birth date: ");
        Date birtDate = sf1.parse(sc.next());

        ClientData clientData = new ClientData(name, email,birtDate);

        System.out.println(clientData);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), status, clientData);

        System.out.println("How many items to this order?: ");
        int n = sc.nextInt();
        for (int i=0; i<n; i++){
             sc.nextLine();
             int sum = i + 1;
             System.out.println("Enter item data #" + sum);
             System.out.print("Product name:");
             String productName = sc.nextLine();
             System.out.print("Product price: ");
             double productPrice = sc.nextDouble();
             Product product = new Product(productName, productPrice);

             System.out.print("Quantity: ");
             int productQuantity = sc.nextInt();


             OrderItem orderItem = new OrderItem(productQuantity, product);

             order.addItem(orderItem);




        }
        System.out.println("ORDER SUMMARY");
        System.out.println(order);





        sc.close();
    }
}
