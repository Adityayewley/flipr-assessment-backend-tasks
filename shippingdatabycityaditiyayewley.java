import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson; 

public class shippingdatabycityaditiyayewley extends HttpServlet {

    private shippingdetaildataadityayewley shippingData = new shippingdetaildataadityayewley();
    private customerdataadityayewley customerData = new customerdataadityayewley();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String city = request.getParameter("city");
        List<customeradityayewley> customers = shippingData.getCustomersWithShipmentsByCity(city);

        List<customerwithshippment> customersWithShipments = new ArrayList<>();
        for (customeradityayewley customer : customers) {
            List<shippingdetaildataadityayewley> shipments = shippingData.getShipmentDetailsByCustomerId(customer.getCustomerId());
            customerwithshippment customerWithShipments = new customerwithshippment(customer, shipments);
            customersWithShipments.add(customerWithShipments);
        }

        Gson gson = new Gson();
        String jsonCustomersWithShipments = gson.toJson(customersWithShipments);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        response.getWriter().write(jsonCustomersWithShipments);
    }
}
