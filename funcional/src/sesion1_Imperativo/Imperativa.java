package sesion1_Imperativo;

import java.util.ArrayList;
import java.util.List;

public class Imperativa {
    public static void main(String[] args) throws Exception {
        //crear una lista
        List<Integer>numeros = crearLista();
        System.out.println(numeros);

        // filtrar numeros pares
        List<Integer>numerosPares = filtrarPares(numeros);
        System.out.println(numerosPares);

        //multiplicar numeros al cuadrado
        List<Integer>numerosCuadrados = elevarCuadrado(numerosPares);
        System.out.println(numerosCuadrados);

        //mostrar lista
        List<Integer>numerosMostrados = mostrarNumeros(numerosCuadrados);
        
        //sumar numeros cuadrados
        int sumaTotal = sumarNumeros(numerosCuadrados);
        System.out.println("la suma de los numeros totales es: "+sumaTotal);
    }

    private static int sumarNumeros(List<Integer> numerosCuadrados) {
        int acumuladorNumerosIterados=0;
        for (Integer numeroIterador:numerosCuadrados) {
            acumuladorNumerosIterados += numeroIterador;
        }
        return acumuladorNumerosIterados;
    }


    private static List<Integer> crearLista() {

        return List.of(0,1,2,3,5,8,13,21,34,55,89,154);
    }
    private static List<Integer> filtrarPares(List<Integer> numeros) {
        List<Integer>numerosPares = new ArrayList<>();
        for (Integer numero:numeros) {
            if (numero%2==0){
                numerosPares.add(numero);
            }
        }
        return numerosPares;
    }
    private static List<Integer> elevarCuadrado(List<Integer>numerosPares) {
        List<Integer> numerosCuadrados = new ArrayList<>();
        for (Integer numeroIterador:numerosPares) {
            numerosCuadrados.add(numeroIterador*numeroIterador);
        }
        return numerosCuadrados;
    }
    private static List<Integer> mostrarNumeros(List<Integer> numerosCuadrados) {
        for (Integer numeroIterador:numerosCuadrados) {
            System.out.println(numeroIterador);
        }
        return numerosCuadrados;
    }





}
