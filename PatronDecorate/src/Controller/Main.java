package Controller;

import javax.swing.SwingUtilities;

import Vista.MainVista;

public class Main {
    public static void main(String[] args){
        System.out.println();
        SwingUtilities.invokeLater(new Runnable(){

            @Override
            public void run() {
                new MainVista();
            }

        });
    }
}