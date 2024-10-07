package Vista;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Concrete.Helado;
import Concrete.Malteada;
import Decorator.Arequipe;
import Decorator.Chips;
import Decorator.Galleta;
import Decorator.Mani;
import Interface.Bebida;

public class MainVista extends JFrame {

    private JPanel main;
    private JPanel tiposBebidas;
    private JPanel sabores;
    private JPanel toppings;

    private Bebida heladoObj = null;
    private Bebida malteadaObj = null;
    private int state;
    private String sabor = null;

    public MainVista() {
        setTitle("Tienda de bebidas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new BorderLayout());
        setSize(new Dimension(500, 500));

        tiposBebidas = new JPanel();
        tiposBebidas.setLayout(new FlowLayout());
        tiposBebidas.setPreferredSize(new Dimension(350, 120));
        ImageIcon heladoIcon = new ImageIcon(getClass().getResource("./Images/helado.png"));
        JButton helado = new JButton(heladoIcon);
        helado.setAlignmentX(Component.CENTER_ALIGNMENT);
        JLabel textHelado = new JLabel("HELADO");
        textHelado.setAlignmentX(Component.CENTER_ALIGNMENT);

        ImageIcon malteadaIcon = new ImageIcon(getClass().getResource("./Images/malteada.png"));
        JButton malteada = new JButton(malteadaIcon);
        malteada.setAlignmentX(Component.CENTER_ALIGNMENT);
        JLabel textMalteada = new JLabel("MALTEADA");
        textMalteada.setAlignmentX(Component.CENTER_ALIGNMENT);

        JPanel subTipoBebida1 = new JPanel();
        subTipoBebida1.setLayout(new BoxLayout(subTipoBebida1, BoxLayout.Y_AXIS));
        subTipoBebida1.add(textMalteada);
        subTipoBebida1.add(malteada);

        JPanel subTipoBebida2 = new JPanel();
        subTipoBebida2.setLayout(new BoxLayout(subTipoBebida2, BoxLayout.Y_AXIS));
        subTipoBebida2.add(textHelado);
        subTipoBebida2.add(helado);

        tiposBebidas.add(subTipoBebida1);
        tiposBebidas.add(subTipoBebida2);

        sabores = new JPanel();
        sabores.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));
        JButton fresaButton = new JButton("Fresa");
        JButton chocholatteButton = new JButton("Chocolate");
        JButton vainillaButton = new JButton("Vainilla");
        sabores.add(fresaButton);
        sabores.add(chocholatteButton);
        sabores.add(vainillaButton);
        sabores.setAlignmentX(Component.CENTER_ALIGNMENT);
        main = new JPanel();
        main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
        main.add(tiposBebidas);
        JLabel saboresTxt = new JLabel("Seleccione su sabor:");
        saboresTxt.setAlignmentX(Component.CENTER_ALIGNMENT);
        main.add(saboresTxt);
        main.add(sabores);

        toppings = new JPanel();
        toppings.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        ImageIcon frutosSecos = new ImageIcon(getClass().getResource("./Images/frutas-secas.png"));
        ImageIcon galletas = new ImageIcon(getClass().getResource("./Images/galletas.png"));
        ImageIcon arequipe = new ImageIcon(getClass().getResource("./Images/arequipe.png"));
        ImageIcon chipspChoco = new ImageIcon(getClass().getResource("./Images/chipsChoco.png"));

        JPanel galletaJPanel = new JPanel();
        galletaJPanel.setLayout(new BoxLayout(galletaJPanel, BoxLayout.Y_AXIS));
        JLabel galletatxt = new JLabel("Galletas");
        galletatxt.setAlignmentX(Component.CENTER_ALIGNMENT);
        JButton galletaBtn = new JButton(galletas);
        galletaBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        galletaJPanel.add(galletatxt);
        galletaJPanel.add(galletaBtn);

        JPanel areqJPanel = new JPanel();
        areqJPanel.setLayout(new BoxLayout(areqJPanel, BoxLayout.Y_AXIS));
        JLabel areqtxt = new JLabel("Arequipe");
        areqtxt.setAlignmentX(Component.CENTER_ALIGNMENT);
        JButton areqBtn = new JButton(arequipe);
        areqBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        areqJPanel.add(areqtxt, Component.CENTER_ALIGNMENT);
        areqJPanel.add(areqBtn);

