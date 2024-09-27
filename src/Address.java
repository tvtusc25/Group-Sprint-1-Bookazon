public class Address {
    private String line1;
    private String line2;
    private String city;
    private String state;
    private String zip;
    private String country;

    // Constructor
    public Address(String line1, String line2, String city, String state, String zip, String country) {
        setAddress(line1, line2, city, state, zip, country);
    }

    // Set address with validation
    public void setAddress(String line1, String line2, String city, String state, String zip, String country) {
        validateAddress(line1, line2, city, state, zip, country);
        this.line1 = line1;
        this.line2 = line2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
    }

    // Validation
    private void validateAddress(String line1, String line2, String city, String state, String zip, String country) {
        if (line1 == null || line2 == null || city == null || state == null || zip == null || country == null) {
            throw new IllegalArgumentException("Address fields cannot be null");
        }
        // Add more validation as needed
    }

    // Getters
    public String getLine1() { 
        return line1; 
    }

    public String getLine2() { 
        return line2; 
    }

    public String getCity() {
         return city; 
    }

    public String getState() {
         return state; 
    }

    public String getZip() {
         return zip; 
    }

    public String getCountry() {
         return country; 
    }

    @Override
    public String toString() {
        return line1 + (line2 != null ? ", " + line2 : "") + ", " + city + ", " + state + " " + zip + ", " + country;
    }
}
