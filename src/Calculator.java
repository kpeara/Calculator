public class Calculator {

    private static Calculator instance;

    private int add() {return 0;}
    private int subtract() {return 0;}
    private int multiply() {return 0;}
    private int divide() {return 0;}
    private int power() {return 0;}

    // utilizing tree data structure
    // parse brackets (attempt first without brackets)
        // search for brackets if found, look for closing, if not found generate error (create own exception?)
    // consider invalid input
    // consider saving history (database...)
    public String calculate(String parse) {
        // algorithm
        // evaluate highest precedence first, store those in tree structure
        return parse;
    }

    // singleton
    private Calculator() {}
    public static Calculator getCalculator() {
        if (instance == null) {
            instance = new Calculator();
        }
        return instance;
    }

}
