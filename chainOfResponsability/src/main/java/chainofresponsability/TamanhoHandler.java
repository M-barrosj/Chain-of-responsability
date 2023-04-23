/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chainofresponsability;

/**
 *
 * @author JCMB
 */
public class TamanhoHandler extends AutenticacaoHandler {
    public boolean handle(String login, String senha) {
        // Verificando se a senha tem pelo menos 8 e no máximo 16 caracteres
        if (senha.length() >= 8 && senha.length() <= 16) {
            return next != null? next.handle(login, senha) : true;
}
return false;
}
}