package Decorator;

public class ChipsDecorator extends BebidaDecorator{

    public ChipsDecorator(BebidaDecorator chips) {
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
