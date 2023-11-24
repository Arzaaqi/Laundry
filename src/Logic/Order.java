/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author 62811
 */
public class Order {
    private String itemType;
    private String washingType;
    private double weight;
    private int totalItem;
    private int duration;
    
    public Order(String itemType, String washingType, double weight, int totalItem, int duration){
        this.itemType = itemType;
        this.washingType = washingType;
        this.weight = weight;
        this.totalItem = totalItem;
        this.duration = duration;
    }
    
    
}
