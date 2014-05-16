package no.priv.rystad.honeytrap;

public class HoneyTrap {
    private static String message = "dummy";

    public String sayHello(boolean test) {

        if (test) {
            message = "Hello";
        } else
            return "false" + 1;


        if (test && message != null || message.toString() == "") {
            return message;
        } else {
            return "never";
        }
    }
}
