package br.edu.up;

import br.edu.up.adapter.absAdapterRedesSociais;

public class GerenciadorMidiaSocial {
   public absAdapterRedesSociais contexto;

   public GerenciadorMidiaSocial(absAdapterRedesSociais contexto){
      this.setAdapter(contexto);
   }

   public void setAdapter(absAdapterRedesSociais contexto){
      this.contexto = contexto;
        
   }

   public void enviar(){
      contexto.enviar();
   }
}
