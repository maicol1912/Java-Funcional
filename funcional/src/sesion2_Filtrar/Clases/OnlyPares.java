package sesion2_Filtrar.Clases;

import sesion2_Filtrar.Interfaces.PredicadoFiltrador;

public class OnlyPares implements PredicadoFiltrador {
    public Boolean test(Integer valor) {
        return valor%2==0;
    }
}
