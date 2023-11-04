import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class purchaseorderservletadityayewley extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int customerId = Integer.parseInt(request.getParameter("customerId"));
        String productName = request.getParameter("productName");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        double pricing = Double.parseDouble(request.getParameter("pricing"));
        double mrp = Double.parseDouble(request.getParameter("mrp"));

        int purchaseOrderId = purchaseorderdataadityayewley.addPurchaseOrder(customerId, productName, quantity, pricing, mrp);
        response.getWriter().write("Purchase order added successfully with ID: " + purchaseOrderId);
    }
}
