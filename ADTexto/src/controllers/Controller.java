
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.ModelADTexto;
import view.View;
/**
 *
 * @author Dani
 */
public class Controller implements ActionListener {
    
    private final ModelADTexto ModelADTexto;
    private final View View;
 
    public Controller(ModelADTexto ModelADTexto, View View){
        this.ModelADTexto = ModelADTexto;
        this.View = View;
        View.jmi_leer.addActionListener(this);
        View.jmi_escribir.addActionListener(this);
        initView();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==View.jmi_leer){
            ModelADTexto.setPath("C:\\Users\\Dani\\Documents\\4 cuatri\\chava\\archivo.pat");
            ModelADTexto.readFile(ModelADTexto.getPath());      
            View.jta_texto.setText(ModelADTexto.getMessage());
        }else if(e.getSource()==View.jmi_escribir){
            ModelADTexto.setPath("C:\\Users\\Dani\\Documents\\4 cuatri\\chava\\archivo.pat");
            ModelADTexto.setMessage(View.jta_texto.getText());
            ModelADTexto.writeFile(ModelADTexto.getPath(), ModelADTexto.getMessage());
        }
    }
    private void initView() {
        View.setTitle("Notas");
        View.setResizable(false);
        View.setLocationRelativeTo(null);
        View.setVisible(true);
    } 
    
}

