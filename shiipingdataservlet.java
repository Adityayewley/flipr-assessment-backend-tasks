import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class shiipingdataservlet extends HttpServlet {

    private shippingdetaildataadityayewley shippingData = new shippingdetaildataadityayewley();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int customerId = Integer.parseInt(request.getParameter("customerId"));
        int purchaseOrderId = Integer.parseInt(request.getParameter("purchaseOrderId"));
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String pincode = request.getParameter("pincode");

        int shippingId = shippingData.addShippingDetails(customerId, purchaseOrderId, address, city, pincode);

        response.getWriter().write("Shipping details added successfully with ID: " + shippingId);
    }
}
