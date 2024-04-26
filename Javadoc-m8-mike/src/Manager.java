import java.time.LocalDate;

public class Manager extends Person {
    private LocalDate startDate;
    private int experienceYears;

    //@Author Constructor
    public Manager(String name, String id, LocalDate startDate, int experienceYears) {
        super(name, id, "");
        this.startDate = startDate;
        this.experienceYears = experienceYears;
    }

    //@Author Getters & Setters
    public int getExperienceYears() {
        // Obtener la diferencia en años entre la fecha actual y la fecha de inicio
        return LocalDate.now().getYear() - startDate.getYear();
    }
}
