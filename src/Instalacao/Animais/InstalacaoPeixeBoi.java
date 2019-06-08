package Instalacao.Animais;

import Enums.Localizacao;
import Instalacao.*;

import java.util.List;

public class InstalacaoPeixeBoi extends Instalacao {
    protected InstalacaoPeixeBoi(int capacidadeMaxima, Localizacao localizacao, double temperatura, List<ElementoInstalacao> elementosInstalacao) {
        super(capacidadeMaxima, localizacao, temperatura, elementosInstalacao);
    }
}
