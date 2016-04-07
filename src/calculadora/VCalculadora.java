/* 
* Calculadora IPO
*/
package calculadora;

import java.awt.event.*;

import javax.swing.*;
import java.awt.*;
import static java.lang.Double.parseDouble;

/**
 *
 * @author Sofia Serrano
 */
public class VCalculadora extends JFrame implements
        ActionListener, KeyListener{
    
    /*Creamos las variables, botones, cajas de texto*/
    
    private Calcular calcular;
    private GestorEventos gestor;
    private JTextField screen;
    private JButton btn_default;
    private JButton btn_dividir;
    private JButton btn_igual;
    private JButton btn_mult;
    private JButton btn_num0;
    private JButton btn_num1;
    private JButton btn_num2;
    private JButton btn_num3;
    private JButton btn_num4;
    private JButton btn_num5;
    private JButton btn_num6;
    private JButton btn_num7;
    private JButton btn_num8;
    private JButton btn_num9;
    private JButton btn_punto;
    private JButton btn_restar;
    private JButton btn_suma;
    private JButton btn_C;
    private JButton btn_CE;
    private JButton btn_abrirPar;
    private JButton btn_cerrarPar;
    private JPanel panel;
    private int X, Y;
    private boolean operacion;
    
      private JTextField resultado= new JTextField(30);
    
    /*Constructor de la clase*/
    
    public VCalculadora(Calcular c) {
        /*Inicializamos las variables*/
        this.calcular = c;
        this.operacion=false;
                
        panel = new JPanel();
        this.setContentPane(panel);
        
         //creacion imagenes para añadir a botones
        ImageIcon cero=new ImageIcon("Captura0.JPG");
        ImageIcon uno=new ImageIcon("Captura1.JPG");
        ImageIcon dos=new ImageIcon("Captura2.JPG");
        ImageIcon tres=new ImageIcon("Captura3.JPG");
        ImageIcon cuatro=new ImageIcon("Captura4.JPG");
        ImageIcon cinco=new ImageIcon("Captura5.JPG");
        ImageIcon seis=new ImageIcon("Captura6.JPG");
        ImageIcon siete=new ImageIcon("Captura7.JPG");
        ImageIcon ocho=new ImageIcon("Captura8.JPG");
        ImageIcon nueve=new ImageIcon("Captura9.JPG");
        ImageIcon punto=new ImageIcon("CapturaPunto.JPG");
        ImageIcon igual=new ImageIcon("CapturaIgual.JPG");
        ImageIcon suma=new ImageIcon("CapturaMas.JPG");
        ImageIcon resta=new ImageIcon("CapturaMenos.JPG");
        ImageIcon mult=new ImageIcon("CapturaPor.JPG");
        ImageIcon div=new ImageIcon("CapturaDivision.JPG");
        ImageIcon cboton=new ImageIcon("CapturaC.JPG");
        ImageIcon ce=new ImageIcon("CapturaCE.JPG");
        ImageIcon abrirPar=new ImageIcon("CapturaAbreParent.JPG");
        ImageIcon cerrarPar=new ImageIcon("CapturaCierraParent.JPG");
        
        screen = new JTextField(20);
        btn_mult = new JButton(mult);
        btn_restar = new JButton(resta);
        btn_suma = new JButton(suma);
        btn_dividir = new JButton(div);
        btn_num7 = new JButton(siete);
        btn_num9 = new JButton(nueve);
        btn_num8 = new JButton(ocho);
        btn_num5 = new JButton(cinco);
        btn_num6 = new JButton(seis);
        btn_num4 = new JButton(cuatro);
        btn_num1 = new JButton(uno);
        btn_default = new JButton(cboton);
        btn_num2 = new JButton(dos);
        btn_num0 = new JButton(cero);
        btn_num3 = new JButton(tres);
        btn_igual = new JButton(igual);
        btn_punto = new JButton(punto);
        btn_C = new JButton(cboton);
        btn_CE = new JButton(ce);
        btn_abrirPar = new JButton(abrirPar);
        btn_cerrarPar = new JButton(cerrarPar);
        
        /*Aniadimos las variables al panel y creamos la interfaz*/
        panel.setLayout(new BorderLayout(2,3));
        panel.add(screen, BorderLayout.NORTH);
        //panel.add(btn_igual, BorderLayout.SOUTH);
                
        X=Y=4;
        JPanel panelCentro = new JPanel();
        GridLayout centro = new GridLayout(X,Y);
        panelCentro.setLayout(centro);
        panelCentro.add(btn_C);
        panelCentro.add(btn_num7);
        panelCentro.add(btn_num8);
        panelCentro.add(btn_num9);
        panelCentro.add(btn_dividir);
        
        panelCentro.add(btn_CE);
        panelCentro.add(btn_num4);
        panelCentro.add(btn_num5);
        panelCentro.add(btn_num6);
        panelCentro.add(btn_mult);
        
        panelCentro.add(btn_abrirPar);
        panelCentro.add(btn_num1);
        panelCentro.add(btn_num2);
        panelCentro.add(btn_num3);
        panelCentro.add(btn_restar);
        
        panelCentro.add(btn_cerrarPar);
        panelCentro.add(btn_num0);
        panelCentro.add(btn_punto);
        panelCentro.add(btn_igual);
        panelCentro.add(btn_suma);
        
        this.add(panelCentro, BorderLayout.CENTER);
        
        /*Damos formato a los botones*/
        getFormat();
        
        /*Action Listener a los botones*/
        btn_num0.addActionListener(this);
        btn_num1.addActionListener(this);
        btn_num2.addActionListener(this);
        btn_num3.addActionListener(this);
        btn_num4.addActionListener(this);
        btn_num5.addActionListener(this);
        btn_num6.addActionListener(this);
        btn_num7.addActionListener(this);
        btn_num8.addActionListener(this);
        btn_num9.addActionListener(this);
        
        btn_default.addActionListener(this);
        btn_mult.addActionListener(this);
        btn_restar.addActionListener(this);
        btn_suma.addActionListener(this);
        btn_dividir.addActionListener(this);
        btn_igual.addActionListener(this);
        btn_punto.addActionListener(this);
        screen.addActionListener(this);
        
        /*Creamos un objeto de la clase eventos y aniadimos mouse o keylistener*/
        this.gestor = new GestorEventos(this);
        
        btn_num0.addMouseListener(gestor);
        btn_num1.addMouseListener(gestor);
        btn_num2.addMouseListener(gestor);
        btn_num3.addMouseListener(gestor);
        btn_num4.addMouseListener(gestor);
        btn_num5.addMouseListener(gestor);
        btn_num6.addMouseListener(gestor);
        btn_num7.addMouseListener(gestor);
        btn_num8.addMouseListener(gestor);
        btn_num9.addMouseListener(gestor);
        
        btn_default.addMouseListener(gestor);
        btn_mult.addMouseListener(gestor);
        btn_restar.addMouseListener(gestor);
        btn_suma.addMouseListener(gestor);
        btn_dividir.addMouseListener(gestor);
        btn_igual.addMouseListener(gestor);
        btn_punto.addMouseListener(gestor);
        screen.addMouseListener(gestor);
        
        btn_num0.addKeyListener(this);
        btn_num1.addKeyListener(this);
        btn_num2.addKeyListener(this);
        btn_num3.addKeyListener(this);
        btn_num4.addKeyListener(this);
        btn_num5.addKeyListener(this);
        btn_num6.addKeyListener(this);
        btn_num7.addKeyListener(this);
        btn_num8.addKeyListener(this);
        btn_num9.addKeyListener(this);
        
        btn_default.addKeyListener(this);
        btn_igual.addKeyListener(this);
        screen.addKeyListener(this);
          
    }//end-constructor
    
    private void getFormat(){
        this.setLocation(500,150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(320, 350);
                
        screen.setBackground(new Color(204, 255, 255));
        screen.setFont(new Font("SansSerif", 1, 40));
        screen.setHorizontalAlignment(JTextField.RIGHT);
        screen.setText("0.0");
        screen.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        
        btn_igual.setFont(new Font("SansSerif", 1, 24));
        btn_igual.setForeground(new Color(0, 51, 51));
        btn_igual.setFocusable(false);
        btn_igual.setEnabled(false);
                
        btn_num0.setFont(new Font("SansSerif", 1, 24));
        btn_num0.setForeground(new Color(0, 51, 51));
        btn_num0.setFocusable(false);
        
        btn_num1.setFont(new Font("SansSerif", 1, 24));
        btn_num1.setForeground(new Color(0, 51, 51));
        btn_num1.setFocusable(false);
        
        btn_num2.setFont(new Font("SansSerif", 1, 24));
        btn_num2.setForeground(new Color(0, 51, 51));
        btn_num2.setFocusable(false);
        
        btn_num3.setFont(new Font("SansSerif", 1, 24));
        btn_num3.setForeground(new Color(0, 51, 51));
        btn_num3.setFocusable(false);
        
        btn_num4.setFont(new Font("SansSerif", 1, 24));
        btn_num4.setForeground(new Color(0, 51, 51));
        btn_num4.setFocusable(false);
        
        btn_num5.setFont(new Font("SansSerif", 1, 24));
        btn_num5.setForeground(new Color(0, 51, 51));
        btn_num5.setFocusable(false);
        
        btn_num6.setFont(new Font("SansSerif", 1, 24));
        btn_num6.setForeground(new Color(0, 51, 51));
        btn_num6.setFocusable(false);
        
        btn_num7.setFont(new Font("SansSerif", 1, 24));
        btn_num7.setForeground(new Color(0, 51, 51));
        btn_num7.setFocusable(false);
        
        btn_num8.setFont(new Font("SansSerif", 1, 24));
        btn_num8.setForeground(new Color(0, 51, 51));
        btn_num8.setFocusable(false);
        
        btn_num9.setFont(new Font("SansSerif", 1, 24));
        btn_num9.setForeground(new Color(0, 51, 51));
        btn_num9.setFocusable(false);
        
        btn_mult.setFont(new Font("SansSerif", 1, 24));
        btn_mult.setForeground(new Color(0, 51, 51));
        btn_mult.setFocusable(false);
        
        btn_restar.setFont(new Font("SansSerif", 1, 24));
        btn_restar.setForeground(new Color(0, 51, 51));
        btn_restar.setFocusable(false);
        
        btn_suma.setFont(new Font("SansSerif", 1, 24));
        btn_suma.setForeground(new Color(0, 51, 51));
        btn_suma.setFocusable(false);
        
        btn_dividir.setFont(new Font("SansSerif", 1, 24));
        btn_dividir.setForeground(new Color(0, 51, 51));
        btn_dividir.setFocusable(false);
        
        btn_default.setFont(new Font("SansSerif", 1, 24));
        btn_default.setForeground(new Color(0, 51, 51));
        btn_default.setFocusable(false);
        
        btn_punto.setFont(new Font("SansSerif", 1, 24));
        btn_punto.setForeground(new Color(0, 51, 51));
        btn_punto.setFocusable(false);
        
        panel.setBackground(new Color(0, 102, 102));
        panel.setPreferredSize(new Dimension(235, 365));
    }//end-Format
    
    public void btn_sumaActionPerformed(ActionEvent evt) {                                         
        calcular.setOperador('+');
        this.screen.setText("+");
        this.btnDisabled();
        this.btn_igual.setEnabled(true);
    } 
    
    public void btn_restarActionPerformed(ActionEvent evt) {                                         
        calcular.setOperador('-');
        this.screen.setText("-");
        this.btnDisabled();
        this.btn_igual.setEnabled(true);
    }
    
    public void btn_multActionPerformed(ActionEvent evt) {                                         
        calcular.setOperador('*');
        this.screen.setText("*");
        this.btnDisabled();
        this.btn_igual.setEnabled(true);
    }
    
    public void btn_dividirActionPerformed(ActionEvent evt) {                                         
        calcular.setOperador('/');
        this.screen.setText("/");
        this.btnDisabled();
        this.btn_igual.setEnabled(true);
    }
    
    public void btn_igualActionPerformed(ActionEvent evt) { 
        if (screen.getText().equals("+")
           || (screen.getText().equals("-"))
           || (screen.getText().equals("*"))
           || (screen.getText().equals("/"))     
                ){
            calcular.setNum2(0);
        }
        else{
            calcular.setNum2(parseDouble(screen.getText()));
        }
        calcular.resultado();
        if (calcular.getError()==true){
            this.screen.setText("##");
        }
        else{
            this.screen.setText((Double.toString(calcular.getResultado())));
        }
        this.btn_igual.setEnabled(false);
        this.btnEnabled();
        operacion= true;
        calcular.setPunto(false);
        calcular.setNum1(calcular.getResultado());
        calcular.setNum2(0);
    }
    
    public void btn_defaultActionPerformed(ActionEvent evt) {                                         
        calcular.setNum1(0);
        calcular.setNum2(0);
        this.screen.setText("0.0");
        this.btn_igual.setEnabled(false);
        this.btnEnabled();
        calcular.setPunto(true);
    }
    
    public void btn_puntoActionPerformed(ActionEvent evt) {
        if (!calcular.getPunto())
        {
            calcular.setPunto(true);
            this.screen.setText(this.screen.getText()+ ".");
        } 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        btn_num0.requestFocus();
        btn_num1.requestFocus();
        btn_num2.requestFocus();
        btn_num3.requestFocus();
        btn_num4.requestFocus();
        btn_num5.requestFocus();
        btn_num6.requestFocus();
        btn_num7.requestFocus();
        btn_num8.requestFocus();
        btn_num9.requestFocus();
        btn_igual.requestFocus();
        btn_default.requestFocus();
                
        if (e.getSource() == btn_num0 || e.getSource() == btn_num1 || e.getSource() == btn_num2 || 
            e.getSource() == btn_num3 || e.getSource() == btn_num4 || e.getSource() == btn_num5 || 
            e.getSource() == btn_num6 || e.getSource() == btn_num7 || 
            e.getSource() == btn_num8 || e.getSource() == btn_num9){
            
            this.comprobarNuevaOperacion();
                        
            if (e.getSource() == btn_num0)
                gestor.btn_num0ActionPerformed(e);
            else if (e.getSource() == btn_num1)
                gestor.btn_num1ActionPerformed(e);
            else if (e.getSource() == btn_num2)
                gestor.btn_num2ActionPerformed(e);
            else if (e.getSource() == btn_num3)
                gestor.btn_num3ActionPerformed(e);
            else if (e.getSource() == btn_num4)
                gestor.btn_num4ActionPerformed(e);
            else if (e.getSource() == btn_num5)
                gestor.btn_num5ActionPerformed(e);
            else if (e.getSource() == btn_num6)
                gestor.btn_num6ActionPerformed(e);
            else if (e.getSource() == btn_num7)
                gestor.btn_num7ActionPerformed(e);
            else if (e.getSource() == btn_num8)
                gestor.btn_num8ActionPerformed(e);
            else if (e.getSource() == btn_num9)
                gestor.btn_num9ActionPerformed(e);
            operacion = false;
        }//end-botones-numeros
        
        if (e.getSource() == btn_suma || e.getSource() == btn_restar || 
            e.getSource() == btn_mult || e.getSource() == btn_dividir){
            
            if (this.screen.getText().equals("##")
               || this.screen.getText().equals("##.")){
                this.screen.setText("0.0");
            }
            else{
                calcular.setNum1(parseDouble(screen.getText()));
                this.screen.setText("");

                if (e.getSource() == btn_suma)
                    btn_sumaActionPerformed(e);
                else if (e.getSource() == btn_restar)
                    btn_restarActionPerformed(e);
                else if (e.getSource() == btn_mult)
                    btn_multActionPerformed(e);
                else if (e.getSource() == btn_dividir)
                    btn_dividirActionPerformed(e);
                operacion = true;
            }
        }//end-operaciones
        
        if (e.getSource() == btn_igual)
            btn_igualActionPerformed(e);
        else if (e.getSource() == btn_default)
            btn_defaultActionPerformed(e);
        else if (e.getSource() == btn_punto)
            btn_puntoActionPerformed(e);
    }//end-actionperformed
    
    @Override
    public void keyPressed(KeyEvent e) {
        
        if (e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_EQUALS){
            btn_igual.doClick();
        }
        else{
            this.comprobarNuevaOperacion();

            if (e.getKeyCode() == KeyEvent.VK_0)
                btn_num0.doClick();
            else if (e.getKeyCode() == KeyEvent.VK_1)
                btn_num1.doClick();
            else if (e.getKeyCode() == KeyEvent.VK_2)
                btn_num2.doClick();
            else if (e.getKeyCode() == KeyEvent.VK_3)
                btn_num3.doClick();
            else if (e.getKeyCode() == KeyEvent.VK_4)
                btn_num4.doClick();
            else if (e.getKeyCode() == KeyEvent.VK_5)
                btn_num5.doClick();
            else if (e.getKeyCode() == KeyEvent.VK_6)
                btn_num6.doClick();
            else if (e.getKeyCode() == KeyEvent.VK_7)
                btn_num7.doClick();
            else if (e.getKeyCode() == KeyEvent.VK_8)
                btn_num8.doClick();
            else if (e.getKeyCode() == KeyEvent.VK_9)
                btn_num9.doClick(); 
            else if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE)
                btn_default.doClick();
            }
    }
    

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
    public JTextField getTxtResultado() { 
        return screen; 
    }
    
    public void setTxtResultado(JTextField screen) {
        this.screen = screen; 
    }
    
    public void comprobarNuevaOperacion(){
        if (this.screen.getText().equals("0.0") || operacion==true
               || this.screen.getText().equals("##")
               || this.screen.getText().equals("0.")
               || this.screen.getText().equals("##.") ){
                this.screen.setText("");
                calcular.setPunto(false);
            }
    }
    
    public void btnEnabled(){
        this.btn_restar.setEnabled(true);
        this.btn_mult.setEnabled(true);
        this.btn_suma.setEnabled(true);
        this.btn_dividir.setEnabled(true);
    }
    
    public void btnDisabled(){
        this.btn_restar.setEnabled(false);
        this.btn_mult.setEnabled(false);
        this.btn_suma.setEnabled(false);
        this.btn_dividir.setEnabled(false);
    }
}//end-VCalculadora
