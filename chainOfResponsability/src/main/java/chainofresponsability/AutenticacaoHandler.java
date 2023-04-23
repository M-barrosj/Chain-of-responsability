/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chainofresponsability;

/**
 *
 * @author JCMB
 */
public abstract class AutenticacaoHandler {
    protected AutenticacaoHandler next;

    public AutenticacaoHandler setNext(AutenticacaoHandler handler) {
        this.next = handler;
        return next;
    }

    public abstract boolean handle(String login, String senha);
}