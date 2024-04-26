public class Hotel {
    //@Author create classes
    private String name;
    private String address;
    private String website;
    private int stars;

    
    //@Author Constructor
    public Hotel(String name, String address, String website, int stars) {
        this.name = name;
        this.address = address;
        this.website = website;
        this.stars = stars;
    }

    //@Author Getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getWebsite() {
        return website;
    }

    public int getStars() {
        return stars;
    }
}

