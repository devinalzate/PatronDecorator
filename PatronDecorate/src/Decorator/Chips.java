package Decorator;

import Interface.Bebida;

public class Chips extends BebidaDecorator {

    public Chips(Bebida chips) {
        super(chips);
    }

    @Override
    public String getDescripcion() {
        return getBebida().getDescripcion() + " + Chips de colores";
    }

    @Override
    public double precio() {
        return getBebida().precio() + 600;
    }

}
