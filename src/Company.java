public class Company extends Customer {
    String name;

    public Company(String firstName, String lastName, String city,
                   String street, String homeNumber, int flatNumber,
                   boolean isPremium, String name) {
        super(firstName, lastName, city, street, homeNumber, flatNumber
                , isPremium);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
