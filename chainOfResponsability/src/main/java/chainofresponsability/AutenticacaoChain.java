/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chainofresponsability;

/**
 *
 * @author JCMB
 */
public class AutenticacaoChain {
    private AutenticacaoHandler handler;
    private AutenticacaoHandler loginCheckHandler;

    public AutenticacaoChain() {
        // Construindo a cadeia de handlers
        handler = new MaiusculaHandler()
              .setNext(new MinusculaHandler())
              .setNext(new EspecialHandler())
              .setNext(new NumeroHandler())
              .setNext(new TresNumerosHandler())
              .setNext(new TamanhoHandler());
    loginCheckHandler = new LoginCheckHandler().setNext(handler);
}

    public boolean autenticar(String login, String senha) {
    // Iniciando a cadeia de handlers
        return loginCheckHandler.handle(login, senha);
}
}