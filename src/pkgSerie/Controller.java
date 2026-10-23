package pkgSerie;

public class Controller {
    public void showSerie() {
        Serie serie = new Serie();
        serie.serieSignosAlternos(10);
        serie.imprimirSerieProgresiva(10);

        System.out.println();
        serie.imprimirLetraJ(8);
        System.out.println();
    }
}