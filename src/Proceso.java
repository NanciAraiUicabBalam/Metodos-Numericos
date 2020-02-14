import java.math.BigDecimal;
import java.math.RoundingMode;

public class Proceso 
{   //Declaracion de variables
    double valorVerdadero, valorAproximado, resultado;
    //Constructor
    public Proceso()
    {   valorVerdadero = 0;
        valorAproximado = 0;
        resultado = 0;
    } //Fin del constructor
    
    //Metodo para obtener error absoluto
    public double errorAbsoluto(double valorV, double valorA)
    {   valorVerdadero = valorV;
        valorAproximado = valorA;
        double valorAbsoluto = valorVerdadero-valorAproximado;
        resultado = Math.abs(valorAbsoluto);
        return resultado;
    }
    
    //Metodo para obtener error relativo
    public double errorRelativo(double valorV, double valorA)
    {   valorVerdadero = valorV;
        valorAproximado = valorA;
        double valorAbsoluto = (valorVerdadero-valorAproximado)/(valorVerdadero);
        resultado = Math.abs(valorAbsoluto);
        return resultado;
    }
   
    //Metodo para redondear error absoluto
    public double rAbsoluto(double n1, double n2, int d)
    {   double res = errorAbsoluto(n1,n2);
        BigDecimal bd = new BigDecimal(res);
        bd = bd.setScale(d, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    
    //Metodo para redondear error relativo
    public double rRelativo(double n1, double n2, int d)
    {   double res = errorRelativo(n1,n2);
        BigDecimal bd = new BigDecimal(res);
        bd = bd.setScale(d, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    
    //Metodo para truncar error absoluto
    public double tAbsoluto(double n1, double n2, int d)
    {   double res = errorAbsoluto(n1,n2);
        BigDecimal bd = new BigDecimal(res);
        bd = bd.setScale(d, RoundingMode.DOWN);  
        return bd.doubleValue();
    }
    
    //Metodo para truncar error relativo
    public double tRelativo(double n1, double n2, int d)
    {   double res = errorRelativo(n1,n2);
        BigDecimal bd = new BigDecimal(res);
        bd = bd.setScale(d, RoundingMode.DOWN);  
        return bd.doubleValue();
    }
    
} //Fin de la clase
