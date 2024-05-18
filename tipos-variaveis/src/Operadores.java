public class Operadores {
    public static void main(String[] args) {
        String nomeUm = "Poppy";
        String nomeDois = new String("Poppy");

        System.out.println(nomeUm.equals(nomeDois));
        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 == numero2){
            System.out.println("a nossa condição é verdadeira");
        }

        System.out.println("númeroUm é igual a númeroDois ? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("númeroUm é diferente de númeroDois ? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("númeroUm é maior que númeroDois ? " + simNao);


    }
}
