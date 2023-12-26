package set;

public class OrderItem implements Comparable<OrderItem> {
    private String orderItemId;
    private String itemId;
    private String itemName; private int unitPrice; private int quantity;
    public OrderItem(String orderItemId, String itemId, String itemName, int unitPrice, int quantity) {
        this.orderItemId = orderItemId;
        this.itemId = itemId;
        this.itemName = itemName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    @Override
    public int compareTo(OrderItem o) {
       return this.getItemName().compareToIgnoreCase(o.getItemName());
         
    }
    

    @Override
    public String toString() {
        return "orderItemId: " + orderItemId + ", itemId: " + itemId + ", itemName: " + itemName
                + ", unitPrice: " + unitPrice + ", quantity: " + quantity + "\n";
    }

    public String getOrderItemId() {
        return orderItemId;
    }
public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}