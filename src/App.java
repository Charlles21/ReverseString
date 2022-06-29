public class App {
    public static void main(String[] args) throws Exception {

        String nome = "Socorram-me! Subi no ônibus em Marrocos";

        nome.substring(1);
        System.out.println(reverse(nome));  
        
        
        
    }
    

    public static String reverse(String nome){
        String teste ="";
        for (int i = nome.length() -1 ; i >= 0; i--) {             
            
            teste = teste + nome.charAt(i);
            
        
        }



        return teste;
    }
}
