public class Validator extends Exception {
    //not valid if it is lower than 0 or more than their salary
    //not valid if its a string and I asked for a float/integer
    public Validator() {
        super("Number is lower than zero");
    }
}
