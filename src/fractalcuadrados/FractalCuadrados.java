/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fractalcuadrados;

import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Color;

/**
 *
 * @author Carlos
 */
public class FractalCuadrados extends JFrame{

    FractalCuadrados(){
        super("Fractal cuadrados");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(Color.black);
        setSize(700, 700);
        setResizable(false);
        setVisible(true);
    }

    public void drawFractal(int cx, int cy,int y, Graphics g){
        g.setColor(Color.blue);
        g.drawRect(cx,cy,y,y); 

        if(y>10)
        {
            drawFractal(cx+3,cy+3,(y/2)-6,g); 
            drawFractal((cx+y/2)+3,cy+3,(y/2)-6,g); 
            drawFractal(cx+3,cy+(y/2)+3,(y/2)-6,g); 
            drawFractal((cx+y/2)+3,cy+(y/2)+3,(y/2)-6,g); 
        }
    }
    
        public void paint(Graphics g){
            drawFractal(25,35,650,g);
        }

        public static void main(String[] args){
            new FractalCuadrados();
        }
}
