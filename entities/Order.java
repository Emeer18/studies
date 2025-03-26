package entities;
import entities.Enums.OrderStatus;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Order {
    
    private Date moment;
    private OrderStatus status;

    private Client client;

    public Client getClient() {
        return this.client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    List <OrderItem> items = new ArrayList<>();

    public Order() {
    }

    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public Date getMoment() {
        return this.moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return this.status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrderItem item) {
        this.items.add(item);
    }

    public void removeItem(OrderItem item) {
        this.items.remove(item);
    }
    
    public List<OrderItem> getItems() {
        return items;
    }

    public Double total(){

        Double total = 0.0;
       
        for (OrderItem item : items) {
             total += item.subTotal();
        }
        return total;
    }

}
