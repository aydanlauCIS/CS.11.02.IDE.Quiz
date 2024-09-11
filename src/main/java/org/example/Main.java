package org.example;

public class Main {
    /** Method 1
     * Method name: circleArea
     * Method return type: double
     * Method parameter: the radius of a circle
     * Method signature: circleArea(int)
     * Returns the area of a circle. */
    public static double circleArea(int radius) {
        return Math.round(Math.PI * Math.pow(radius, 2) * 100.0) / 100.0;
    }

    /** Method 2
     * Method name: circleCircum
     * Method return type: double
     * Method parameter: the radius of a circle
     * Method signature: circleCircum(int)
     * Returns the circumference of a circle. */
    public static double circleCircum(int radius) {
        return Math.round(2 * Math.PI * radius * 100.0) / 100.0;
    }

    /** Method 3
     * Method name: circleInfo
     * Method return type: String
     * Method parameter: the radius of a circle
     * Method signature: circleInfo(int)
     * Returns a String detailing the radius, circumference, and area of a circle.
     * Format of returned String: e.g.
     * Radius: 3
     * Circumference: 18.85
     * Area: 28.27 */
    public static String circleInfo(int radius) {
        double circumference = circleCircum(radius);
        double area = circleArea(radius);
        return "Radius: " + radius + "\nCircumference: " + circumference + "\nArea: " + area;
    }

    /** Method 4
     * Method name: minutesToHoursMinutes
     * Method return type: String
     * Method parameter: total minutes (e.g. 226)
     * Method signature: minutesToHoursMinutes(int)
     * Returns a String detailing the number of hours and minutes.
     * Format of returned String: e.g. 3 hours and 46 minutes */
    public static String minutesToHoursMinutes(int minutes) {
        int hours = minutes / 60;
        int mins = minutes - hours * 60;
        return hours + " hours and " + mins + " minutes";
    }

    /** Method 5
     * Method name: twentyFourToTwelve
     * Method return type: String
     * Method parameter: time in 24-hour format (e.g. 15:56). time >= 13:00 (always pm)
     * Method signature: twentyFourToTwelve(String)
     * Returns a String detailing the time in 12-hour format (e.g. 3:56 pm).
     * Format of returned String: e.g. 3:56 pm
     * */
    public static String twentyFourToTwelve(String time) {
        int hours = Integer.parseInt(time.substring(0, 2));
        int new_hours = hours - 12;
        return new_hours + time.substring(2, 5) + " pm";
    }

    /** Method 6
     * Method name: distanceBetweenTwoPoints
     * Method return type: double
     * Method parameter: x1, y1, x2, y2 (the two coordinates on a 2D plane)
     * Method signature: distanceBetweenTwoPoints(int,int,int,int)
     * Returns the distance between two points */
    public static double distanceBetweenTwoPoints(int x1, int y1, int x2, int y2) {
        return Math.round(Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)) * 100.0) / 100.0;
    }

    /** Method 7
     * Method name: fahrenheitToCelsius
     * Method return type: double
     * Method parameter: degrees fahrenheit
     * Method signature: fahrenheitToCelsius(int)
     * Returns the degrees celsius equivalent of the degrees in fahrenheit */
    public static double fahrenheitToCelsius(int fahrenheit) {
        return Math.round((fahrenheit - 32) * 5 / 9.0 * 100.0) / 100.0;
    }

    /** Method 8
     * Method name: celsiusToFahrenheit
     * Method return type: double
     * Method parameter: degrees celsius
     * Method signature: celsiusToFahrenheit(int)
     * Returns the degrees fahrenheit equivalent of the degrees in celsius */
    public static double celsiusToFahrenheit(int celsius) {
        return Math.round((celsius * 9.0 / 5.0 + 32.0) * 100.0) / 100.0;
    }

}