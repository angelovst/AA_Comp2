package Instalacao.Animais;

import Enums.Localizacao;
import Instalacao.*;

import java.util.ArrayList;
import java.util.List;

public class FabricaInstalacao {

    public static Instalacao criaInstalacaoElefante(Localizacao localizacao){
        List<ElementoInstalacao> elementoInstalacaos = new ArrayList<ElementoInstalacao>();
        elementoInstalacaos.add(new Jaula(20,30,25));
        return new InstalacaoElefante(2, localizacao, 23,elementoInstalacaos);
    }

    public static Instalacao criaInstalacaoMacaco(Localizacao localizacao){
        List<ElementoInstalacao> elementoInstalacaos = new ArrayList<ElementoInstalacao>();
        elementoInstalacaos.add(new Jaula(40,35.7,90));
        return new InstalacaoMacaco(10, localizacao, 25,elementoInstalacaos);
    }

    public static Instalacao criaInstalacaoZebra(Localizacao localizacao){
        List<ElementoInstalacao> elementoInstalacaos = new ArrayList<ElementoInstalacao>();
        elementoInstalacaos.add(new Jaula(20,30,25));
        return new InstalacaoZebra(2, localizacao, 24,elementoInstalacaos);
    }

    public static Instalacao criaInstalacaoLeao(Localizacao localizacao){
        List<ElementoInstalacao> elementoInstalacaos = new ArrayList<ElementoInstalacao>();
        elementoInstalacaos.add(new Jaula(20,30,25));
        return new InstalacaoLeao(3, localizacao, 21.5,elementoInstalacaos);
    }

    public static Instalacao criaInstalacaoTartaruga(Localizacao localizacao){
        List<ElementoInstalacao> elementoInstalacaos = new ArrayList<ElementoInstalacao>();
        elementoInstalacaos.add(new Tanque(200));
        return new InstalacaoTartaruga(17, localizacao, 20,elementoInstalacaos);
    }

    public static Instalacao criaInstalacaoPinguim(Localizacao localizacao){
        List<ElementoInstalacao> elementoInstalacaos = new ArrayList<ElementoInstalacao>();
        elementoInstalacaos.add(new Jaula(20,30,25));
        elementoInstalacaos.add(new Tanque(100));
        return new InstalacaoPinguim(25, localizacao, 15,elementoInstalacaos);
    }

    public static Instalacao criaInstalacaoFoca(Localizacao localizacao){
        List<ElementoInstalacao> elementoInstalacaos = new ArrayList<ElementoInstalacao>();
        elementoInstalacaos.add(new Jaula(20,30,25));
        elementoInstalacaos.add(new Tanque(100));
        return new InstalacaoFoca(5, localizacao, 15,elementoInstalacaos);
    }

    public static Instalacao criaInstalacaoPeixeBoi(Localizacao localizacao){
        List<ElementoInstalacao> elementoInstalacaos = new ArrayList<ElementoInstalacao>();
        elementoInstalacaos.add(new Tanque(750));
        return new InstalacaoPeixeBoi(7, localizacao, 18,elementoInstalacaos);
    }

    public static Instalacao criaInstalacaoBaleia(Localizacao localizacao){
        List<ElementoInstalacao> elementoInstalacaos = new ArrayList<ElementoInstalacao>();
        elementoInstalacaos.add(new Tanque(1000));
        return new InstalacaoBaleia(2, localizacao, 19,elementoInstalacaos);
    }

    public static Instalacao criaInstalacaoTubarao(Localizacao localizacao){
        List<ElementoInstalacao> elementoInstalacaos = new ArrayList<ElementoInstalacao>();
        elementoInstalacaos.add(new Tanque(500));
        return new InstalacaoTubarao(2, localizacao, 22,elementoInstalacaos);
    }
}
