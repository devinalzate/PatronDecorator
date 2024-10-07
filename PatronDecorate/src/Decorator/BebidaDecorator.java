package Decorator;

import Interface.Bebida;

public abstract class BebidaDecorator implements Bebida{
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
    public BebidaDecorator(Bebida bebida) {
        setBebida(bebida);
    }
    public void setBebida(Bebida bebida){
        this.bebida = bebida;
    }
    public Bebida getBebida(){
        return bebida;
    }
}
