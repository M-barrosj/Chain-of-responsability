/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chainofresponsability;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author JCMB
 */
public class LoginCheckHandler extends AutenticacaoHandler {
    private List<String> logins = Arrays.asList("login1", "login2", "login3");

    public boolean handle(String login, String senha) {
        // Verificando se o login está cadastrado
        if (logins.contains(login)) {
            return next != null ? next.handle(login, senha) : true;
        }
        return false;
    }
}