public class Main {
    public static void main(String[] args) {
        int[] arreglo = {5, 8, 3, 10, 2, 7, 6, 1, 9, 4}; // Crear un arreglo de 10 valores numéricos enteros

        // Calcular el promedio de los valores del arreglo
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        double promedio = (double) suma / arreglo.length;

        // Contar la cantidad de valores menores y mayores que el promedio
        int menores = 0;
        int mayores = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] < promedio) {
                menores++;
            } else if (arreglo[i] > promedio) {
                mayores++;
            }
        }

        // Mostrar los resultados
        System.out.println("El promedio es: " + promedio);
        System.out.println("La cantidad de valores menores al promedio es: " + menores);
        System.out.println("La cantidad de valores mayores al promedio es: " + mayores);
    }
}
