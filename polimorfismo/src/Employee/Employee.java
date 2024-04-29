package Employee;
import computer.Reportable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee implements Reportable {
    private String name;
    private LocalDate dateOfEmployment;
    private LocalDate birthDate;
// Constructors, methods, and getters

    public Employee(String name, LocalDate dateOfEmployment, LocalDate birthDate) {
        this.name = name;
        this.dateOfEmployment = dateOfEmployment;
        this.birthDate = birthDate;
    }
    @Override
    public String[] reportContent() {
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return new String[]{name, dateOfEmployment.format(formatter), birthDate.format(formatter)};
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(LocalDate dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}