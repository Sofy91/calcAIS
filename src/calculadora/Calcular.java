/* 
* Calculadora
*/
package calculadora;

/**
 *
 * @author Sofia Serrano
 */
public class Calcular {
    
    private double num1, num2, resultado;
    private char operador;
    private boolean error;
    private boolean punto;

    public Calcular(){
        this.error=false;
        this.punto=true;
    }
    
    private void suma(){
        setResultado (getNum1() + getNum2());
    }
    
    private void resta(){
        setResultado (getNum1() - getNum2());
    }
    
    private void multiplicar(){
        setResultado (getNum1() * getNum2());
    }
    
    private void dividir(){
        if (getNum2()!= 0.0){
            setResultado (getNum1() / getNum2());
        }
        else{
            error();
        }
    }
    
    private void error(){
        setError(true);
    }
    
    public void resultado(){
        setError(false);
        switch(getOperador()){
            case '+':
                suma();
            break;
                
            case '-':
                resta();
            break;
           
            case '*':
                multiplicar();
            break;
                
            case '/':
                dividir();
            break;
            
            default:
                 throw new UnsupportedOperationException("Error");
        }
    }
    
    public double getNum1(){
        return this.num1;
    }
    
    public void setNum1 (double num1){
        this.num1 = num1;
    }
    
    public double getNum2(){
        return this.num2;
    }
    
    public void setNum2 (double num2){
        this.num2 = num2;
    }
    
    public double getResultado(){
        return this.resultado;
    }
    
    public void setResultado (double resultado){
        this.resultado = resultado;
    }  
    
    public char getOperador(){
        return this.operador;
    }
    
    public void setOperador (char operador){
        this.operador = operador;
    }
    
    public boolean getError(){
        return this.error;
    }
    
    public void setError (boolean error){
        this.error = error;
    }
    
    public boolean getPunto() { 
        return punto; 
    }
    
    public void setPunto(boolean punto) { 
        this.punto = punto; 
    }
}//end-Calcular
