public class Customer  {
    private String firstName;
    private String lastName;
    private String city;
    private String street;
    private String homeNumber;
    private int flatNumber;
    private boolean isPremium;

    public Customer(String firstName, String lastName, String city,
                    String street, String homeNumber, int flatNumber,
                    boolean isPremium) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.street = street;
        this.homeNumber = homeNumber;
        this.flatNumber = flatNumber;
        this.isPremium = isPremium;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }
}
