package competitive.programming.practice.base;

public class Test {


    public static void main(String[] args) {
        getEpochMetaInfo(633830405L);
    }

    private static final int BASE_YEAR = 1970;


    /**
     * Not to use Date function
     * Method to print Year, Day of Year, Month of Year and Day
     * @param epoch
     */
    private static void getEpochMetaInfo(Long epoch) {
        Long yearsAfterEpoch = (epoch/(60*60*24*365));

        Long daysOfYear = epoch%(60*60*24*365) / (60*60*24);
        // Assuming month is 30 days
        int monthOfYear = (int) Math.ceil(daysOfYear / 30.0);

        Long daysOfMonth = daysOfYear % 30;

        int weeksOfYear = (int) Math.ceil(daysOfYear / 7.0);


        System.out.println("Year is " + (BASE_YEAR + yearsAfterEpoch));
        System.out.println("Day of the Year is " + (daysOfYear));
        System.out.println("Month of the Year is " + (monthOfYear));
        System.out.println("Day of the Month is " + (daysOfMonth));
        System.out.println("Week of the year is " + (weeksOfYear));

    }



}
