/* 
* Calculadora IPO
*/
package calculadora;

/**
 *
 * @author Sofia Serrano
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VCalculadora v = new VCalculadora(new Calcular());
        v.setVisible(true);
        v.setTitle("Calculadora IPO");
    }
   
}
