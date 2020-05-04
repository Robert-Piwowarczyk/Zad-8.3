public class Bill {
    private String customer;
    private String product;
    private double price;

    public Bill(String customer, String product, double price) {
        this.customer = customer;
        this.product = product;
        this.price = price;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void customerBill() {
        System.out.println("Produkt zakupiony przez: " + customer +
                "nazwa produktu:"
                + product + "cena produktu:" + price);
    }
}


