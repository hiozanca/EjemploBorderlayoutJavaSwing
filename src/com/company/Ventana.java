package com.company;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame{
    private JButton boton1, boton2,boton3, boton4, boton5;

    public Ventana(){
        super("ejemplo borderLayout");
        boton1 = new JButton("boton1");
        boton2 = new JButton("boton2");
        boton3 = new JButton("boton3");
        boton4 = new JButton("boton4");
        boton5 = new JButton("boton5");
        setLayout(new BorderLayout());
        //add(boton1, BorderLayout.NORTH);
        add(boton2, BorderLayout.CENTER);
        //add(boton3, BorderLayout.SOUTH);
        add(boton4, BorderLayout.WEST);
        add(boton5, BorderLayout.EAST);
    }

}
