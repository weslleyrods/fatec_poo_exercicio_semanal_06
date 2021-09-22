
public class TesteCalculadoraCientifica {
    
    public static void main(String[] args) {
        
        //CalculadoraCientifica radiciacao = new CalculadoraCientifica();
        int a = 25;
        double b = 2.5;
        String s = "25.5";
        
        System.out.println(CalculadoraCientifica.raiz(a));
        System.out.println(CalculadoraCientifica.raiz(b));
        System.out.println(CalculadoraCientifica.raiz(s));

        byte x = 4;
        byte y = 2;
        String s1 = "4";
        String s2 = "2";

        System.out.println(CalculadoraCientifica.potencia(x, y)); 
        System.out.println(CalculadoraCientifica.potencia(s1, s2)); 
        System.out.println(CalculadoraCientifica.potencia(a, b)); 
        
    }
}




