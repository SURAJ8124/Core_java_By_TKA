package Functions;


public class Functions {
    public static void main(String[] args) {
        int number = 29;

        EvenOdd evenOddObj = new EvenOdd();
        PrimeNumber primeObj = new PrimeNumber();

        evenOddObj.checkEvenOdd(number);
        primeObj.checkPrime(number);
    }
}
