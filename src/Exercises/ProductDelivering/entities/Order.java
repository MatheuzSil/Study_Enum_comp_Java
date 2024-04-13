package Exercises.ProductDelivering.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Exercises.ProductDelivering.entities.ClientData;
import entities.enums.OrderStatus;

public class Order {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;

    private ClientData client;

    private List<OrderItem> items = new ArrayList<>();

    public void addItem(OrderItem item) {
        items.add(item);
    }
    public Order(Date moment, OrderStatus status, ClientData client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public ClientData getClient() {
        return client;
    }

    public void setClient(ClientData client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public double itemSubTotal() {
        double subTotal = 0.0;
        for (OrderItem item: items) {
              subTotal = item.getProduct().getProductPrice() * item.getQuantity();
        }
        return subTotal;
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order status: " + status + "\n");
        sb.append("Client: ");
        sb.append( client + "\n");
        sb.append("Order items: \n");
        for (OrderItem item: items) {
            sb.append(item + "\n");
        }
        return sb.toString();
    }
}