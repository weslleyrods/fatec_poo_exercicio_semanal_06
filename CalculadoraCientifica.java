import java.lang.Math;

//classe utilitaria
public class CalculadoraCientifica {

    public static double raiz (int a){
        return Math.sqrt(a);
    }
    public static double raiz (double a){
        return Math.sqrt(a);
    }
    public static double raiz (String s){
        return Math.sqrt(Double.parseDouble(s));
    }

    public static double potencia (byte a, byte b){
        return Math.pow(a, b);
    }

    public static double potencia (String a, String b){
        return Math.pow(Double.parseDouble(a), Double.parseDouble(b));
    }
    
    public static double potencia (int a, double b){
        return Math.pow(a, b);
    }
}
