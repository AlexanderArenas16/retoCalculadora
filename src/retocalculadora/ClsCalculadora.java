/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retocalculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author arena
 */
public class ClsCalculadora {
    String init_message = """
                          Seleccione una Opción:
                          1. Calcular
                          2. Salir
                          """;
    String option = "";

    public ClsCalculadora() {
    }
    
    public void IniciarPrograma(){
        do{
            option = JOptionPane.showInputDialog(null, init_message, "Calculadora", JOptionPane.DEFAULT_OPTION);
            try {
                if(option.equals("1")){
                    ClsOperaciones operaciones = new ClsOperaciones();
                    operaciones.InicioOperaciones();
                }
                if(Integer.parseInt(option) < 1 || Integer.parseInt(option) > 2 || option.equals("")){
                    JOptionPane.showMessageDialog(null, "Por favor introducir 1 o 2", "Calculadora", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Por favor introducir 1 o 2", "Calculadora", JOptionPane.ERROR_MESSAGE);
            }
//            if(option.equals("1")){
//                ClsOperaciones operaciones = new ClsOperaciones();
//                operaciones.InicioOperaciones();
//            }
//            if(Integer.parseInt(option) < 1 || Integer.parseInt(option) > 2 || option.equals("")){
//                JOptionPane.showMessageDialog(null, "Por favor introducir 1 o 2", "Calculadora", JOptionPane.ERROR_MESSAGE);
//            }
        }while(!option.equals("2"));  
    }
}
