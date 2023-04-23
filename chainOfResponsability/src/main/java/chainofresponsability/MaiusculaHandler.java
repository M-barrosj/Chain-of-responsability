/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chainofresponsability;

/**
 *
 * @author JCMB
 */
public class MaiusculaHandler extends AutenticacaoHandler {
    public boolean handle(String login, String senha) {
        // Verificando se a senha tem um caractere em maiúsculo
        if (senha.matches(".*[A-Z].*")) {
            return next != null ? next.handle(login, senha) : true;
        }
        return false;
    }
}