
        import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class addCustomerServletAdityaYewley extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String customerName = request.getParameter("customerName");
        String email = request.getParameter("email");
        String mobileNumber = request.getParameter("mobileNumber");
        String city = request.getParameter("city");
        customerdataadityayewley CustomerData = new customerdataadityayewley();

        int customerId = CustomerData.addCustomer(customerName, email, mobileNumber, city);
        response.getWriter().write("Customer added successfully with ID: " + customerId);
    }
}
