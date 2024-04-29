package computer;

import Employee.Employee;

import java.util.StringJoiner;
public class CsvFormatter <T> implements Formatter <T> {
    //@Override
    //public String format(T[] elements) {
     //   StringJoiner joiner = new StringJoiner("\n");
     //   for (T t : elements) {
     //       final Employee e = (Employee) t; // the class still attached to Employee type. How to solve it?
     //       joiner.add("{" + e.getName()+ "}"+ "{" + e.getDateOfEmployment() + "}");
     //   }
     //   return joiner.toString();
    //}
    @Override
    public String format(T[] elements) {
        StringJoiner joiner = new StringJoiner("\n");
        for (T t : elements) {
            final Reportable reportable = (Reportable) t; // this method now works for any class that implements Reportable
            final String[] content = reportable.reportContent();
            joiner.add(String.join(",", content));
        }
        return joiner.toString();
    }
}
