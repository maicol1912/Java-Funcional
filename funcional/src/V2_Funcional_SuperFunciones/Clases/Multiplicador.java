package V2_Funcional_SuperFunciones.Clases;

import V2_Funcional_SuperFunciones.Interfaces.FuncionBinaria;

public class Multiplicador implements FuncionBinaria {
    @Override
    public Integer aplicar(Integer valor1, Integer valor2) {
        return valor1*valor2;
    }
}
