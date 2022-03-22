package chapters.chapter4.ExpStatementMethods.LeapYear;



public class Main {

    public static void main(String[] args) {
        System.out.println("1700 :" + LeapYear.isLeapYear(1700));
        System.out.println("1800 :" + LeapYear.isLeapYear(1800));
        System.out.println("2004 :" + LeapYear.isLeapYear(2004));
        System.out.println("-1600:" + LeapYear.isLeapYear(-1600));
        System.out.println("1600 :" + LeapYear.isLeapYear(1600));
        System.out.println("2007 :" +LeapYear.isLeapYear(2007));
        System.out.println("2000 :" + LeapYear.isLeapYear(2000));
    }

}
