package Concrete;

import Interface.Bebida;

public class Helado implements Bebida {

    @Override
    public String getDescripcion() {
        return "Helado";
    }

    @Override
    public double precio() {
        return 9000;
    }

}
