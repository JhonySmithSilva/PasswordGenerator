import java.util.Arrays;
import java.util.Random;
/**
 * esta classe funciona como um token gerador de senha numericas,
 * muito util para realizar autentificação em dois fatores.
 * O objetivo foi aplicar um pouco dos conhecimentos de POO java
 * 
 * @author jonatas
 * @version  1.0
 * @param args
 */
public class TokenGeradorDesenhasNumericas {

    private static int[] num = new int[6]; 

    /**este metodo gera numeros inteiros randomicos e retorna os mesmos
     * @return um numero inteiro randomico
     */
    private static final int numerosRandomicos() {
        Random gerador = new Random();
        return gerador.nextInt(9);
    }
    /**este metodo recebe um vetor de inteiro e preenche com numeros randomicos
     * @param
     */
    private static final void populandoVetorDeInteiro(int[] vetorInteiro) {                 
        for(int i = 0; i < vetorInteiro.length; i++){
            vetorInteiro[i] = numerosRandomicos();
        }                              
    } 
    /**metodo main, chama o metodo   populandoVetorDeInteiro passando como parametro
     *  um vetor qualquer, e imprime o vetor já com os valores.
    */
    public static void main(String args[]){         
        populandoVetorDeInteiro(num);
        System.out.println(Arrays.toString(num).replaceAll(",", ""));
    }
}