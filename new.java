class PrinterClass {
    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n) {
        print(n - 1);
        System.out.print(n);
    }
}