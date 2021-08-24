package com.myapplication.foodOrderSystem.domain;

/**
 * @author 朱香原
 */
public class Gift {
    private String name;
    private Integer id;

    public Gift() {
    }

    public Gift(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public Gift(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
