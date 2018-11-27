package com.se.weapp.thetimecondo;

public class MaintenanceCase {
    private String id;
    private String MaintenanceCase_checkBox_aircon;
    private String MaintenanceCase_checkBox_stove;
    private String MaintenanceCase_checkBox_electric;
    private String MaintenanceCase_checkBox_pipe;
    private String MaintenanceCase_checkBox_water;
    private String MaintenanceCase_checkBox_bathroom;
    private String MaintenanceCase_checkBox_other;
    private String MaintenanceCase_input_tel;
    private String MaintenanceCase_input_other;

    public MaintenanceCase(){

    }

    public MaintenanceCase(String id, String maintenanceCase_checkBox_aircon, String maintenanceCase_checkBox_stove, String maintenanceCase_checkBox_electric,
                           String maintenanceCase_checkBox_pipe, String maintenanceCase_checkBox_water, String maintenanceCase_checkBox_bathroom,
                           String maintenanceCase_checkBox_other, String maintenanceCase_input_tel, String maintenanceCase_input_other) {
        this.id = id;
        MaintenanceCase_checkBox_aircon = maintenanceCase_checkBox_aircon;
        MaintenanceCase_checkBox_stove = maintenanceCase_checkBox_stove;
        MaintenanceCase_checkBox_electric = maintenanceCase_checkBox_electric;
        MaintenanceCase_checkBox_pipe = maintenanceCase_checkBox_pipe;
        MaintenanceCase_checkBox_water = maintenanceCase_checkBox_water;
        MaintenanceCase_checkBox_bathroom = maintenanceCase_checkBox_bathroom;
        MaintenanceCase_checkBox_other = maintenanceCase_checkBox_other;
        MaintenanceCase_input_tel = maintenanceCase_input_tel;
        MaintenanceCase_input_other = maintenanceCase_input_other;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaintenanceCase_checkBox_aircon() {
        return MaintenanceCase_checkBox_aircon;
    }

    public void setMaintenanceCase_checkBox_aircon(String maintenanceCase_checkBox_aircon) {
        MaintenanceCase_checkBox_aircon = maintenanceCase_checkBox_aircon;
    }

    public String getMaintenanceCase_checkBox_stove() {
        return MaintenanceCase_checkBox_stove;
    }

    public void setMaintenanceCase_checkBox_stove(String maintenanceCase_checkBox_stove) {
        MaintenanceCase_checkBox_stove = maintenanceCase_checkBox_stove;
    }

    public String getMaintenanceCase_checkBox_electric() {
        return MaintenanceCase_checkBox_electric;
    }

    public void setMaintenanceCase_checkBox_electric(String maintenanceCase_checkBox_electric) {
        MaintenanceCase_checkBox_electric = maintenanceCase_checkBox_electric;
    }

    public String getMaintenanceCase_checkBox_pipe() {
        return MaintenanceCase_checkBox_pipe;
    }

    public void setMaintenanceCase_checkBox_pipe(String maintenanceCase_checkBox_pipe) {
        MaintenanceCase_checkBox_pipe = maintenanceCase_checkBox_pipe;
    }

    public String getMaintenanceCase_checkBox_water() {
        return MaintenanceCase_checkBox_water;
    }

    public void setMaintenanceCase_checkBox_water(String maintenanceCase_checkBox_water) {
        MaintenanceCase_checkBox_water = maintenanceCase_checkBox_water;
    }

    public String getMaintenanceCase_checkBox_bathroom() {
        return MaintenanceCase_checkBox_bathroom;
    }

    public void setMaintenanceCase_checkBox_bathroom(String maintenanceCase_checkBox_bathroom) {
        MaintenanceCase_checkBox_bathroom = maintenanceCase_checkBox_bathroom;
    }

    public String getMaintenanceCase_checkBox_other() {
        return MaintenanceCase_checkBox_other;
    }

    public void setMaintenanceCase_checkBox_other(String maintenanceCase_checkBox_other) {
        MaintenanceCase_checkBox_other = maintenanceCase_checkBox_other;
    }

    public String getMaintenanceCase_input_tel() {
        return MaintenanceCase_input_tel;
    }

    public void setMaintenanceCase_input_tel(String maintenanceCase_input_tel) {
        MaintenanceCase_input_tel = maintenanceCase_input_tel;
    }

    public String getMaintenanceCase_input_other() {
        return MaintenanceCase_input_other;
    }

    public void setMaintenanceCase_input_other(String maintenanceCase_input_other) {
        MaintenanceCase_input_other = maintenanceCase_input_other;
    }

}
