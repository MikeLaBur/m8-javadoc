/**
 * Clase que representa una persona con nombre, identificación y nacionalidad.
 * 
 * @author [Nombre del autor]
 * @version 1.0
 */
public class Person {
    private String name;
    private String id;
    private String nationality;

    /**
     * Constructor para crear un nuevo objeto Person.
     * 
     * @param name Nombre de la persona.
     * @param id Identificación de la persona.
     * @param nationality Nacionalidad de la persona.
     */
    public Person(String name, String id, String nationality) {
        this.name = name;
        this.id = id;
        this.nationality = nationality;
    }

    /**
     * Método para obtener el nombre de la persona.
     * 
     * @return El nombre de la persona.
     */
    public String getName() {
        return name;
    }

    /**
     * Método para obtener la identificación de la persona.
     * 
     * @return La identificación de la persona.
     */
    public String getId() {
        return id;
    }

    /**
     * Método para obtener la nacionalidad de la persona.
     * 
     * @return La nacionalidad de la persona.
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Método para establecer el nombre de la persona.
     * 
     * @param name El nuevo nombre de la persona.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método para establecer la identificación de la persona.
     * 
     * @param id La nueva identificación de la persona.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Método para establecer la nacionalidad de la persona.
     * 
     * @param nationality La nueva nacionalidad de la persona.
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
