package app;

import java.util.Scanner;

import conta.Conta;
import pessoa.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        final int VET_PESSOAS = 50;
        final int VET_CONTAS = 50;

        Pessoa[] pessoas = new Pessoa[VET_PESSOAS];
        Conta[] conta = new Conta[VET_CONTAS];

        String nome, cpf, rg;
        int op, op2;
        do {
            System.out.println("\n\n===[Menu Principal]===");
            System.out.println("1 - Pessoa");
            System.out.println("2 - Conta");
            System.out.println("3 - Sair");
            System.out.println("Digite uma opção: ");
            op = leitor.nextInt();
            switch (op) {
                case 1:
                    do{
                    System.out.println("\n\n===[Pessoa]===");
                    System.out.println("1 - Cadastrar");
                    System.out.println("2 - Alterar");
                    System.out.println("3 - Excluir");
                    System.out.println("4 - Consultar");
                    System.out.println("5 - Imprimir");
                    System.out.println("6 - Voltar ao menu principal");
                    System.out.println("Opção: ");
                    op2 = leitor.nextInt();
                    switch (op2) {
                        case 1:
                            
                            break;
                    
                        default:
                            break;
                    }
                }while(op2 != 6);
                break;
                case 2:
                do{
                System.out.println("\n\n===[Pessoa]===");
                System.out.println("1 - Cadastrar");
                System.out.println("2 - Alterar");
                System.out.println("3 - Excluir");
                System.out.println("4 - Consultar");
                System.out.println("5 - Imprimir");
                System.out.println("6 - Voltar ao menu principal");
                System.out.println("Opção: ");
                op2 = leitor.nextInt();
                switch (op2) {
                    case 1:
                        
                        break;
                
                    default:
                        break;
                }
                }while(op2 != 6);
                break;
                default:
                    break;
            }
        } while (op != 3);
    }

    
}