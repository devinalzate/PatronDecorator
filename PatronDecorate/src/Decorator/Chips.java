package Decorator;

public class Chips extends BebidaDecorator{

    public Chips(BebidaDecorator chips) {
        super(chips);
    }
    
    @Override
    public String getDescripcion(){
        return getBebida().getDescripcion() + " + Chips de colores";
    }

    @Override
    public double precio(){
        return getBebida().precio() + 600;
    }
    
}
