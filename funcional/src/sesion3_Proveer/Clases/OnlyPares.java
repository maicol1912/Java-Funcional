package sesion3_Proveer.Clases;

import sesion3_Proveer.Interfaces.PredicadoFiltrador;

public class OnlyPares implements PredicadoFiltrador {
    public Boolean test(Integer valor) {
        return valor%2==0;
    }
}
