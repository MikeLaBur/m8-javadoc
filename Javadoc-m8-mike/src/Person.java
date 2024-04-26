public class Person {
    //@Author create classes
    private String name;
    private String id;
    private String nationality;

     //@Author Constructor
    public Person(String name, String id, String nationality) {
        this.name = name;
        this.id = id;
        this.nationality = nationality;
    }

    //@Author Getters & Setters
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getNationality() {
        return nationality;
    }
}
