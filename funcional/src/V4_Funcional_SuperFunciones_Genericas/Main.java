package V4_Funcional_SuperFunciones_Genericas;



import V4_Funcional_SuperFunciones_Genericas.Interfaces.*;

import java.util.List;


public class Main {
    public static void main(String[] args) throws Exception {
        //crear una lista
        List<Integer> numeros = SuperFunciones.proveer(10, new Proveedor<>(){
            private static int next = 0;
            public Integer obtener() {
                return next++;
            }
        });
        System.out.println(numeros);

        // filtrar numeros pares
        List<Integer>numerosPares = SuperFunciones.filtrar(numeros, new PredicadoFiltrador<Integer>() {
            public Boolean test(Integer valor) {
                    return valor%2==0;
            }
        });
        System.out.println(numerosPares);


        //Convertidos en cadena
        List<String>convertirCadena = SuperFunciones.transformar(numerosPares, new Funcion<Integer, String>() {
            @Override
            public String aplicar(Integer valor) {
                return "Valor: "+valor;
            }
        });
        System.out.println(convertirCadena);
        // Obtener Cuadrados
        List<Integer>transformados = SuperFunciones.transformar(numerosPares, new OperadorUnario<>() {
            @Override
            public Integer aplicar(Integer valor) {
                return valor*valor;
            }
        });
        System.out.println(transformados);

        // Imprimir cada posicion
        SuperFunciones.actuar(transformados, new Consumidor<Integer>() {
            public void aceptar(Integer valor) {
                System.out.println(valor);
            }
        });

        // Sumar la lista de cuadrados
        Integer total = SuperFunciones.reducir(transformados, 1, new OperadorBinario<>() {
            @Override
            public Integer aplicar(Integer valor1, Integer valor2) {
                return valor1+valor2;
            }
        });
        System.out.println(total);

    }



}
