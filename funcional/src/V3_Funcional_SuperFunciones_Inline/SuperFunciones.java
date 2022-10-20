package V3_Funcional_SuperFunciones_Inline;


import V3_Funcional_SuperFunciones_Inline.Interfaces.*;


import java.util.ArrayList;
import java.util.List;

public class SuperFunciones {
    static List<Integer> filtrar(List<Integer> numeros, PredicadoFiltrador predicadoFiltrador) {
        List<Integer> resultado = new ArrayList<>();
        for (Integer iterador : numeros) {
            if (predicadoFiltrador.test(iterador)) {
                resultado.add(iterador);
            }
        }
        return resultado;
    }

    static List<Integer> proveer(int size, Proveedor proveedor) {
        List<Integer> resultado = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            resultado.add(proveedor.obtener());
        }
        return resultado;
    }

    static List<Integer> transformar(List<Integer> valores, Funcion funcion) {
        List<Integer> resultado = new ArrayList<>();
        for (Integer valor : valores) {
            resultado.add(funcion.aplicar(valor));
        }
        return resultado;
    }

    static void actuar(List<Integer> valores, Consumidor consumidor) {
        List<Integer> resultado = new ArrayList<>();
        for (Integer valor : valores) {
            consumidor.aceptar(valor);
        }
    }

    static Integer reducir(List<Integer> valores, Integer identidad, FuncionBinaria funcionBinaria) {
        int total = identidad;
        for (Integer numero : valores) {
            total = funcionBinaria.aplicar(total, numero);
        }
        return total;
    }
}

