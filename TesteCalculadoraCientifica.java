import java.text.DecimalFormat;
public class TesteCalculadoraCientifica { 
    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("#.##");
        
        //CalculadoraCientifica radiciacao = new CalculadoraCientifica();
        int a = 25;
        double b = 2.5;
        String s = "25.5";
    
        System.out.println("\nLista de parametro com um inteiro: " + CalculadoraCientifica.raiz(a));//3.1.1
        System.out.println("Lista de parametro com um double: " + df.format(CalculadoraCientifica.raiz(b)));//3.1.2
        System.out.println("Lista de parametro com uma String: " + df.format (CalculadoraCientifica.raiz(s)));//3.1.3

        byte x = 4;
        byte y = 2;
        String s1 = "4";
        String s2 = "2";

        System.out.println("Lista de parametro com dois bytes: " + CalculadoraCientifica.potencia(x, y));//3.2.1
        System.out.println("Lista de parametro com duas Strings: " + CalculadoraCientifica.potencia(s1, s2)); //3.2.2
        System.out.println("Lista de parametro com um inteiro e um double: " + CalculadoraCientifica.potencia(a, b)); //3.2.3
        
    }
}