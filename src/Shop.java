public class Shop {
    public static void main(String[] args) {
        Product painting = new Product("Kobieta z perłą",
                "obraz na płótnie",
                "Jan Vermeer", 10.500);
        IndyvidualPerson individualPerson = new IndyvidualPerson("Jan",
                "Nowak", "Kraków", "Floriańska", "8A",
                12, false);
        Bill bill = new Bill("Jan Nowak", "obraz na płótnie", 10500);

        System.out.println(bill.customerBill());
    }
}