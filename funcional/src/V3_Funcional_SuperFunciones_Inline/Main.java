package V3_Funcional_SuperFunciones_Inline;



import V3_Funcional_SuperFunciones_Inline.Interfaces.*;

import java.util.List;
import java.util.Random;


public class Main {
    public static void main(String[] args) throws Exception {
        //crear una lista
        List<Integer> numeros = SuperFunciones.proveer(10, new Proveedor(){
            private static int next = 0;
            public Integer obtener() {
                return next++;
            }
        });
        System.out.println(numeros);

        // filtrar numeros pares
        List<Integer>numerosPares = SuperFunciones.filtrar(numeros, new PredicadoFiltrador() {
            public Boolean test(Integer valor) {
                    return valor%2==0;
            }
        });
        System.out.println(numerosPares);

        // Obtener Cuadrados
        List<Integer>transformados = SuperFunciones.transformar(numerosPares, new Funcion() {
            @Override
            public Integer aplicar(Integer valor) {
                return valor*valor;
            }
        });
        System.out.println(transformados);

        // Imprimir cada posicion
        SuperFunciones.actuar(transformados, new Consumidor() {
            public void aceptar(Integer valor) {
                System.out.println(valor);
            }
        });

        // Sumar la lista de cuadrados
        Integer total = SuperFunciones.reducir(transformados, 1, new FuncionBinaria() {
            @Override
            public Integer aplicar(Integer valor1, Integer valor2) {
                return valor1+valor2;
            }
        });
        System.out.println(total);

    }



}
