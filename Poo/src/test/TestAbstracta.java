package test;

import abstractas.*;

public class TestAbstracta {

    public static void main(String[] args) {
        FiguraGeometrica figura = new Rectangulo("Rectangulo1");
        figura.dibujar();

        figura = new Cuadrado("Cuadrado1");
        figura.dibujar();
    }
}
