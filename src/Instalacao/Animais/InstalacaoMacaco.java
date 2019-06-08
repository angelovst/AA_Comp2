package Instalacao.Animais;

import Enums.Localizacao;
import Instalacao.*;

import java.util.List;

public class InstalacaoMacaco extends Instalacao {
    protected InstalacaoMacaco(int capacidadeMaxima, Localizacao localizacao, double temperatura, List<ElementoInstalacao> elementosInstalacao) {
        super(capacidadeMaxima, localizacao, temperatura, elementosInstalacao);
    }
}
