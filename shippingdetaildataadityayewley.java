import java.util.HashMap;
import java.util.Map;

public class shippingdetaildataadityayewley {
    private static Map<Integer,shippingdataadityayewley> shippingDetailsMap = new HashMap<>();
    private static int shippingIdCounter = 1;

    public int addShippingDetails(int customerId, int purchaseOrderId, String address, String city, String pincode) {
        int shippingId = shippingIdCounter++;
        shippingdataadityayewley shippingDetails = new shippingdataadityayewley();
        shippingDetails.setShippingId(shippingId);
        shippingDetails.setCustomerId(customerId);
        shippingDetails.setPurchaseOrderId(purchaseOrderId);
        shippingDetails.setAddress(address);
        shippingDetails.setCity(city);
        shippingDetails.setPincode(pincode);

        shippingDetailsMap.put(shippingId, shippingDetails);
        return shippingId;
    }

    public shippingdataadityayewley getShippingDetails(int shippingId) {
        return shippingDetailsMap.get(shippingId);
    }

    
}
