package chapter6Objects;

import java.sql.SQLOutput;

public class PhoneBill {
    private int id;
    private int allotedMinutes;
    private int usedMinutes;
    private double baseCost;



    /************Getters and Setters***********/

    public int getID (){
        return id;
    }

    public void setId(int id){
        this.id = id;

    }

    public int getAllotedMinutes() {
        return allotedMinutes;
    }

    public void setAllotedMinutes(int allotedMinutes) {
        this.allotedMinutes = allotedMinutes;
    }

    public int getUsedMinutes() {
        return usedMinutes;
    }

    public void setUsedMinutes(int usedMinutes) {
        this.usedMinutes = usedMinutes;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    /******************interface********************/

    public PhoneBill(){
        id=1;
        allotedMinutes=800;
        baseCost = 79.99;
        usedMinutes=800;
    }

    public PhoneBill(int id){
//        this.id=id;
        setId(id);
        allotedMinutes=800;
        baseCost = 79.99;
        usedMinutes=800;
    }

    public PhoneBill(int id, int allotedMinutes, int usedMinutes, double baseCost){
        setId(id);
        setAllotedMinutes(allotedMinutes);
        setUsedMinutes(usedMinutes);
        setBaseCost(baseCost);

    }

    /********************CALCULATIONS**********************************/
//  calculate overage
    public double calculateOverage(){
        if(usedMinutes<=allotedMinutes){
            return 0;
        }

        double overageRate= 0.25;
        double overageMinutes = usedMinutes - allotedMinutes;
        return overageMinutes* overageRate;
    }
// calculate tax should calculate even if there is no overage
    public double calculateTax(){
        double taxRate =0.15;
        return taxRate*(baseCost+calculateOverage());
    }

    public double calculateTotal(){
        return baseCost + calculateOverage()+calculateTax();
    }

    public void printItimizedBill(){
        System.out.println("ID: "+ id);
        System.out.println("Base Rate: "+ baseCost);
        System.out.println("Overage fee: "+ String.format("%.2f",calculateOverage()));
        System.out.println("Tax: "+ String.format("%.2f",calculateTax()));
        System.out.println("Total: "+ String.format("%.2f",calculateTotal()));
    }

}
