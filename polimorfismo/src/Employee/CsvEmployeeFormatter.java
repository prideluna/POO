package Employee;

import java.util.StringJoiner;

public class CsvEmployeeFormatter implements EmployeeFormatter {

    @Override
    public String format(Employee[] employees) {
        StringJoiner joiner = new StringJoiner("\n");
        for (Employee e : employees) {
            joiner.add(e.getName()+ ", "+ e.getDateOfEmployment());
        }
        return joiner.toString();
    }
}
