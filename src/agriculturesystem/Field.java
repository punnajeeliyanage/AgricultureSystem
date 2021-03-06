/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculturesystem;

import java.io.Serializable;

/**
 *
 * @author Himasha Harinda
 */
public class Field implements Serializable {
    int fieldid;
    String name;
    SetOfPlots plots;
    Area area;

    public Field(int fieldid, String name, SetOfPlots plots, Area area) {
        this.fieldid = fieldid;
        this.name = name;
        this.plots = plots;
        this.area = area;
    }

    public int getFieldid() {
        return fieldid;
    }

    public void setFieldid(int fieldid) {
        this.fieldid = fieldid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SetOfPlots getPlots() {
        return plots;
    }

    public void setPlots(SetOfPlots plots) {
        this.plots = plots;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    
    
}
