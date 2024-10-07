import java.util.Scanner;

public class Excecao {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner leitor = new Scanner(System.in);

        try {
        
        System.out.println("Bem vindo ao Sistema");
        System.out.print("Digite seu nome: ");
        String nome = leitor.next();
        
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = leitor.next();
        
        System.out.print("Digite sua idade: ");
        String idade = leitor.next();
        Integer.parseInt(idade);
        
        System.out.print("Digite sua altura: ");
        String altura = leitor.next();
        Double.parseDouble(altura);
    

        System.out.println();
        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + " metros");
        

        } catch (NumberFormatException e) {

            
            System.out.println("Você inseriu um texto onde deveria ser um número");
        } 

    }


}
