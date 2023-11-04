public class customerwithshippment{
    private customeradityayewley customer;
    private List<shippingdetaildataadityayewley> shipments = new List<>();

    public customerwithshippment(customeradityayewley customer, List<shippingdetaildataadityayewley> shipments) {
        this.customer = customer;
        this.shipments = shipments;
    }

}
