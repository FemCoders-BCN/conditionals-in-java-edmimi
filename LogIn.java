import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario ingresar un nombre de usuario y una constraseña, si son iguales a los datos dados imprimirá en terminal: Acceso concedido, si no son iguales imprimirá en terminal: Nombre de usuario o contraseña incorrecta.
        //Averigua como hacer para poder ingresar el dato justo al lado de lo que termine la pregunta, es decir, que no haga un salto de línea.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hello, enter your username, please : ");
        String username = scanner.nextLine();
        System.out.print("Enter your password, please : ");
        String password = scanner.nextLine();
        
        if (username.equals("MariPuri") && password.equals("narnia")) {
            System.out.println("Access granted");
        } else {
            System.out.println("Incorrect username or password ");
        }
        scanner.close();
    }
}
