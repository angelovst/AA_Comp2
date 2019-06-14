package Zoo;

import Animais.Interfaces.Animal;
import Enums.Localizacao;
import Instalacao.Instalacao;

import java.util.HashMap;

public class Zoologico {
    private HashMap<Localizacao, Instalacao> instalacoes;

    public Zoologico(){
        instalacoes = new HashMap<Localizacao, Instalacao>();
    }

    public boolean adicionarInstalacao(Instalacao instalacao){
        if(instalacoes.containsKey(instalacao.getLocalizacao())){
            return false;
        }
        instalacoes.put(instalacao.getLocalizacao(), instalacao);
        return true;
    }

    public Instalacao getInstalacao(Localizacao localizacao){
        if(instalacoes.containsKey(localizacao)){
            return instalacoes.get(localizacao);
        }
        return null;
    }

}
