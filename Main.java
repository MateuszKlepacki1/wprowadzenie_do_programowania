import java.util.Scanner;

/*public class Main {
    int a;
    int b;
    a = 10;
    b = 2;
    int c;
    c = a - b;
    System.out.println(c);

}
 */
public class Main {
    public static void main(String[] args) {
        /*
        Kalkulator calc = new Kalkulator();
        calc.add(a:5,b:2)
        System.out.println(calc.add(a,b));

         */
        Object system = null;
        Kalkulator calc = new Kalkulator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze podac pierwsza liczbe");
        int firstVariable = scanner.nextInt();
        System.out.println("Prosze podac druga liczbe");
        int secondVariable = scanner.nextInt();
        System.out.println("Twoj wynik dodawania to " +calc.add(firstVariable, secondVariable));
        System.out.println("Twoj wynik odejmowania to " +calc.sub(firstVariable, secondVariable));

    }
}

