import java.util.List;

public class Main {
    public static String logitudPalabra(List<String> palabras, int n) {
        return String.join(", ", palabras
                .stream()
                .filter(palabra -> palabra.length() > n)
                .toArray(String[]::new)
        );
    }

    public static void main(String[] args) {
        List<String> palabras = List.of("manzana", "pera", "banana", "uva", "kiwi", "naranja");
        int n = 4;

        String resultado = logitudPalabra(palabras, n);
        System.out.println(resultado);
    }
}