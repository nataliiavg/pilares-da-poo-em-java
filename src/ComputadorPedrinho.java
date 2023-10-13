/* Podemos avaliar a importância de compreender os pilares de POO, para ter uma melhor implementação,
* reaproveitamento e reutilização de código, em qualquer contexto das nossas aplicações.
*/

public class ComputadorPedrinho {
    public static void main(String[] args) {

        // abrindo MSN Messenger
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        FacebookMessenger fbm = new FacebookMessenger();
        fbm.enviarMensagem();
        fbm.receberMensagem();

        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}