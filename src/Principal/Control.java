/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.awt.Color;

/**
 *
 * @author tepes
 */
public class Control {
    public void main(String[] arg){
        Inicio a = new Inicio();
        a.setVisible(true);
        
        try{
            Thread.sleep(5000);
        }catch(Exception e){}
    }
    
}
