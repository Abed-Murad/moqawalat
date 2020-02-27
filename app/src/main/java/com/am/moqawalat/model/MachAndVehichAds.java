package com.am.moqawalat.model;

public class MachAndVehichAds {
    private String AdvName;
    private String AdvPhone;
    private String AdvDate;
    private int AdvPhoto;
    private int AdvSalary = 23; //TODO: MOVE IT TO THE FUCKING CONSTRUCTOR BITCH !
    public static final int FREE_TYPE = 0;
    public static final int PINNED_TYPE = 1;
    private int type;
    public int data;
    public String text;

    public MachAndVehichAds(String advName, String advPhone, String advDate, int advPhoto, int type) {
        AdvName = advName;
        AdvPhone = advPhone;
        AdvDate = advDate;
        AdvPhoto = advPhoto;
        this.type = type;

    }

    public String getAdvName() {
        return AdvName;
    }

    public String getAdvPhone() {
        return AdvPhone;
    }

    public String getAdvDate() {
        return AdvDate;
    }

    public int getAdvPhoto() {
        return AdvPhoto;
    }

    public int getAdvSalary() {
        return AdvSalary;
    }

    public int getType() {
        return type;
    }

    public void setType(final int type) {
        this.type = type;
    }

    public void setAdvName(String advName) {
        AdvName = advName;
    }

    public void setAdvPhone(String advPhone) {
        AdvPhone = advPhone;
    }

    public void setAdvDate(String advDate) {
        AdvDate = advDate;
    }

    public void setAdvPhoto(int advPhoto) {
        AdvPhoto = advPhoto;
    }

    public void setAdvSalary(int advSalary) {
        AdvSalary = advSalary;
    }
}
