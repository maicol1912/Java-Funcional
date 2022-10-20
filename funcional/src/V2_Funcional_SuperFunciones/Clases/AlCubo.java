package V2_Funcional_SuperFunciones.Clases;


import V2_Funcional_SuperFunciones.Interfaces.Funcion;

public class AlCubo implements Funcion {

    @Override
    public Integer aplicar(Integer valor) {
        return valor*valor*valor;
    }
}
