package V2_Funcional_SuperFunciones.Clases;

import V2_Funcional_SuperFunciones.Interfaces.Proveedor;


import java.util.Random;

public class Naturales implements Proveedor {
    private static int next = 0;
    Random random = new Random();
    @Override
    public Integer obtener() {
        return next++;
    }
}
