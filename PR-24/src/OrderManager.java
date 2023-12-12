import java.util.ArrayList;
import java.util.HashMap;

public class OrderManager {
    private HashMap<String, Order> orderHashMap = new HashMap<>();
    private ArrayList<Order> orderArrayList = new ArrayList<>();
    public void placeOrder(String adress, Order order) throws OrderAlreadyAddedException {
        if (orderHashMap.get(adress) == null) {
            orderArrayList.add(order);
            orderHashMap.put(adress, order);
        } else throw new OrderAlreadyAddedException("Order already exists on this adress or table");
    }
    public Order getOrder(String adress){
        return orderHashMap.get(adress);
    }
    public void removeOrder(String adress) {
        orderHashMap.remove(adress);
    }
    public void addItem(String adress, Item item){
        orderHashMap.get(adress).add(item);
    }

    public Order[] getAllIternetOrders(){
        int intordcount = 0;
        for (Order i : orderArrayList){
            if (i instanceof InternetOrder){ //Счет интернет заказов, нужен чтобы создать массив нужного размера
                intordcount++;
            }
        }
        Order[] internetorders = new Order[intordcount];
        intordcount = 0; //далее используется как счетчик индекса в массиве
        for (int i = 0; i < orderArrayList.size(); i++) {
            if (orderArrayList.get(i) instanceof InternetOrder){
                internetorders[intordcount] = orderArrayList.get(i);
                intordcount++;
            }
        }
        return internetorders;
    }
    public int getAllIternetOrdersCost(){
        Order[] intorders = getAllIternetOrders();
        int totalcost = 0;
        for (Order i : intorders){
            totalcost += i.totalCost();
        }
        return totalcost;
    }
    public int getAmountOfDishes(String dish){
        Order[] intorders = getAllIternetOrders();
        int dishcount = 0;
        for (Order i : intorders){

            dishcount += i.itemAmount(dish);
        }
        return dishcount;
    }

}