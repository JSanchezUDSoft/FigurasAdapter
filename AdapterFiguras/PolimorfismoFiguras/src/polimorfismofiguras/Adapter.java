
package polimorfismofiguras;


/**
 *
 * @author jsanc
 */
public class Adapter {
    
    public void HacerPoligono(int a, int b){
        DibujarFiguras df = new DibujarFiguras();
        df.setVisible(true);
        df.DibujarPoligono(a, b);
    }
    
    public void HacerCirculo(int a){
        DibujarFiguras df = new DibujarFiguras();
        df.setVisible(true);
        df.DibujarCirculo(a);
    }
}
