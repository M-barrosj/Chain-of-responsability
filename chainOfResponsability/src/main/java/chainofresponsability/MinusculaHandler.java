/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chainofresponsability;

/**
 *
 * @author JCMB
 */
public class MinusculaHandler extends AutenticacaoHandler {
    public boolean handle(String login, String senha) {
        // Verificando se a senha possui um caractere em minúsculo
        if (senha.matches(".*[a-z].*")) {
            return next != null ? next.handle(login, senha) : true;
        }
        return false;
    }
}