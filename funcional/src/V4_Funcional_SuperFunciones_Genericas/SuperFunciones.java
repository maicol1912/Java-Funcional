package V4_Funcional_SuperFunciones_Genericas;


import V4_Funcional_SuperFunciones_Genericas.Interfaces.*;

import java.util.ArrayList;
import java.util.List;

public class SuperFunciones {
    static <T> List <T> filtrar(List<T> numeros, PredicadoFiltrador<T> predicadoFiltrador) {
        List<T> resultado = new ArrayList<>();
        for (T iterador : numeros) {
            if (predicadoFiltrador.test(iterador)) {
                resultado.add(iterador);
            }
        }
        return resultado;
    }

    static <T> List<T> proveer(int size, Proveedor<T> proveedor) {
        List<T> resultado = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            resultado.add(proveedor.obtener());
        }
        return resultado;
    }

    static <T,R> List<R> transformar(List<T> valores, Funcion<T,R> funcion) {
        List<R> resultado = new ArrayList<>();
        for (T valor : valores) {
            resultado.add(funcion.aplicar(valor));
        }
        return resultado;
    }

    static <T> void actuar(List<T> valores, Consumidor<T> consumidor) {
        List<T> resultado = new ArrayList<>();
        for (T valor : valores) {
            consumidor.aceptar(valor);
        }
    }

    static <T> T reducir(List<T> valores, T identidad, OperadorBinario<T> funcionBinaria) {
        T total = identidad;
        for (T numero : valores) {
            total = funcionBinaria.aplicar(total, numero);
        }
        return total;
    }
}

