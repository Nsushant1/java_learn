package oop;

public class Class {
    private int id;
    private String color;
    private String model;

    public void ride() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static void main(String[] args) {
        Class vehicle = new Class();
        vehicle.setColor("blue");
        System.out.println(vehicle.getColor());

        vehicle.setModel("Bmw");
        System.out.println(vehicle.getModel());

        vehicle.setId(12);
        System.out.println(vehicle.getId());

    }

}
