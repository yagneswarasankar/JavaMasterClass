package chapters.chapter5.ControlFlowStatements.SwitchStatement.GetDaysOfTheMonth;

public class Main {
    public static void main(String[] args) {

        System.out.println(NumberOfDaysInMonth.isLeapYear(-4));
        System.out.println(NumberOfDaysInMonth.isLeapYear(1700));
        System.out.println(NumberOfDaysInMonth.isLeapYear(2004));
        System.out.println(NumberOfDaysInMonth.isLeapYear(2000));
        System.out.println(NumberOfDaysInMonth.isLeapYear(1800));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2,2018));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2,2020));
    }
}
