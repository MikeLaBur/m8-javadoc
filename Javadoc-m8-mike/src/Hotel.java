/**
 * Clase que representa un hotel con nombre, dirección, sitio web y número de estrellas.
 * 
 * @author [Nombre del autor]
 * @version 1.0
 */
public class Hotel {
    private String name;
    private String address;
    private String website;
    private int stars;

    /**
     * Constructor para crear un nuevo objeto Hotel.
     * 
     * @param name Nombre del hotel.
     * @param address Dirección del hotel.
     * @param website Sitio web del hotel.
     * @param stars Número de estrellas del hotel.
     */
    public Hotel(String name, String address, String website, int stars) {
        this.name = name;
        this.address = address;
        this.website = website;
        this.stars = stars;
    }

    /**
     * Método para obtener el nombre del hotel.
     * 
     * @return El nombre del hotel.
     */
    public String getName() {
        return name;
    }

    /**
     * Método para obtener la dirección del hotel.
     * 
     * @return La dirección del hotel.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Método para obtener el sitio web del hotel.
     * 
     * @return El sitio web del hotel.
     */
    public String getWebsite() {
        return website;
    }

    /**
     * Método para obtener el número de estrellas del hotel.
     * 
     * @return El número de estrellas del hotel.
     */
    public int getStars() {
        return stars;
    }
}

