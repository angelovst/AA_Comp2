package Instalacao.Animais;

import Enums.Localizacao;
import Instalacao.*;

import java.util.List;

public class InstalacaoPinguim extends Instalacao {
    protected InstalacaoPinguim(int capacidadeMaxima, Localizacao localizacao, double temperatura, List<ElementoInstalacao> elementosInstalacao) {
        super(capacidadeMaxima, localizacao, temperatura, elementosInstalacao);
    }
}
