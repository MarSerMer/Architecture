package sem1.store.inmemorymodel;

import sem1.store.modelelements.Order;

import java.util.Collection;
import java.util.HashSet;

public class Store {
    private Collection<Order> orders = new HashSet<Order>();

    public Boolean addOrder(Order order){
        orders.add(order);
        return true;
    }

    public Boolean cancelOrder(int id){
        //TODO: Отмена заказа
        return true;
    }

    public Boolean paymentOrder(int id){
        //TODO: Отмена заказа
        return true;
    }
}
