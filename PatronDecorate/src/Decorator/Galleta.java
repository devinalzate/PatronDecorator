package Decorator;

import Interface.Bebida;

public class Galleta extends BebidaDecorator {

    public Galleta(Bebida toppings) {
        super(toppings);
    }

    @Override
    public String getDescripcion() {
        return getBebida().getDescripcion() + " + Galleta";
    }

    @Override
    public double precio() {
        return getBebida().precio() + 800;
    }
}
