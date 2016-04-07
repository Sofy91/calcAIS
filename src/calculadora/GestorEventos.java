/* 
* Calculadora IPO
*/
package calculadora;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Sofia Serrano
 */
public class GestorEventos implements MouseListener{
    
    private Color colorAnt;
    private VCalculadora vCalc;
    
    public GestorEventos(VCalculadora calc){
        this.vCalc=calc;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Component comp = e.getComponent();
        colorAnt = comp.getForeground();
        comp.setForeground(new Color(225, 0, 128));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Component comp = e.getComponent();
        comp.setForeground(colorAnt);
    }
    
    public void btn_num0ActionPerformed(ActionEvent evt) {                                         
        vCalc.getTxtResultado().setText(vCalc.getTxtResultado().getText()+ "0");
    }
    
    public void btn_num1ActionPerformed(ActionEvent evt) {                                         
        vCalc.getTxtResultado().setText(vCalc.getTxtResultado().getText()+ "1");
    }
    
    public void btn_num2ActionPerformed(ActionEvent evt) {                                         
        vCalc.getTxtResultado().setText(vCalc.getTxtResultado().getText()+ "2");
    }
    
    public void btn_num3ActionPerformed(ActionEvent evt) {                                         
        vCalc.getTxtResultado().setText(vCalc.getTxtResultado().getText()+ "3");
    }
    
    public void btn_num4ActionPerformed(ActionEvent evt) {                                         
        vCalc.getTxtResultado().setText(vCalc.getTxtResultado().getText()+ "4");
    }
    
    public void btn_num5ActionPerformed(ActionEvent evt) {                                         
        vCalc.getTxtResultado().setText(vCalc.getTxtResultado().getText()+ "5");
    }
    
    public void btn_num6ActionPerformed(ActionEvent evt) {                                         
        vCalc.getTxtResultado().setText(vCalc.getTxtResultado().getText()+ "6");
    }
    
    public void btn_num7ActionPerformed(ActionEvent evt) {                                         
        vCalc.getTxtResultado().setText(vCalc.getTxtResultado().getText()+ "7");
    }
    
    public void btn_num8ActionPerformed(ActionEvent evt) {                                         
        vCalc.getTxtResultado().setText(vCalc.getTxtResultado().getText()+ "8");
    }
    
    public void btn_num9ActionPerformed(ActionEvent evt) {                                         
        vCalc.getTxtResultado().setText(vCalc.getTxtResultado().getText()+ "9");
    }
    
}//end-GestorEventos
