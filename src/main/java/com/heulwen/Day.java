package com.heulwen;

public enum Day {
    MONDAY("Thứ Hai"),
    TUESDAY("Thứ Ba"),
    WEDNESDAY("Thứ Tư"),
    THURSDAY("Thứ Năm"),
    FRIDAY("Thứ Sáu"),
    SATURDAY("Thứ Bảy");

    private String dayName;

    Day(String dayName){
        this.dayName = dayName;
    }

    public String getDayName(){
        return dayName;
    }
}
