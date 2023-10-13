package pilarespoo.computador;
/* Podemos avaliar a importância de compreender os pilares de POO, para ter uma melhor implementação,
* reaproveitamento e reutilização de código, em qualquer contexto das nossas aplicações.
*/

import pilarespoo.apps.FacebookMessenger;
import pilarespoo.apps.MSNMessenger;
import pilarespoo.apps.ServicoMensagemInstantanea;
import pilarespoo.apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {

        ServicoMensagemInstantanea smi = null;

        /*
         * NÃO SE SABE QUAL APP
         * MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
         */
        String appEscolhido = "fcm";

        if (appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if (appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if (appEscolhido.equals("tlg"))
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}