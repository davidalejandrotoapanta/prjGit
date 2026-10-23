package pkgSerie;



public class Serie {
    /**
     * Imprime una serie de números del 1 al n con signos alternos.
     * @param n El número hasta el cual se imprimirá la serie.
     */
    
    public void serieSignosAlternos(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print("-" + i + " ");
            } else {
                System.out.print("+" + i + " ");
            }
        }
        System.out.println();
    }

    /**
     * Imprime una serie progresiva de signos '+' hasta n.
     * @param n El número de líneas a imprimir.
     */

    public void imprimirSerieProgresiva(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }
    }
    
    public void imprimirLetraJ(int n){
        for(int f = 0; f <= n; f++){
            // para las pruebas escribir
            //Refactor: arregle tal punto 
            for(int c = 0; c <= n; c++){
                if(f == 0 || c == n/2 || (f == n && c <= n/2) || (c == 0 && f >= n/2)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}