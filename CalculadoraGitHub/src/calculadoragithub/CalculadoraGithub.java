/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoragithub;

/**
 *
 * @author Pedrete19
 */
/**
 *
 * @version version 19/20
 */
/**
 *
 * @since Febrero 2020
 */
public class CalculadoraGithub {
    private final int num1;
    private final int num2;
/**
 *
 * @param a primer operador
 * @param b segundo operando
 */
    public CalculadoraGithub(int a, int b){
        num1=a;
        num2=b;
    }
/**
 *
 * @return result
 */
    public int suma(){
        int result=num1+num2;
        return result;
    }
    public int resta(){
        int result;
        if (resta2())   result = num1-num2;
        else            result = num2-num1;
        return result;
    }
        
    public boolean resta2(){
        return num1 > num2;
    }
/**
 *
     * @return result
 * @deprecated esta funcion hay que actualizarla
 */
    public int multiplica(){
        int result=num1*num2;
        return result;
    }
    
    public int divide(){
        int result=num1/num2;
        return result;
    }
    
    public Integer divide2(){
        if(num2==0) return null;
        int result=num1/num2;
        return result;
    }
/**
 *
 * @return si el divisor es distinto de cero 
 * @throws ArithmeticException si el divisor es cero
 * @exception  ArithmeticException si el divisor es cero
 */
     public int divide0(){
        if(num2==0) 
            throw new java.lang.ArithmeticException("División por 0");
        else{
            int result=num1/num2;
            return result;
        }
    }

}
