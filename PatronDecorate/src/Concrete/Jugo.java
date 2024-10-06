package Concrete;

import Interface.*;

public class Jugo implements Bebida {
    @Override
    public String getDescripcion(){
        return "Jugo";
    }

    @Override
    public double precio() {
        return 2000.0;
    }
    
}
