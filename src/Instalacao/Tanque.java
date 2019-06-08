package Instalacao;

public class Tanque extends ElementoInstalacao{
    private double volumeEmLitros;

    public Tanque(double volumeEmLitros) {
        this.volumeEmLitros = volumeEmLitros;
    }

    public double getVolumeEmLitros() {
        return volumeEmLitros;
    }
}
