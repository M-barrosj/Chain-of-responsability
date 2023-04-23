/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chainofresponsability;

/**
 *
 * @author JCMB
 */
public class TresNumerosHandler extends AutenticacaoHandler {
    public boolean handle(String login, String senha) {
        // Verificando se a senha não possui 3 números consecutivos na sequência
        if (!senha.matches(".*\\d{3}.*")) {
            return next != null ? next.handle(login, senha) : true;
        }
        return false;
    }
}