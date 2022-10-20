package V2_Funcional_SuperFunciones.Clases;

import V2_Funcional_SuperFunciones.Interfaces.Proveedor;


import java.util.Random;

public class Aleatorio implements Proveedor {
    Random random = new Random();
    @Override
    public Integer obtener() {
        return random.nextInt(1000);
    }
}
