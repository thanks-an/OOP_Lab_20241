/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aimsproject.test.cart;

import aimsproject.aims.disc.DigitalVideoDisc;
import aimsproject.aims.cart.Cart;

/**
 *
 * @author ASUS
 */

public class CartTest {
    public static void main(String[] args) {
        //Create a new cart
        Cart cart = new Cart();
        //Create new dvd objects and add them to the cart 
        DigitalVideoDisc dvd1 = new DigitalVideoDisc ("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc (dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc ("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f); 
        cart.addDigitalVideoDisc (dvd2);
        DigitalVideoDisc dvd3= new DigitalVideoDisc ("Aladin", "Animation", 18.99f);
        cart.addDigitalVideoDisc (dvd3);
        cart.print();
        cart.searchById(1);
        cart.searchByTitle("Aladin");
    }
}