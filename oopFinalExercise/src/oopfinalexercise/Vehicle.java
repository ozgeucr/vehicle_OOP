/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopfinalexercise;

/**
 *
 * @author ozgeucar
 */
public class Vehicle implements Engine{

    @Override
    public void start() {
        throw new UnsupportedOperationException("Araç çalışıyor");
    }

    @Override
    public void stop() {
        throw new UnsupportedOperationException("Araç durdu!!"); 
    }
    
}
