/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chainofresponsability;

/**
 *
 * @author JCMB
 */
public class NumeroHandler extends AutenticacaoHandler {
    public boolean handle(String login, String senha) {
        // Verificando se a senha possui um número
        if (senha.matches(".*[0-9].*")) {
            return next != null ? next.handle(login, senha) : true;
        }
        return false;
    }
}
