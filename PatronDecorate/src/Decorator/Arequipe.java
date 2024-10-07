package Decorator;

public class Arequipe extends BebidaDecorator{

    public Arequipe(BebidaDecorator arequipe) {
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
