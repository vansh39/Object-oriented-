class StaticAndNonStatic {
    static int staticValue = 100;
    int nonStaticValue = 200;
    public static void main(String[] args) {
        System.out.println("Static value: " + staticValue);
        StaticAndNonStatic obj = new StaticAndNonStatic();
        System.out.println("Non-static value: " + obj.nonStaticValue);
    }
}
