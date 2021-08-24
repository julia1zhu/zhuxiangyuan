package com.myapplication.foodOrderSystem.domain;

/**
 * @author 朱香原
 */
public class Menu {
    private Integer id;
    private String  name;
    private Double price;
    private String scale;
    private Integer copies;

    public Menu() {
    }

    public Menu(String name, Double price, String scale, Integer copies) {
        this.name = name;
        this.price = price;
        this.scale = scale;
        this.copies = copies;
    }


    @Override
    public String toString() {
        return  "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", scale='" + scale + '\'' +
                ", copies=" + copies +
                "}\t";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public Integer getCopies() {
        return copies;
    }

    public void setCopies(Integer copies) {
        this.copies = copies;
    }
}
