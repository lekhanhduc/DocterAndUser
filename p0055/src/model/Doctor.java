/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lekha
 */
public class Doctor {
    private String code;
    private String name;
    private String sprecialization;
    private int availability;

    public Doctor() {
    }

    public Doctor(String code, String name, String sprecialization, int availability) {
        this.code = code;
        this.name = name;
        this.sprecialization = sprecialization;
        this.availability = availability;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSprecialization() {
        return sprecialization;
    }

    public void setSprecialization(String sprecialization) {
        this.sprecialization = sprecialization;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Doctor{" + "code=" + code + ", name=" + name + ", sprecialization=" + sprecialization + ", availability=" + availability + '}';
    }
    
}
