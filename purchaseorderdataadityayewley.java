import java.util.HashMap;
import java.util.Map;

public class purchaseorderdataadityayewley {
    private static Map<Integer, purchaseorderadityayewley> purchaseOrders = new HashMap<>();
    private static int orderIdCounter = 1;

    public static int addPurchaseOrder(int customerId, String productName, int quantity, double pricing, double mrp) {
        int orderId = orderIdCounter++;
       purchaseorderadityayewley order = new purchaseorderadityayewley();
        order.setPurchaseOrderId(orderId);
        order.setCustomerId(customerId);
        order.setProductName(productName);
        order.setQuantity(quantity);
        order.setPricing(pricing);
        order.setMrp(mrp);

        purchaseOrders.put(orderId, order);
        return orderId;
    }

    public static purchaseorderadityayewley getPurchaseOrder(int purchaseOrderId) {
        return purchaseOrders.get(purchaseOrderId);
    }
}
