package Instalacao.Animais;

import Enums.Localizacao;
import Instalacao.ElementoInstalacao;
import Instalacao.Instalacao;

import java.util.List;

public class InstalacaoElefante extends Instalacao {

    protected InstalacaoElefante(int capacidadeMaxima, Localizacao localizacao, double temperatura, List<ElementoInstalacao> elementosInstalacao) {
        super(capacidadeMaxima, localizacao, temperatura, elementosInstalacao);
    }
}
