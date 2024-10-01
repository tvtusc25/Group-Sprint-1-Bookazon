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
        // Null check
        if (line1 == null || line2 == null || city == null || state == null || zip == null || country == null) {
            throw new IllegalArgumentException("Address fields cannot be null");
        }

        // line1 and line2 (non-empty, <100 characters)
        if (line1.trim().isEmpty() || line1.length() > 100) {
            throw new IllegalArgumentException("Address Line 1 must be non-empty and less than 100 characters");
        }
        if (!line2.trim().isEmpty() && line2.length() > 100) {
            throw new IllegalArgumentException("Address Line 2 must be less than 100 characters if provided");
        }

        // city (non-empty, alphabetic characters, <50 characters)
        if (city.trim().isEmpty() || !city.matches("^[a-zA-Z\\s]+$") || city.length() > 50) {
            throw new IllegalArgumentException("City must be non-empty, alphabetic, and less than 50 characters");
        }

        // state (non-empty, 2-letter code)
        if (state.trim().isEmpty() || state.length() != 2 || !state.matches("^[A-Z]{2}$")) {
            throw new IllegalArgumentException("State must be a valid 2-letter uppercase code");
        }

        // zip (non-empty, numeric, and 5/9 characters)
        if (zip.trim().isEmpty() || !zip.matches("^\\d{5}(?:-\\d{4})?$")) {
            throw new IllegalArgumentException("Zip code must be a valid 5 or 9 digit code (##### or #####-####)");
        }

        // country (non-empty, alphabetic characters, <50 characters)
        if (country.trim().isEmpty() || !country.matches("^[a-zA-Z\\s]+$") || country.length() > 50) {
            throw new IllegalArgumentException("Country must be alphabetic and less than 50 characters");
        }
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
