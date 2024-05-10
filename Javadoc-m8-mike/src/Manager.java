import java.time.LocalDate;

/**
 * Clase que representa un gerente, que es una subclase de Person.
 * Un gerente tiene un nombre, una identificación, una fecha de inicio y años de experiencia.
 * 
 * @author [Nombre del autor]
 * @version 1.0
 */
public class Manager extends Person {
    private LocalDate startDate;
    private int experienceYears;

    /**
     * Constructor para crear un nuevo objeto Manager.
     * 
     * @param name Nombre del gerente.
     * @param id Identificación del gerente.
     * @param startDate Fecha de inicio del gerente.
     * @param experienceYears Años de experiencia del gerente.
     */
    public Manager(String name, String id, LocalDate startDate, int experienceYears) {
        super(name, id, "");
        this.startDate = startDate;
        this.experienceYears = experienceYears;
    }

    /**
     * Método para obtener los años de experiencia del gerente.
     * Los años de experiencia se calculan en función de la fecha de inicio y la fecha actual.
     * 
     * @return Los años de experiencia del gerente.
     */
    public int getExperienceYears() {
        return LocalDate.now().getYear() - startDate.getYear();
    }
}
