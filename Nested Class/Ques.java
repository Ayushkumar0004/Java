public class Ques {
    public static void main(String[] args) {
        int number = 19; 
        class PrimeNumber {
            public void checkPrime(int num) {
                boolean isPrime = true;

                if (num <= 1) {
                    isPrime = false;
                } else {
                    for (int i = 2; i <= num / 2; i++) {
                        if (num % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }
                if (isPrime) {
                    System.out.println(num + " is a prime number.");
                } else {
                    System.out.println(num + " is not a prime number.");
                    checkOddEven(num);
                }
            }
            private void checkOddEven(int num) 
            {
                if (num % 2 == 0) {
                    System.out.println(num + " is an even number.");
                } else {
                    System.out.println(num + " is an odd number.");
                }
            }
        }
        PrimeNumber primeNumber = new PrimeNumber();
        primeNumber.checkPrime(number);
    }
}