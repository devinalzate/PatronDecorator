package Decorator;

public class ArequipeDecorator extends BebidaDecorator{

    public ArequipeDecorator(BebidaDecorator arequipe) {
        super(arequipe);
    }
    
    @Override
    public String getDescripcion(){
        return getBebida().getDescripcion() + " + arequipe";
    }

    @Override
    public double precio(){
        return getBebida().precio() + 1000;
    }
}
