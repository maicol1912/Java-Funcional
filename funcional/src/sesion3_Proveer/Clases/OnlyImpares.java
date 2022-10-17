package sesion3_Proveer.Clases;

import sesion3_Proveer.Interfaces.PredicadoFiltrador;

public class OnlyImpares implements PredicadoFiltrador {
    @Override
    public Boolean test(Integer valor) {
        return valor%2!=0;
    }
}
