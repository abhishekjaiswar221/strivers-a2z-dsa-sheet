package Step_01_Learn_the_basic;

public class Practice {

    static void pattern1(int num) {
        for (int row = 0; row < num; row++) {
            for (int col = 0; col < num; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int num) {
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int num) {
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void patter4(int num) {
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int num) {
        for (int row = 0; row < num; row++) {
            for (int col = 1; col <= num - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int num) {
        for (int row = 0; row < num; row++) {
            for (int col = 1; col <= num - row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern7(int num) {
        for (int row = 0; row < num; row++) {
            for (int space = 0; space < num - row - 1; space++) {
                System.out.print("A ");
            }

            for (int star = 0; star < 2 * row + 1; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern8(int num) {
        for (int row = 1; row <= num; row++) {
            for (int space = 1; space < row; space++) {
                System.out.print("  ");
            }

            for (int star = 1; star <= 2 * num - (2 * row - 1); star++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void pattern9(int num) {
        for (int row = 0; row < num; row++) {

            int noOfCol = row;

            for (int col = 0; col <= noOfCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        System.out.println(count);
    }

    static void reverseNumber(int num) {
        int reversedNum = 0;
        while (num > 0) {
            int modulus = num % 10;
            reversedNum = reversedNum * 10 + modulus;
            num /= 10;
        }
        System.out.println(reversedNum);
    }

    static void palindrome(int num) {
        int copyOfNum = num;
        int reversedNum = 0;
        while (copyOfNum > 0) {
            int modulus = copyOfNum % 10;
            reversedNum = reversedNum * 10 + modulus;
            copyOfNum /= 10;
        }
        if (reversedNum == num) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It's not a Palindrome");
        }
    }

    public static void main(String[] args) {
        int num = 48554;
//        pattern1(num);
//        pattern2(num);
//        pattern3(num);
//        patter4(num);
//        pattern5(num);
//        pattern6(num);
//        pattern7(num);
//        pattern8(num);
//        pattern8(num);
//        pattern9(num);
//        countDigits(num);
//        reverseNumber(num);
        palindrome(num);
    }

}
