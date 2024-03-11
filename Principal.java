import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
    }
}
public class FechaHoraActual {
    public static String obtenerFechaHoraActual() {
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return ahora.format(formato);
    }

    public static void main(String[] args) {
        String fechaHoraActual = obtenerFechaHoraActual();
        System.out.println("Fecha y hora actual: " + fechaHoraActual);
    }
}
import java.util.Scanner;

public class Principal {
    public static Usuario[] crearUsuarios(int cantidad) {
        Scanner scanner = new Scanner(System.in);
        Usuario[] usuarios = new Usuario[cantidad];

        for (int i = 0; i < cantidad; i++) {
            Usuario usuario = new Usuario();
            System.out.println("Ingrese el nombre del usuario " + (i + 1) + ":");
            usuario.nombre = scanner.nextLine();
            System.out.println("Ingrese los apellidos del usuario " + (i + 1) + ":");
            usuario.apellidos = scanner.nextLine();
            System.out.println("Ingrese el email del usuario " + (i + 1) + ":");
            usuario.email = scanner.nextLine();
            usuarios[i] = usuario;
        }

        return usuarios;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de usuarios a crear:");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        Usuario[] usuarios = crearUsuarios(cantidad);

        System.out.println("Usuarios creados:");
        for (Usuario usuario : usuarios) {
            System.out.println("Nombre: " + usuario.nombre);
            System.out.println("Apellidos: " + usuario.apellidos);
            System.out.println("Email: " + usuario.email);
            System.out.println();
        }
    }
}
