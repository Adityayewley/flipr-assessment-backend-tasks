import java.util.HashMap;
import java.util.Map;

public class customerdataadityayewley {
    private static Map<Integer, customerdataadityayewley> customers = new HashMap<>();
    private static int customerIdCounter = 1;

    public static int addCustomer(String customerName, String email, String mobileNumber, String city) {
        int customerId = customerIdCounter++;
        customerdataadityayewley customer = new customerdataadityayewley();
        customers.put(customerId, customer);
        return customerId;
    }

    public static customerdataadityayewley getCustomer(int customerId) {
        return customers.get(customerId);
    }
}
