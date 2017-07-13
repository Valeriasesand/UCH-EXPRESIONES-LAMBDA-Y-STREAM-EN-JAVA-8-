package pe.grupo1.java8.stream;

/**
 * @author Espinoza Ponciano Denis
 * @author Señas Sandoval Valeria
 * @author Ventocilla Gomero Fanny
 */

import java.util.ArrayList;
import java.util.List;

public class StreamsApp {

    private final List<String> lista;
    private final List<String> numeros;

    public StreamsApp() {
        lista = new ArrayList<>();
        lista.add("Denis");
        lista.add("Espinoza");
        lista.add("Valeria");
        lista.add("Sandoval");
        lista.add("Fanny");
        lista.add("Ventocilla");

        numeros = new ArrayList<>();
        numeros.add("1");
        numeros.add("2");
        numeros.add("3");
    }

    public void filtrar(String letra) {
        lista.stream().filter(x -> x.startsWith(letra)).forEach(System.out::println);
    }

    public void ordenar(int orden) {
        if (orden == 0) {
            numeros.stream().sorted().forEach(System.out::println);
        } else {
            numeros.stream().sorted((x, y) -> y.compareTo(x)).forEach(System.out::println);
        }
    }

    public void transformarString_Entero() {
        numeros.stream().map(x -> Integer.parseInt(x)).forEach(System.out::println);
    }
    
    public void transformarMayusculas() {
        lista.stream().map(String::toUpperCase).forEach(System.out::println);
    }

    public void limitar(int r1) {
        lista.stream().limit(r1).forEach(System.out::println);
    }

    public void contar() {
        long x = lista.stream().count();
        System.out.println(x);
    }
}
