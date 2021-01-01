public class APCalendar {
    public static int numberOfLeapYears(int year1, int year2){
        int num = 0;

        for(int i = year1; i <= year2; i++){
            if(isLeapYear(i))
                num++;
        }
        return num;
    }
    public static int dayOfWeek(int month, int day, int year) {
        int first = firstDayOfYear(year);
        int dayOfYear = dayOfYear(month, day, year);

        int dayOfWeek = (dayOfYear % 7) + first;
        if(dayOfWeek > 6)
            return dayOfWeek - 7;
    
        return dayOfWeek;
    }
}
