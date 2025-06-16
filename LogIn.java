import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String Usuario = "admin";
        String Contraseña = "12345";

        System.out.print("Ingresa tu nombre de usuario: ");
        String NombreUsuario = scanner.nextLine();
        System.out.print("Ingresa tu contraseña: ");
        String ContraseñaUsuario = scanner.nextLine();

        if (NombreUsuario.equals(Usuario) && ContraseñaUsuario.equals(Contraseña)) {
            System.out.println("acceso concedido");
        }
        else{System.out.println("Nombre de usuario o contraseña incorrecta");}
        scanner.close();
        //Escribe un programa que pida al usuario ingresar un nombre de usuario y una constraseña, si son iguales a los datos dados imprimirá en terminal: Acceso concedido, si no son iguales imprimirá en terminal: Nombre de usuario o contraseña incorrecta.
        //Averigua como hacer para poder ingresar el dato justo al lado de lo que termine la pregunta, es decir, que no haga un salto de línea.

    }
}
