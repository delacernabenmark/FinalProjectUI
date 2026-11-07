/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author admin
 */
public class ExhibitorIdGenerator {
     private int counter = 1;

    public String generateId() {

        String id = String.format("EXH-%04d", counter);

        counter++;

        return id;
    }
}
