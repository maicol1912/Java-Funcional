package sesion3_Proveer;

import sesion3_Proveer.Clases.OnlyPares;

import java.util.List;

public class Funcional {
    public static void main(String[] args) throws Exception {
        //crear una lista
        List<Integer> numeros = SuperFunciones.proveer();
        System.out.println(numeros);

        // filtrar numeros pares
        List<Integer>numerosPares = SuperFunciones.filtrar(numeros,new OnlyPares());
        System.out.println(numerosPares);
    }


    private static List<Integer> crearLista() {

        return List.of(0, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 154);
    }
}
