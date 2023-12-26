package set;

import java.util.TreeSet;

public class Order {
    private TreeSet<OrderItem> order;
    private String customer;

    public Order(String customer) {
        order = new TreeSet<>();
        this.customer = customer;
    }

    public void add(OrderItem oi) {
        order.add(oi);
    }

    public void remove(OrderItem oi) {
        order.remove(oi);
    }

    public void searchByName(String item) {
        boolean hasItem = false;
        for (OrderItem i : order) {
            if (i.getItemName().equalsIgnoreCase(item)) {
                System.out.println(i);
                hasItem = true;
                break;
            }
        }
        if (hasItem == false)
            System.out.println("Mat hang khong co trong danh sach");
    }

    public void printItemByFirstLetter(String letter) {
        int count = 0;
        System.out.println("============ IN DANH SACH THEO KI TU DAU ============");
        for (OrderItem i : order) {
            if (letter.equalsIgnoreCase(i.getItemName().substring(0, letter.length()))) {
                System.out.print(i);
                count++;
            }
        }
        if (count <= 0)
            System.out.println("Khong tim thay ket qua");
        System.out.println("=====================================================");
    }

    public void printItemQuantity(int quantity) {
        if (quantity > 0) {
            int count = 0;
            System.out.println("============ IN DANH SACH THEO SO LUONG ============");
            for (OrderItem i : order) {
                if (i.getQuantity() >= quantity) {
                    System.out.print(i);
                    count++;
                }
            }

            if (count <= 0)
                System.out.println("Khong tim thay ket qua");
            System.out.println("======================================================");
        } else
            System.out.println("Nhap sai du lieu");
    }

    public void addSpecial(OrderItem oi) {
        if (order.contains(oi)) {
            for (OrderItem o : order) {
                if (oi.getItemName().equalsIgnoreCase(o.getItemName())) {
                    o.setQuantity(oi.getQuantity() + o.getQuantity());
                    order.remove(oi);
                    order.add(o);
                    break;
                }
            }

        } else
            order.add(oi);
    }

    public void removeSpecial(OrderItem oi) {
        if (order.contains(oi)) {
            int oldQuantity = 0;
            for (OrderItem o : order) {
                if (oi.getItemName().equalsIgnoreCase(o.getItemName())) {
                    oldQuantity = o.getQuantity();
                    break;
                }
            }
            if (oldQuantity < oi.getQuantity())
                System.out.println("vuot qua so luong trong gio hang");

            if (oldQuantity == oi.getQuantity())
                order.remove(oi);
            if (oldQuantity > oi.getQuantity()) {
                OrderItem otherItem = new OrderItem(oi.getOrderItemId(), oi.getItemId(), oi.getItemName(),
                        oi.getUnitPrice(), oldQuantity - oi.getQuantity());
                order.remove(oi);
                order.add(otherItem);
            }

        } else
            System.out.println("Khong co trong gio hang");
    }

    public int totalCart() {
        int result = 0;
        for (OrderItem o : order) {
            result += o.getUnitPrice() * o.getQuantity();
        }
        return result;
    }

    public void printBill() {
        System.out.println("=================== HOA DON BAN LE =======================");
        System.out.println();
        System.out.println("Ten khach hang: " + customer.toUpperCase());
        System.out.println();
        System.out.printf("||%-10s\t||%-20s\t||%-10s\t||%-10s\t||%-10s\t||", "Id", "TEN MH", "DON GIA", "SO LUONG",
                "THANH TIEN");
        for (OrderItem o : order) {
            System.out.printf("\n||%-10s\t||%-20s\t||%-10d\t||%-10d\t||%-10d\t||", o.getItemId(), o.getItemName(),
                    o.getUnitPrice(), o.getQuantity(), o.getQuantity() * o.getUnitPrice());
        }
        System.out.println();
        System.out.println();
        System.out.println("Tong don gia: " + totalCart());
        System.out.println("=================== HOA DON BAN LE =======================");
    }

    @Override
    public String toString() {
        String result = customer + "\n";
        for (OrderItem o : order) {
            result += o;
        }
        return result;
    }

    public TreeSet<OrderItem> getOrder() {
        return order;
    }

    public void setOrder(TreeSet<OrderItem> bag) {
        this.order = bag;
    }

    public static void main(String[] args) {
        OrderItem item1 = new OrderItem("01", "786456", "Ga sot mam toi", 10000, 10);
        OrderItem item2 = new OrderItem("02", "547345", "Bot giat Omo", 65000, 1);
        OrderItem item3 = new OrderItem("03", "654356", "Cut lon xao me", 5000, 20);
        OrderItem item4 = new OrderItem("04", "768954", "Ga chien nuoc mam", 20000, 1);
        OrderItem item5 = new OrderItem("05", "980435", "Trung ga", 3500, 10);
        OrderItem item6 = new OrderItem("06", "764234", "Mi hao hao chua cay", 3500, 5);
        OrderItem item7 = new OrderItem("07", "768954", "Kem danh rang PS", 20000, 1);
        OrderItem item8 = new OrderItem("08", "547345", "Bot giat Omo", 65000, 2);
        OrderItem item9 = new OrderItem("09", "567483", "Nuoc tay rua bon cau", 35000, 2);
        OrderItem item10 = new OrderItem("010", "980435", "Trung ga", 3500, 10);
        OrderItem item11 = new OrderItem("011", "345324", "Ban chai danh rang", 11000, 2);

        OrderItem toRemove1 = new OrderItem("012", "547345", "Bot giat Omo", 65000, 1);
        OrderItem toRemove2 = new OrderItem("013", "567483", "Nuoc tay rua bon cau", 35000, 2);
        OrderItem toRemove3 = new OrderItem("014", "980435", "Trung ga", 3500, 5);

        Order cus1 = new Order("Ta Hoang Phuc");
        cus1.add(item1);
        cus1.add(item2);
        cus1.add(item8);
        cus1.add(item3);
        cus1.add(item4);
        cus1.add(item5);
        cus1.add(item6);
        cus1.add(item7);
        cus1.add(item9);
        cus1.add(item10);
        cus1.add(item11);
        
        
        // cus1.remove(toRemove1);
        // cus1.remove(toRemove2);
        // cus1.remove(toRemove3);

        // cus1.addSpecial(item1);
        // cus1.addSpecial(item2);
        // cus1.addSpecial(item3);
        // cus1.addSpecial(item4);
        // cus1.addSpecial(item5);
        // cus1.addSpecial(item6);
        // cus1.addSpecial(item7);
        // cus1.addSpecial(item8);
        // cus1.addSpecial(item9);
        // cus1.addSpecial(item10);
        // cus1.addSpecial(item11);

        // cus1.removeSpecial(toRemove1);
        // cus1.removeSpecial(toRemove2);
        // cus1.removeSpecial(toRemove3);

        // cus1.remove(item6);
        // cus1.searchByName("Ga sot mam toi");
        // cus1.searchByName("Trung ga");
        // cus1.searchByName("Bot giat omo");
        // cus1.searchByName("Dao cao rau Gilette");

        // cus1.printItemByFirstLetter("g");
        // cus1.printItemByFirstLetter("b");
        // cus1.printItemByFirstLetter("bo");

        // cus1.printItemQuantity(3);

        cus1.printBill();

        // System.out.println("Tong thanh toan: "+cus1.totalCart());

        System.out.println(cus1);
    }
}