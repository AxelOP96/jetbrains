//FORMA INCORRECTA
    /**class Main {
        public static void main(String[] args) {
        System.out.println("********");
        System.out.println("      **");
        System.out.println("      **");
        System.out.println("      **");
        System.out.println("**    **");
        System.out.println("**    **");
        System.out.println(" *******");
        } }
        */
        //FORMA CORRECTA
        import java.util.Scanner;
        public class App {
        public static void main(String[] args) {
        System.out.println("********");
        System.out.println("      **\n      **\n      **");
        System.out.println("**    **");
        System.out.println("**    **");
        System.out.println(" *******");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("Hello, " + name + "!");
            }
        }
    
        //
        