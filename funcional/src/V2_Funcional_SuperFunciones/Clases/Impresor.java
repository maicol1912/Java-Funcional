package V2_Funcional_SuperFunciones.Clases;

import V2_Funcional_SuperFunciones.Interfaces.Consumidor;

public class Impresor implements Consumidor {
    @Override
    public void aceptar(Integer valor) {
        System.out.println(valor);
    }
}
