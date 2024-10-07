package Decorator;

import Interface.Bebida;

public class Arequipe extends BebidaDecorator {

    public Arequipe(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return getBebida().getDescripcion() + " + arequipe";
    }

    @Override
    public double precio() {
        return getBebida().precio() + 1000;
    }
}
