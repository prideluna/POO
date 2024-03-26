// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Revendedor("1234567890","Purishira",30,true,1000, "098098098098");
        Funcionario funcionario2 = new Revendedor("32132132131", "Augusta Ada Byron", 36, true, 123, "123123123");

        Consultor consultor1 = new Consultor("1234567890","Priscila",30,false,2000);
        Consultor.addFuncionario(funcionario1);
        Consultor.addFuncionario(funcionario2);

        System.out.println(Consultor.numSubordinados());
        }
}