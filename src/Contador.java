import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Contador {
    public static void main(String[] args) throws ParametroInvalidosException {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametroInvalidosException exception) {
            System.out.println("O primeiro parametro deve ser menor que o segundo");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametroInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametroInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        for (int x = 1; x <= contagem; x++) {
            System.out.println("Imprimindo o número " + x);
        }

    }
}

