package sesion3_Proveer;

import sesion3_Proveer.Interfaces.PredicadoFiltrador;

import java.util.ArrayList;
import java.util.List;

public class SuperFunciones {
    static List<Integer> filtrar(List<Integer>numeros, PredicadoFiltrador predicadoFiltrador){
        List<Integer>resultado = new ArrayList<Integer>();
        for (Integer iterador:numeros) {
            if (predicadoFiltrador.test(iterador)){
                resultado.add(iterador);
            }
        }
        return resultado;
    }
    static List<Integer>proveer(Proveedor proveedor){
        return proveedor.obtener();
    }
}
