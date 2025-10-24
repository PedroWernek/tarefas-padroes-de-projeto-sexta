package br.edu.up;

import br.edu.up.API.APIInstagram;
import br.edu.up.API.APILinkedIn;
import br.edu.up.adapter.AdapterInstagram;
import br.edu.up.adapter.AdapterLinkedIn;

public class AgenciaDeMarketing {
    public static void main(String[] args) throws Exception {
        GerenciadorMidiaSocial gerenciador = new GerenciadorMidiaSocial(new AdapterInstagram(new APIInstagram()));

        gerenciador.enviar();
        gerenciador.setAdapter(new AdapterLinkedIn(new APILinkedIn()));

        gerenciador.enviar();
    }
}
