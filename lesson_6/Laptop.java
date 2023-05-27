package lesson_6;

public class Laptop {
    private int ram;
    private int hd;
    private String os;
    private String color;
    private String brand;
    private double screenSize;

    public Laptop(int ram, int hd, String os, String color, String brand, double screenSize) {
        this.ram = ram;
        this.hd = hd;
        this.os = os;
        this.color = color;
        this.brand = brand;
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public Integer getHd() {
        return hd;
    }

    public void setHd(Integer hd) {
        this.hd = hd;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
    @Override
    public String toString() {
        return brand + " " + screenSize + "\", " + color + ", ОЗУ (RAM) = " + ram + "ГБ, " + hd + "ГБ, Операционная система: " + os;
    }

}
