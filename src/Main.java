import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(getBucketCount(3.26, 0.75));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) return -1;

        double wallArea = (width * height) - (areaPerBucket * extraBuckets);
        double totalPaintArea = 0;
        int bucketCount = 0;


        while (totalPaintArea < wallArea) {
            bucketCount++;
            totalPaintArea += areaPerBucket;
        }

        return bucketCount;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        return getBucketCount(area, 1, areaPerBucket);
    }


    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int numberSum = 0;
        int numberCount = 0;
        while (true) {
            String enteredNumber = scanner.nextLine();
            try {
                int validNum = Integer.parseInt(enteredNumber);
                numberSum += validNum;
                numberCount++;
            } catch (NumberFormatException nfe) {
                break;
            }
        }
        System.out.println("SUM = " + numberSum + " AVG = " + (numberSum == 0 ? 0 : (Math.round((double) numberSum / numberCount))));
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == 0 || i == number - 1 || j == 0 || j == number - 1 || i == j || j == (number - (i + 1))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static int getLargestPrime2(int number) {

        if (number < 2) {
            return -1;
        }

        int factor = -1;
        for (int i = 2; i * i <= number; i++) {
            if (number % i != 0) {
                continue;
            }
            factor = i;
            while (number % i == 0) {
                number /= i;
            }
        }
        return number == 1 ? factor : number;
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) return -1;
        int i = 2;
        while (number > 1) {
            if (number % i == 0) {
                number /= i;
            } else if (i > Math.sqrt(number)) {
                i = number;
            } else {
                i += 1;
            }
        }
        return i;
    }

    public static void primeCounterUpToThree(int range) {
        if (range > 1000) {
            System.out.println("Invalid number");
            return;
        }

        int amountOfPrimesInRange = 0;
        for (int i = 2; i <= range; i++) { // Start from 2, because 1 is NOT prime
            if (isPrime(i)) {
                System.out.println(i + " is prime.");
                amountOfPrimesInRange++;
            }
            if (amountOfPrimesInRange == 3) break; // Stop after 3 primes
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int packSum = 0;

        for (int i = 0; i < bigCount; i++) {
            if ((packSum + 5) <= goal) {
                packSum += 5;
                System.out.println(packSum);
            }
        }
        for (int i = 0; i < smallCount; i++) {
            if ((packSum + 1) <= goal) {
                packSum += 1;
                System.out.println(packSum);
            }
        }
        return packSum == goal;
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int reversedNumber = reverse(number);

        while (reversedNumber != 0) {
            switch (reversedNumber % 10) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
            }
            reversedNumber /= 10;
        }

        if (getDigitCount(number) != getDigitCount(reverse(number))) {
            for (int i = 0; i < (getDigitCount(number) - getDigitCount(reverse(number))); i++) {
                System.out.println("Zero");
            }
        }

        if (number == 0 && reverse(number) == 0) {
            System.out.println("Zero");
        }
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            reversedNumber += number % 10;
            number /= 10;
            if (number != 0) {
                reversedNumber *= 10;
            }
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int digitCount = 0;
        while (number != 0) {
            digitCount++;
            number /= 10;
        }
        if (digitCount == 0) {
            digitCount++;
        }
        return digitCount;
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int totalSum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                totalSum += i;
            }
        }
        return totalSum == number;
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int minValue = first < second ? first : second;
        int greatestCommonDivisor = 0;
        for (int i = 1; i <= minValue; i++) {
            if (first % i == 0 && second % i == 0) {
                greatestCommonDivisor = i;
            }
        }
        return greatestCommonDivisor;
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }

    }

    public static boolean hasSameLastDigit(int n1, int n2, int n3) {
        if (n1 < 10 || n1 > 1000 || n2 < 10 || n2 > 1000 || n3 < 10 || n3 > 1000) {
            return false;
        }
        return (n1 % 10 == n2 % 10) || (n2 % 10 == n3 % 10) || (n1 % 10 == n3 % 10);
    }

    public static boolean isValid(int n) {
        if (n < 10 || n > 1000) {
            return false;
        }
        return true;
    }

    public static boolean hasSharedDigit(int n1, int n2) {
        if (n1 < 10 || n1 > 99 || n2 < 10 || n2 > 99) {
            return false;
        }
        int tempN2 = n2;
        while (n1 != 0) {
            System.out.println(n1 % 10);
            while (tempN2 != 0) {
                if (tempN2 % 10 == n1 % 10) {
                    return true;
                }
                tempN2 /= 10;
            }
            n1 /= 10;
            tempN2 = n2;
        }
        return false;
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int firstDigit = number % 10;
        int LastDigit = 0;
        while (number != 0) {
            LastDigit = number;
            number /= 10;
        }
        return firstDigit + LastDigit;
    }

    public static boolean isPalindrome(int number) {
        int reverseNumber = 0;
        int regularNumber = number;
        while (number != 0) {
            reverseNumber += number % 10;
            number /= 10;
            if (number != 0) {
                reverseNumber *= 10;
            }
        }
        System.out.println(reverseNumber);
        System.out.println(regularNumber);

        return reverseNumber == regularNumber;
    }

    public static int sumDigits(int n) {
        if (n <= 0) return -1;
        int sumCount = 0;
        while (n != 0) {
            sumCount += n % 10;
            n /= 10;
        }
        return sumCount;
    }
}