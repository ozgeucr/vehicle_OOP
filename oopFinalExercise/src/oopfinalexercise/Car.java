/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopfinalexercise;

/**
 *
 * @author ozgeucar
 */
public class Car extends Vehicle implements Engine{
    @Override
    public void start(){
        System.out.println("arabanız çalışıyıor");
    }
    @Override
    public void stop(){
    }
}
