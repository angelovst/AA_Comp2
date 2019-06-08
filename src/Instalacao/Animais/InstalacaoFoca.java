package Instalacao.Animais;

import Enums.Localizacao;
import Instalacao.*;

import java.util.List;

public class InstalacaoFoca extends Instalacao {
    protected InstalacaoFoca(int capacidadeMaxima, Localizacao localizacao, double temperatura, List<ElementoInstalacao> elementosInstalacao) {
        super(capacidadeMaxima, localizacao, temperatura, elementosInstalacao);
    }
}
