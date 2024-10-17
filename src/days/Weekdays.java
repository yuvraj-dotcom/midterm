/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package days;

/**
 *
 * @author sivagamasrinivasan
 */
public enum Weekdays {
    ONE("Monday"),
    TWO("Tuesday"),
    THREE("Wednesday"),
    FOUR("Thursday"),
    FIVE("Friday"),
    SIX("Saturday"),
    SEVEN("Sunday");

    private final String name;

    // Constructor
    Weekdays(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Method to print all days
    public static void printAllDays() {
        for (Weekdays day : Weekdays.values()) {
            System.out.println(day.getName());
        }
    }
}