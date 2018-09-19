
package main;

import view.View;
import model.ModelADTexto;
import controllers.Controller;

/**
 *
 * @author Dani
 */
public class Main {
 private static ModelADTexto ModelADTexto;
    private static View View;
    private static Controller Controller;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ModelADTexto = new ModelADTexto();
        View = new View();
        Controller = new Controller(ModelADTexto,View);
    }
    
}
