import java.util.Arrays;
import java.util.Objects;

public class InternetOrder implements Order{
    private static class ListNode {
        Item value;
        ListNode prev;
        ListNode next;

        ListNode(Item value) {
            this.value = value;
            this.prev = null;
            this.next = null;
        }
    }
    private ListNode head;
    private int size;

    public InternetOrder() {
        this.head = new ListNode(null);
        this.size = 0;
    }

    public InternetOrder(Item[] items) {
        this.head = new ListNode(null);
        this.size = 0;
        for (Item item : items) {
            add(item);
        }
    }
    @Override
    public boolean add(Item item) {
        ListNode newNode = new ListNode(item);
        ListNode lastNode = findLastNode();
        lastNode.next = newNode;
        newNode.prev = lastNode;
        size++;
        return true;
    }
    @Override
    public boolean remove(String itemName) {
        ListNode currentNode = findLastNode();
        while (currentNode != head) {
            if (currentNode.value.getName().equals(itemName)) {
                currentNode.prev.next = currentNode.next;
                if (currentNode.next != null) {
                    currentNode.next.prev = currentNode.prev;
                }
                size--;
                return true;
            }
            currentNode = currentNode.prev;
        }
        return false;
    }

    @Override
    public boolean remove(Item item) {
        ListNode currentNode = findLastNode();
        while (currentNode != head) {
            if (currentNode.value.equals(item)) {
                currentNode.prev.next = currentNode.next;
                if (currentNode.next != null) {
                    currentNode.next.prev = currentNode.prev;
                }
                size--;
                return true;
            }
            currentNode = currentNode.prev;
        }
        return false;
    }

    public int removeAll(String itemName) {
        int count = 0;
        ListNode currentNode = findLastNode();
        while (currentNode != head) {
            if (currentNode.value.getName().equals(itemName)) {
                ListNode prevNode = currentNode.prev;
                prevNode.next = currentNode.next;
                if (currentNode.next != null) {
                    currentNode.next.prev = prevNode;
                }
                count++;
                size--;
            }
            currentNode = currentNode.prev;
        }
        return count;
    }

    @Override
    public int removeAll(Item item) {
        int count = 0;
        ListNode currentNode = findLastNode();
        while (currentNode != head) {
            if (currentNode.value.equals(item)) {
                ListNode prevNode = currentNode.prev;
                prevNode.next = currentNode.next;
                if (currentNode.next != null) {
                    currentNode.next.prev = prevNode;
                }
                count++;
                size--;
            }
            currentNode = currentNode.prev;
        }
        return count;
    }

    @Override
    public String[] itemsNames() {
        String[] names = new String[size];
        int c = size;
        ListNode currentNode = findLastNode();
        while (currentNode != head) {
            names[c] = currentNode.value.getName();
            currentNode = currentNode.prev;
            c--;
        }
        return names;
    }

    @Override
    public int itemsAmount() {
        return size;
    }

    @Override
    public int itemAmount(String itemName) {
        int count = 0;
        ListNode currentNode = findLastNode();
        while (currentNode != head) {
            if (Objects.equals(currentNode.value.getName(), itemName)){
                count++;
            }
            currentNode = currentNode.prev;
        }
        return count;
    }

    @Override
    public int totalCost() {
        int cost = 0;
        ListNode currentNode = findLastNode();
        while (currentNode != head) {
            cost += currentNode.value.getPrice();
            currentNode = currentNode.prev;
        }
        return cost;
    }

    public Item[] getItems() {
        Item[] items = new Item[size];
        ListNode currentNode = head.next;
        int index = 0;
        while (currentNode != null) {
            items[index] = currentNode.value;
            currentNode = currentNode.next;
            index++;
        }
        return items;
    }

    public Item[] getSortedItemsByCostDesc() {
        Item[] items = getItems();
        Arrays.sort(items, (item1, item2) -> Double.compare(item2.getPrice(), item1.getPrice()));
        return items;
    }

    private ListNode findLastNode() {
        ListNode currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        ListNode currentNode = head.next;
        while(currentNode != null){
            result.append(currentNode.value.getName() + ", ");
            currentNode = currentNode.next;
        }
        result.deleteCharAt(result.length() -2);
        return result.toString();
    }
    /*
    public String toString() {
        StringBuilder result = new StringBuilder();
        ListNode currentNode = head.next;
        while(currentNode != null){
            result.append(currentNode.value.toString() + ", ");
            currentNode = currentNode.next;
        }
        result.deleteCharAt(result.length() -2);
        return result.toString();
    }
     */
}