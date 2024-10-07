package Decorator;

public class Mani extends BebidaDecorator {
    
    public Mani(BebidaDecorator toppings){
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
