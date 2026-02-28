/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_rabbit;

/**
 *
 * @author Mai Truc Phuong
 */
public class RabbitDTO {
    private String rabbitId;
    private String description;
    private float price;
    private String rabbitName;
    private String img;
    private int yearOfProduction;
    private int quantity;
    private boolean notSale;

    public RabbitDTO() {
    }

    public RabbitDTO(String rabbitId, String description, float price, String rabbitName, String img, int yearOfProduction, int quantity, boolean notSale) {
        this.rabbitId = rabbitId;
        this.description = description;
        this.price = price;
        this.rabbitName = rabbitName;
        this.img = img;
        this.yearOfProduction = yearOfProduction;
        this.quantity = quantity;
        this.notSale = notSale;
    }

    public String getRabbitId() {
        return rabbitId;
    }

    public void setRabbitId(String rabbitId) {
        this.rabbitId = rabbitId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getRabbitName() {
        return rabbitName;
    }

    public void setRabbitName(String rabbitName) {
        this.rabbitName = rabbitName;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isNotSale() {
        return notSale;
    }

    public void setNotSale(boolean notSale) {
        this.notSale = notSale;
    }
    
}