package Decorator;

import Interface.Bebida;

public class Mani extends BebidaDecorator {

    public Mani(Bebida toppings) {
        super(toppings);
    }

    @Override
    public String getDescripcion() {
        return getBebida().getDescripcion() + " + Mani";
    }

    @Override
    public double precio() {
        return getBebida().precio() + 1000;
    }
}
