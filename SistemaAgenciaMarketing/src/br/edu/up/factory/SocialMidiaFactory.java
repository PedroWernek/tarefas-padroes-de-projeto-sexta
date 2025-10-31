package br.edu.up.factory;

import br.edu.up.API.APIInstagram;
import br.edu.up.API.APILinkedIn;
import br.edu.up.API.APITikTok;
import br.edu.up.API.APITwitter;
import br.edu.up.adapter.AdapterInstagram;
import br.edu.up.adapter.AdapterLinkedIn;
import br.edu.up.adapter.AdapterTikTok;
import br.edu.up.adapter.AdapterTwitter;
import br.edu.up.adapter.iAdapterRedesSociais;
import br.edu.up.payloader.plInstagram;
import br.edu.up.payloader.plLinkendIn;
import br.edu.up.payloader.plTiktok;
import br.edu.up.payloader.plTwitter;

public class SocialMidiaFactory {

    public static iAdapterRedesSociais criarLinkedIn(String ChaveDeAcesso) {
        return new AdapterLinkedIn(new APILinkedIn(new plLinkendIn(ChaveDeAcesso)));
    }

    public static iAdapterRedesSociais criarInstagram(String apiKey) {
        return new AdapterInstagram(new APIInstagram(new plInstagram(apiKey)));
    }

    public static iAdapterRedesSociais criarTikTok(String conectionString) {
        return new AdapterTikTok(new APITikTok(new plTiktok(conectionString)));
    }

    public static iAdapterRedesSociais criarTwitter(plTwitter payload) {
        return new AdapterTwitter(new APITwitter(payload));
    }
}
