package jenkinsdemo;

public class Demo {

    public int add(int a, int b) {
        return a + b;
    }

    public boolean isEven(int n) {
        return n % 2 == 0;
    }

    public String normalizeName(String s) {
        if (s == null) return "Default";
        String t = s.trim();
        return t.isEmpty() ? "Default" : t;
    }
}