package br.edu.up;

import br.edu.up.adapter.iAdapterRedesSociais;

public final class GerenciadorMidiaSocial {
   public iAdapterRedesSociais contexto;

   public GerenciadorMidiaSocial(iAdapterRedesSociais contexto){
      this.setAdapter(contexto);
   }

   public void setAdapter(iAdapterRedesSociais contexto){
      this.contexto = contexto;
        
   }

   public void enviar(){
      contexto.enviar();
   }
}
