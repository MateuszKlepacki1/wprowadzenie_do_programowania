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
        System.out.println("Podaj pierwsza cyfre");
        int x = scanner.nextInt();
        System.out.println("Jaka operacje chcesz wykonac wpisujac '+', '-', '*' lub '/'?");
        String znak = scanner.next();
        System.out.println("Podaj druga cyfre");
        int y = scanner.nextInt();
        switch (znak) {
            case "+":
                System.out.println(calc.add(x, y));
                break;
            case "-":
                System.out.print(calc.sub(x, y));
                break;
            case "*":
                System.out.print(calc.multiply(x, y));
                break;
            case "/":
                System.out.print(calc.division(x, y));
                break;

        }

    }
}


