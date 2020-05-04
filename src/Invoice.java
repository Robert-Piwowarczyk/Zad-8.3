public class Invoice extends Bill {
    String company;

    public Invoice(String customer, String product, double price,
                   String company) {
        super(customer, product, price);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void companyBill() {
        System.out.println("dowód zakupu: " + customer + " zakupiony produkt "
                + product + " firma: " + company + "cena: " + price);
    }
}