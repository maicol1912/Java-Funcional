package sesion2_Filtrar.Clases;

import sesion2_Filtrar.Interfaces.PredicadoFiltrador;

public class OnlyImpares implements PredicadoFiltrador {
    @Override
    public Boolean test(Integer valor) {
        return valor%2!=0;
    }
}
