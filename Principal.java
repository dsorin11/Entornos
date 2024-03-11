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