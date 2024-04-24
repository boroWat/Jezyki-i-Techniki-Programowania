class Factorial {
    public static Integer factorial(int x) {
        if (x < 0) {
            return 0;
        }

        int wynik = 1;
        for (int i = 2; i <= x; i++) {
            wynik *= i;
        }

        return wynik;
    }

    public static int factorial1(int x) throws MyException {
        if (x < 0) {
            throw new MyException();
        }

        int wynik = 1;
        for (int i = 2; i <= x; i++) {
            wynik *= i;
        }

        return wynik;
    }
}