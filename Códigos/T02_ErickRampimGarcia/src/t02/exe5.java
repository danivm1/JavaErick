 /**
    * exe5
    *
    * @author Erick Rampim Garcia
*/

package t02;

import java.io.IOException;
import java.util.Scanner;

public class exe5 {
    public static void main(String... arg) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //Limpar tela

        Scanner sc = new Scanner(System.in); //Instancia objeto para entrada de dados pelo usuário.

        System.out.print("Quantidade de DVDs em estoque: ");
        int estoque = sc.nextInt(); //Lê a entrada sobre a quantia de DVDs na locadora e a armazena na variável 'estoque' de tipo inteiro.

        System.out.print("Preço por aluguel: ");
        double preco = sc.nextDouble(); //Lê a entrada sobre o preço do aluguel e o armazena na variável 'preco' de tipo double (um tipo real).

        double fatAnual = estoque*preco*4; //Faz a conta da fatura anual levando em consideração o fato de que apenas, em média, 33% do estoque é alugado por mês e armazena o valor na variável double 'fatAnual'. Esta fórmula é uma forma simplificada da original: (estoque/3)*preco*12.

        String sFatAnual = String.format("Fatura anual: R$%.2f", fatAnual); //Formata uma String com o valor da fatura anual com 2 casas decimais e a armazena em 'sFatAnuel'.
        System.out.println("\n" + sFatAnual); //Exibe ao usuário a String criada acima.

        double lucroAtrasoMes = estoque*preco*0.003333; //Calcula o lucro extra obtido pelas multas por atraso da devoluçao dos itens alugados, baseando-se no fato de que apenas 10% dos DVDs alugados são devolvidos com atraso e que apenas 33% do estoque é alugado (médias mensais). A fórmula utilizada é uma simplificação da seguinte: (estoque/3)*(preco*0,1).

        String sLucroAtrasoMes = String.format("Lucro mensal por atraso: R$%.2f", lucroAtrasoMes); //Formata uma String com o valor do lucro mensal derivado dos atrasos na devoluçao com 2 casas decimais e a armazena em 'sLucroAtrasoMes'.
        System.out.println("\n" + sLucroAtrasoMes); //Exibe ao usuário a String criada acima.

        sc.close(); //Invoca o método 'close()' do Scanner para finalizá-lo.
    }
}
