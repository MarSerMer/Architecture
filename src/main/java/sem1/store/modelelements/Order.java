package sem1.store.modelelements;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

public class Order {

    //region Инициализатор и конструкторы
    {
        id = ++counter;
    }

    public Order(String address, String phone, Client client, Collection<OrderItem> items) {
        this.address = address;
        this.phone = phone;
        this.client = client;
        this.items = items;
    }

    //endregion

    //region Обертки над полями = свойства

    public int getId() {
        return id;
    }

    public Collection<OrderItem> getItems() {
        return items;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }


    public Client getClient() {
        return client;
    }
    //endregion

    // region Поля
    private static int counter = 0;
    private int id;
    private Date orderDate;
    private String address;
    private String phone;
    private Client client;
    private Collection<OrderItem> items = new HashSet<>();
    //endregion

}
