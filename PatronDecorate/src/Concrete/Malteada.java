package Concrete;

import Interface.*;

public class Malteada implements Bebida {
    @Override
    public String getDescripcion() {
        return "Malteada";
    }

    @Override
    public double precio() {
        return 7000.0;
    }

}
