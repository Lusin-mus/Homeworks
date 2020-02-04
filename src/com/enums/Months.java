package com.enums;

enum Months {
    JANUARY ( new int [] {1, 28},31),
    FEBRUARY (new int [] { 14, 25}, 29),
    MARCH ( new int [] {8, 14, 20}, 31),
    APRIL ( new int [] {1, 7, 24, 29}, 30),
    MAY (new int [] {9},  31),
    JUNE ( new int [] {1, 5, 16, 18}, 30),
    JULY ( new int [] {1, 5, 19, 26, 29}, 31),
    AUGUST (new int [] {2, 7, 28}, 31),
    SEPTEMBER ( new int [] {}, 30),
    OCTOBER ( new int [] {}, 31),
    NOVEMBER (new int [] {1, 8, 19}, 30),
    DECEMBER ( new int [] {9, 20},31);


    Months( int [] holidays, int numberOfDays) {

        this.holidays = holidays;
        this.numberOfDays = numberOfDays;
    }
    private final int [] holidays;
    private int numberOfDays;


    public int [] getHoliday() {
        return holidays;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

   public boolean checkHolidays(int day){
        for(int i=0; i<holidays.length; i++){
            if(holidays[i]==day){
                return true;
            }
            }
        return false;
        }
}



