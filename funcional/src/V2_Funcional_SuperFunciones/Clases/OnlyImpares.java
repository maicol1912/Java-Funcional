package V2_Funcional_SuperFunciones.Clases;


import V2_Funcional_SuperFunciones.Interfaces.PredicadoFiltrador;

public class OnlyImpares implements PredicadoFiltrador {
    @Override
    public Boolean test(Integer valor) {
        return valor%2!=0;
    }
}
