public class TesteImpressora {
    public static void main(String[] args) {
        
        Impressora imp = new Impressora();

        float a = 2.3f; 
        float b = 3.5f; 
        String s = "Ola float com string";
        String s1 = "Ola";
        String s2 = "Sequencia";
        String s3 = "De tres Strings";
        int x1 = 20;
        int x2 = 21;
        
        imp.exibir (a); //1.1
        imp.exibir (a,b); //1.2
        imp.exibir (a, s); //1.3
        imp.exibir (s, a); //1.4
        imp.exibir (s1, s2, s3); //1.5
        imp.exibir (x1, x2, s1); //1.6
        
    }

}
