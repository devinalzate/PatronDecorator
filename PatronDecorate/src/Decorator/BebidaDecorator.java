package Decorator;

import Interface.Bebida;

public class BebidaDecorator implements Bebida{
    private Bebida bebida;

    public BebidaDecorator(Bebida bebida){
        this.bebida = bebida;
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion();
    }

    @Override
    public double precio() {
        return bebida.precio();
    }
    
}
