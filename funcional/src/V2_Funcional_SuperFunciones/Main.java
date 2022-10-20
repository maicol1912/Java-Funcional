package V2_Funcional_SuperFunciones;


import V2_Funcional_SuperFunciones.Clases.*;

import java.util.List;


public class Main {
    public static void main(String[] args) throws Exception {
        //crear una lista
        List<Integer> numeros = SuperFunciones.proveer(10, new Naturales());
        System.out.println(numeros);

        // filtrar numeros pares
        List<Integer>numerosPares = SuperFunciones.filtrar(numeros,new OnlyPares());
        System.out.println(numerosPares);

        // Obtener Cuadrados
        List<Integer>transformados = SuperFunciones.transformar(numerosPares,new AlCubo());
        System.out.println(transformados);

        // Imprimir cada posicion
        SuperFunciones.actuar(transformados,new Impresor());

        // Sumar la lista de cuadrados
        Integer total = SuperFunciones.reducir(transformados,1,new Sumador());
        System.out.println(total);

    }



}
