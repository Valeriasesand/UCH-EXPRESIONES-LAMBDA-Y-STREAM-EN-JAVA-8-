package pe.grupo1.java8.lambda;

/**
 * @author Espinoza Ponciano Denis
 * @author Señas Sandoval Valeria
 * @author Ventocilla Gomero Fanny
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaApp {

    public void ordernar() {
        List<String> lista = new ArrayList<>();
        lista.add("Valeria");
        lista.add("Fany");
        lista.add("Denis");

        // Lambda
        Collections.sort(lista, (String p1, String p2) -> p1.compareTo(p2));
        lista.forEach(System.out::println);

        /*for (String elemento : lista) {
			System.out.println(elemento);
		}*/
    }

    public void calcular(int num1, int num2) {
        Operacion operacion = (double x, double y) -> x/y;
        System.out.println(operacion.calcular(num1, num2));
    }
}
