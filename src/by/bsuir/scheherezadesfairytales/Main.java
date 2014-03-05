/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.bsuir.scheherezadesfairytales;

import by.bsuir.scheherezadesfairytales.controller.Controller;
import by.bsuir.scheherezadesfairytales.view.View;

/**
 *
 * @author Anna
 */
public class Main {
    /**
     * 
     * @param args incoming to program param
     */
    public static void main(String[] args) {
        View v = new View();
        Controller c = new Controller(v);
        c.run();
    }
}
