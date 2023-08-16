import java.util.Scanner;
public class Login {
        public static void main(String[] args) {

            // Arreglo usuarios y contraseñas
            String[] usernames = {"samuel","gabriela","sara","wendy","hugo"};
            String[] passwords = {"12","123","1234","12345","123456"};

            Scanner scanner = new Scanner(System.in);

            // Credenciales del usuario ingresados ´por consola
            System.out.println("****login****");
            System.out.println("Ingrese su username: ");
            String u = scanner.nextLine();
            System.out.println("Ingrese su password");
            String p = scanner.nextLine();

            boolean autenticacion = false;

            // Autenticacion de usuarios por medio de un ciclo for
            for (int i = 0; i < usernames.length; i++){
                if ( (usernames[i].equals(u) && passwords[i].equals(p)) ){
                    autenticacion = true;
                    break;
                }
            }
            // Autenticacion exitosa o negada por medio de una condicional..
            if (autenticacion){
                System.out.println("Bienvenido usuario ".concat(u));
            }else {
                System.out.println("Lo siento requiere autenticacion");
                System.out.println("Usarname o password incorrecto");
            }
        }
    }

