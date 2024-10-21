/**
 * The {@code Address} class represents a postal address with a city,
 * street, and postal code.
 */
public class Address {

    private String city;       // The city of the address
    private String street;     // The street of the address
    private String postalCode; // The postal code of the address

    /**
     * Constructs an {@code Address} instance with the specified city,
     * street, and postal code.
     *
     * @param city       the city of the address
     * @param street     the street of the address
     * @param postalCode the postal code of the address
     */
    public Address(String city, String street, String postalCode) {
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
    }

    /**
     * Returns the postal code of the address.
     *
     * @return the postal code
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the postal code of the address.
     *
     * @param postalCode the postal code to set
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * Returns the street of the address.
     *
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the street of the address.
     *
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Returns the city of the address.
     *
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city of the address.
     *
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Prints the address information to the console in a formatted manner.
     */
    public void printAddressInfo() {
        System.out.println("\t\tCity: " + city + ", Street: " + street + ", Postal Code: " + postalCode);
    }
}