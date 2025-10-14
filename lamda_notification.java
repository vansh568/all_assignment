import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;
    String message;

    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public String toString() {
        return type + ": " + message;
    }
}

public class lamda_notification {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
            new Alert("Critical", "Patient heart rate abnormal"),
            new Alert("Normal", "Routine checkup completed"),
            new Alert("Warning", "Low oxygen level detected"),
            new Alert("Info", "New appointment scheduled")
        );

        Predicate<Alert> criticalFilter = a -> a.type.equals("Critical");
        Predicate<Alert> warningFilter = a -> a.type.equals("Warning");

        System.out.println("Critical Alerts:");
        alerts.stream().filter(criticalFilter).forEach(System.out::println);

        System.out.println("\nWarning Alerts:");
        alerts.stream().filter(warningFilter).forEach(System.out::println);
    }
}
