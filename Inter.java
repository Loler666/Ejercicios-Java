package interfazaula;

import java.awt.*;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Inter extends JFrame implements ActionListener {

    //botones
    JButton bsalir, bsiguiente, brespuestas, blimpiar;
    JTextField check1, check2, check3, check4, check5, check6, check7,check8, check9, check10;
    JLabel pregunta1, pregunta2, pregunta3,pregunta4, pregunta5, pregunta6, pregunta7, pregunta8, pregunta9,pregunta10; 
    JLabel res1, res2, res3, res4, res5, res6, res7, res8, res9, res10;
    
    
    public Inter(){
        
        inicio2();
        
    }
    
    public void inicio2(){
        
        Container contenedor=getContentPane();
        setBounds(0,0,1000,1000);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setTitle("Cuestionario");
        setResizable(false);
        
        pregunta1 = new JLabel(" ¿Para que sirve este programa? ");
        pregunta1.setBounds(100,30,100,30);
        contenedor.add(pregunta1);
        
        pregunta2 = new JLabel(" ¿Open cv es exclusivamente para el lenguaje de java? ");
        pregunta2.setBounds(100,50,100,30);
        contenedor.add(pregunta2);
        
        pregunta3 = new JLabel(" ¿Cuanto tiempo se tomo para este proyecto? ");
        pregunta3.setBounds(100,80,100,30);
        contenedor.add(pregunta3);
        
        pregunta4 = new JLabel(" ¿Que fue lo mas dificil de hacer? ");
        pregunta4.setBounds(100,110,100,30);
        contenedor.add(pregunta4);
        
        pregunta5 = new JLabel(" ¿Usted sabe lo que significa BGR? ");
        pregunta5.setBounds(100,130,100,30);
        contenedor.add(pregunta5);
        
        pregunta6 = new JLabel(" ¿Que es HSV?, expliquelo brevemente ");
        pregunta6.setBounds(100,150,100,30);
        contenedor.add(pregunta6);
        
        pregunta7 = new JLabel(" ¿Para que se hizo este proyecto? ");
        pregunta7.setBounds(100,180,100,30);
        contenedor.add(pregunta7);
        
        pregunta8 = new JLabel(" ¿De que se deriva este proyecto de vision artificial? ");
        pregunta8.setBounds(100,200,100,30);
        contenedor.add(pregunta8);
        
        pregunta9 = new JLabel(" ¿Como se puede marcar un objeto en la camara? ");
        pregunta9.setBounds(100,220,100,30);
        contenedor.add(pregunta9);
        
        pregunta10 = new JLabel(" ¿Para que nos sirve saber los colores de BGR y como manipularlos? ");
        pregunta10.setBounds(100,250,100,30);
        contenedor.add(pregunta10);

        bsalir =new JButton("Menu");
        bsalir.setBounds(10,30,100,30);
        bsalir.addActionListener(this);
        contenedor.add(bsalir);
        
        brespuestas = new JButton("Comprobar");
        brespuestas.setBounds(10,70,100,30);
        brespuestas.addActionListener(this);
        contenedor.add(brespuestas);
        
        bsiguiente = new JButton("Siguente");
        bsiguiente.setBounds(10,110,100,30);
        bsiguiente.addActionListener(this);
        contenedor.add(bsiguiente);
        
        blimpiar = new JButton("Limpiar");
        blimpiar.setBounds(10,150,100,30);
        blimpiar.addActionListener(this);
        contenedor.add(blimpiar);
        
        check1 = new JTextField("");
        check1.setBounds(250,20,50,80);
        contenedor.add(check1);
        
        check2 = new JTextField("");
        check2.setBounds(250, 50, 50, 80);
        contenedor.add(check2);
        
        check3 = new JTextField("");
        check3.setBounds(250,80,50,80);
        contenedor.add(check3);
        
        check4 = new JTextField("");
        check4.setBounds(250, 110, 50, 80);
        contenedor.add(check4);
        
        check5 = new JTextField("");
        check5.setBounds(250, 140, 50, 80);
        contenedor.add(check5);
        
        check6 = new JTextField("");
        check6.setBounds(250, 140, 50, 80);
        contenedor.add(check6);
        
        check7 = new JTextField("");
        check7.setBounds(250, 140, 50, 80);
        contenedor.add(check7);
        
        check8 = new JTextField("");
        check8.setBounds(250, 140, 50, 80);
        contenedor.add(check8);
        
        check9 = new JTextField("");
        check9.setBounds(250, 140, 50, 80);
        contenedor.add(check9);
        
        check10 = new JTextField("");
        check10.setBounds(250, 140, 50, 80);
        contenedor.add(check10);
        
        res1 = new JLabel("");
        res1.setBounds(250, 140, 50, 80);
        contenedor.add(res1);
        
        res2 = new JLabel("");
        res2.setBounds(250, 140, 50, 80);
        contenedor.add(res2);
        
        res3 = new JLabel("");
        res3.setBounds(250, 140, 50, 80);
        contenedor.add(res3);
        
        res4 = new JLabel("");
        res4.setBounds(250, 140, 50, 80);
        contenedor.add(res4);
        
        res5 = new JLabel("");
        res5.setBounds(250, 140, 50, 80);
        contenedor.add(res5);
        
        res6 = new JLabel("");
        res6.setBounds(250, 140, 50, 80);
        contenedor.add(res6);
        
        res7 = new JLabel("");
        res7.setBounds(250, 140, 50, 80);
        contenedor.add(res7);
        
        res8 = new JLabel("");
        res8.setBounds(250, 140, 50, 80);
        contenedor.add(res8);
        
        res9 = new JLabel("");
        res9.setBounds(250, 140, 50, 80);
        contenedor.add(res9);
        
        res10 = new JLabel("");
        res10.setBounds(250, 140, 50, 80);
        contenedor.add(res10);
        
    }

    @Override
    public void actionPerformed(ActionEvent event) {
       
        if(event.getSource()== bsalir){
       
            accionboton();
        
        }else if(event.getSource()==brespuestas){
            
            accionbuton1();
            
        }else if(event.getSource()==bsiguiente){
        
            accionboton2();
            
        }else if(event.getSource()==blimpiar){
            
            accionboton3();
            
        }
       
       
        
    }

    private void accionboton() {
       this.show(false);
       new menu.show(true);
    }

    private void accionbuton1() {
        if (check1.getText().equalsIgnoreCase("sigue una pelota") || check1.getText().equalsIgnoreCase("sigue una pelota")){ 
            this.res1.setText("Correcto");
            this.res1.setForeground(Color.green);
    }else{
            this.res1.setText("Incorrecto");
            this.res1.setForeground(Color.red);
        }
        
        if (check2.getText().equalsIgnoreCase("no tambien se usa en phyton")||check2.getText().equalsIgnoreCase("no")){ 
            this.res2.setText("Correcto");
            this.res2.setForeground(Color.green);
    }else{
            this.res2.setText("Incorrecto");
            this.res2.setForeground(Color.red);
        }
        
        if (check3.getText().equalsIgnoreCase("2 semanas")||check3.getText().equalsIgnoreCase("dos semanas")){ 
            this.res3.setText("Correcto");
            this.res3.setForeground(Color.green);
    }else{
            this.res3.setText("Incorrecto");
            this.res3.setForeground(Color.red);
        }
        
        if (check4.getText().equalsIgnoreCase("la camara")||check4.getText().equalsIgnoreCase("camara")){ 
            this.res4.setText("Correcto");
            this.res4.setForeground(Color.green);
    }else{
            this.res4.setText("Incorrecto");
            this.res4.setForeground(Color.red);
        }
        
        if (check5.getText().equalsIgnoreCase("blue, green, red")||check5.getText().equalsIgnoreCase("blue green red")||check5.getText().equalsIgnoreCase("azul, verde y rojo")||check5.getText().equalsIgnoreCase("azul, verde, rojo")||check5.getText().equalsIgnoreCase("azul verde rojo")){ 
            this.res5.setText("Correcto");
            this.res5.setForeground(Color.green);
    }else{
            this.res5.setText("Incorrecto");
            this.res5.setForeground(Color.red);
        }
        
        if (check6.getText().equalsIgnoreCase("Un modelo de colores")||check6.getText().equalsIgnoreCase("modelo de colores")){ 
            this.res6.setText("Correcto");
            this.res6.setForeground(Color.green);
    }else{
            this.res6.setText("Incorrecto");
            this.res6.setForeground(Color.red);
        }
        
        if (check7.getText().equalsIgnoreCase("para pasar")||check7.getText().equalsIgnoreCase("aprobar")){ 
            this.res7.setText("Correcto");
            this.res7.setForeground(Color.green);
    }else{
            this.res7.setText("Incorrecto");
            this.res7.setForeground(Color.red);
        }
        
        if (check8.getText().equalsIgnoreCase("inteligencia artificial")){ 
            this.res8.setText("Correcto");
            this.res8.setForeground(Color.green);
    }else{
            this.res8.setText("Incorrecto");
            this.res8.setForeground(Color.red);
        }
        
        if (check9.getText().equalsIgnoreCase("con codigo")||check9.getText().equalsIgnoreCase("con las librerias de open cv")){ 
            this.res9.setText("Correcto");
            this.res9.setForeground(Color.green);
    }else{
            this.res9.setText("Incorrecto");
            this.res9.setForeground(Color.red);
        }
        
        if (check10.getText().equalsIgnoreCase("para hacer reconocimiento facial")||check10.getText().equalsIgnoreCase("reconocimiento")||check10.getText().equalsIgnoreCase("rastreamiento")){ 
            this.res10.setText("Correcto");
            this.res10.setForeground(Color.green);
    }else{
            this.res10.setText("Incorrecto");
            this.res10.setForeground(Color.red);
        }
        
        
    }

    private void accionboton2() {
        this.show(false);
        new info.show(true);
    }
    private void accionboton3() {
        
        this.check1.setText("");
        this.check2.setText("");
        this.check3.setText("");
        this.check4.setText("");
        this.check5.setText("");
        this.check6.setText("");
        this.check7.setText("");
        this.check8.setText("");
        this.check9.setText("");
        this.check10.setText("");
        this.res1.setText("");
        this.res2.setText("");
        this.res3.setText("");
        this.res4.setText("");
        this.res5.setText("");
        this.res6.setText("");
        this.res7.setText("");
        this.res8.setText("");
        this.res9.setText("");
        this.res10.setText("");

                
    }
    }
