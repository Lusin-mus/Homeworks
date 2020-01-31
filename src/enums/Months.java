package enums;

enum Months {
    JANUARY ( new String [] {"January 1", "January 28"}, 2, 31),
    FEBRUARY (new String [] {"February 14", "February 25"}, 2, 29),
    MARCH ( new String [] {"March 8" , "March 14", "March 20"}, 3, 31),
    APRIL ( new String [] {"April 1", "April 7", "April 24","April 29"}, 4, 30),
    MAY (new String [] {"May 9"}, 1, 31),
    JUNE ( new String [] {"June 1", "June 5", "June 16", "June 18"}, 4, 30),
    JULY ( new String [] {"July 1", "July 5", "July 19", "July 26", "July 29"}, 5, 31),
    AUGUST (new String [] {"August 2", "August 7", "August 28"}, 3, 31),
    SEPTEMBER ( new String [] {"0"}, 0, 30),
    OCTOBER ( new String [] {"0"}, 0, 31),
    NOVEMBER (new String [] {"November 1", "November 8", "November 19"}, 3, 30),
    DECEMBER ( new String [] {"December 9", "December 20"}, 2, 31);


    Months( String [] holiday, int numberOfHolidays, int numberOfDays) {

        this.holiday = holiday;
        this.numberOfHolidays = numberOfHolidays;
        this.numberOfDays = numberOfDays;
    }
    private String [] holiday;
    private int numberOfHolidays;
    private int numberOfDays;


    public String [] getHoliday() {
        return holiday;
    }

    public int getNumberOfHolidays() {
        return numberOfHolidays;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

   public boolean checkHolidays(String string){
        for(int i=0; i<holiday.length; i++){
            if(holiday[i].equals(string)){
                return true;
            }
            }
        return false;
        }
}



