package br.edu.up;

import br.edu.up.adapter.iAdapterRedesSociais;
import br.edu.up.data.Publicacao;

public final class GerenciadorMidiaSocial {
   public iAdapterRedesSociais contexto;
   private Publicacao publicacao;

   public GerenciadorMidiaSocial(iAdapterRedesSociais contexto){
      this.setAdapter(contexto);
   }

   public void setAdapter(iAdapterRedesSociais contexto){
      this.contexto = contexto;
        
   }

   public void enviar(){
      contexto.enviar(publicacao);
   }

    public Publicacao getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(Publicacao publicacao) {
        this.publicacao = publicacao;
    }
}