        JPanel chipsChocoJPanel = new JPanel();
        chipsChocoJPanel.setLayout(new BoxLayout(chipsChocoJPanel, BoxLayout.Y_AXIS));
        JLabel chipsChocotxt = new JLabel("Chips de colores");
        chipsChocotxt.setAlignmentX(Component.CENTER_ALIGNMENT);
        JButton chipsChocoBtn = new JButton(chipspChoco);
        chipsChocoBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        chipsChocoJPanel.add(chipsChocotxt);
        chipsChocoJPanel.add(chipsChocoBtn);

        JPanel frutosJPanel = new JPanel();
        frutosJPanel.setLayout(new BoxLayout(frutosJPanel, BoxLayout.Y_AXIS));
        JLabel frutostxt = new JLabel("Frutos Secos");
        frutostxt.setAlignmentX(Component.CENTER_ALIGNMENT);
        JButton frutosBtn = new JButton(frutosSecos);
        frutosBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        frutosJPanel.add(frutostxt);
        frutosJPanel.add(frutosBtn);

        toppings.add(galletaJPanel);
        toppings.add(areqJPanel);
        toppings.add(chipsChocoJPanel);
        toppings.add(frutosJPanel);
        JLabel toppingsTxt = new JLabel("Seleccione sus toppings (Con Costo adicional):");
        toppingsTxt.setAlignmentX(Component.CENTER_ALIGNMENT);
        main.add(toppingsTxt);
        main.add(toppings);

        add(main, BorderLayout.CENTER);

        JButton confirmBtn = new JButton("Confirmar pedido");
        confirmBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(confirmBtn, BorderLayout.SOUTH);

        helado.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                heladoObj = new Helado();
                state = 1;
                System.out.println(state);

            }

        });
        malteada.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                malteadaObj = new Malteada();
                state = 2;
                System.out.println(state);

            }
        });

        fresaButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                sabor = "Fresa";
                System.out.println(sabor);
            }
        });

        chocholatteButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                sabor = "Chocolate";
            }

        });

        vainillaButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                sabor = "Vainilla";
                System.out.println(sabor);

            }
        });

        frutosBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (state == 1) {
                    heladoObj = new Mani(heladoObj);
                } else if (state == 2) {
                    malteadaObj = new Mani(malteadaObj);
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione un tipo de bebida primero por favor");
                }
            }
        });

        chipsChocoBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (state == 1) {
                    heladoObj = new Chips(heladoObj);
                } else if (state == 2) {
                    malteadaObj = new Chips(malteadaObj);
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione un tipo de bebida primero por favor");
                }
            }
        });
        areqBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (state == 1) {
                    heladoObj = new Arequipe(heladoObj);
                } else if (state == 2) {
                    malteadaObj = new Arequipe(malteadaObj);
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione un tipo de bebida primero por favor");
                }
            }
        });
        galletaBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (state == 1) {
                    heladoObj = new Galleta(heladoObj);
                } else if (state == 2) {
                    malteadaObj = new Galleta(malteadaObj);
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione un tipo de bebida primero por favor");
                }
            }
        });
        confirmBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (state != 0 && sabor != null) {
                    Bebida bebida;
                    if (state == 1) {
                        bebida = heladoObj;
                        JOptionPane.showMessageDialog(null,
                                bebida.getDescripcion() + "\nSabor " + sabor + "\nEl precio total es: "
                                        + bebida.precio());
                    } else if (state == 2) {
                        bebida = malteadaObj;
                        JOptionPane.showMessageDialog(null,
                                bebida.getDescripcion() + "\nSabor " + sabor + "\nEl precio total es: "
                                        + bebida.precio());
                    }

                    sabor = null;
                } else {
                    JOptionPane.showMessageDialog(null,
                            "No ha seleccionado el tipo de bebida o el sabor intentelo de nuevo", "ERROR",
                            JOptionPane.ERROR_MESSAGE);
                }
                state = 0;

            }

        });
    }
}
