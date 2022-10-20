package V2_Funcional_SuperFunciones.Clases;


import V2_Funcional_SuperFunciones.Interfaces.PredicadoFiltrador;

public class OnlyPares implements PredicadoFiltrador {
    public Boolean test(Integer valor) {
        return valor%2==0;
    }
}
