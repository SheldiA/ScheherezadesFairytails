/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.bsuir.scheherezadesfairytailes;

import by.bsuir.scheherezadesfairytailes.controller.Controller;
import by.bsuir.scheherezadesfairytailes.view.View;

/**
 *
 * @author Anna
 */
public class Main {
    public static void main(String[] args) {
        View v = new View();
        Controller c = new Controller(v);
        c.run();
    }
}
