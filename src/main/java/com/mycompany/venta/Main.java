/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.venta;
import View.Login;
import tools.Pantalla;

public class Main {

    public static void main(String[] args) {
        Login login = new Login();
        Pantalla pantalla = Pantalla.getInstance();
        pantalla.abrirPantalla(login, 1100, 700);
    }
}
