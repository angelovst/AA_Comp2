package Instalacao.Animais;

import Enums.Localizacao;
import Instalacao.*;

import java.util.List;

public class InstalacaoTubarao extends Instalacao {
    protected InstalacaoTubarao(int capacidadeMaxima, Localizacao localizacao, double temperatura, List<ElementoInstalacao> elementosInstalacao) {
        super(capacidadeMaxima, localizacao, temperatura, elementosInstalacao);
    }
}
