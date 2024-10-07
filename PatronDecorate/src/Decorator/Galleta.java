package Decorator;

public class Galleta extends BebidaDecorator{

    public Galleta(BebidaDecorator toppings){
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
