/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package chainofresponsability;

/**
 *
 * @author JCMB
 */
public class ChainOfResponsability {

    public static void main(String[] args) {
        AutenticacaoChain chain = new AutenticacaoChain();
        // Testando com um login válido e uma senha válida
    String login = "login1";
    String senha = "Senha2023@";
    boolean autenticado = chain.autenticar(login, senha);
    System.out.println("Login: " + login + ", Senha: " + senha + ", Autenticado: " + autenticado);

    // Testando com um login inválido e uma senha inválida
    login = "login4";
    senha = "abcd";
    autenticado = chain.autenticar(login, senha);
    System.out.println("Login: " + login + ", Senha: " + senha + ", Autenticado: " + autenticado);
       
    }
}
