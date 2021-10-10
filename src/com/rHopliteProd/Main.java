package com.rHopliteProd;

import java.util.Scanner;

public class Main {
        public static void main(String[] args){
            System.out.println("Hello, World!");
            Scanner input = new Scanner(System.in);
            boolean isAlien = false;
            if (!isAlien) {
                System.out.println("It is not an Alien");
                System.out.println("And I'm afraid of aliens");
            }

            int topScore = 100;
            if (topScore != 100){
                System.out.println("You got the high score");
            }
            int secondTopScore = 81;
            if ((topScore > secondTopScore) || (topScore <= 100)){
                System.out.println("Greater than second top score and less than 100");
            }

            boolean isCar = false;
            if (isCar) {
                System.out.println("This is not supposed to happen");
            }

            isCar = true;
            boolean wasCar = isCar ? true : false;
            if(wasCar){
                System.out.println("wasCar is true");
            }

            double myFirstVar = 20.00d;
            double mySecVar = 80.00d;
            double resultFirst = (myFirstVar + mySecVar) * 100.00d;
            double resultSecond = resultFirst % 40.00d;
            if(resultSecond == 0){
                boolean SetBool = true;
                System.out.println("There result is " + SetBool);
            }
            if(resultSecond > 0 || resultSecond < 0){
                System.out.println("Got some remainder " + resultSecond);
            }

            double mywFirstVar = 20.00d;
            double mywSecVar = 80.00d;
            double resulwFirst = (mywFirstVar + mywSecVar) * 100.00d;
            double resultwSecond = resulwFirst % 40.00d;
            boolean isNoRemainder = (resultwSecond == 0) ? true : false;
            if(isNoRemainder){
                System.out.println("There's no remainder!");
            }
            if(!isNoRemainder){
                System.out.println("Here's your remainder");
            }

            calculateScore(true,5000,5,100);
            calculateScore(true,10000,8,200);

            int highScore = calculateScore(true, 5000, 5, 100);
            System.out.println("Your highest score is " + highScore);

            int highScorePosition = calculateHighScorePosition(1500);
            displayHighScorePosition("VAZ ", highScorePosition);

            highScorePosition = calculateHighScorePosition(900);
            displayHighScorePosition("MAZ ", highScorePosition);

            highScorePosition = calculateHighScorePosition(400);
            displayHighScorePosition("KAMAZ ", highScorePosition);

            highScorePosition = calculateHighScorePosition(50);
            displayHighScorePosition("GAZ ", highScorePosition);

            int newScore = calculateScoreR("Stas", 300);
            System.out.println("New score is " + newScore);

            double convertedCentimeters = calcFeetAndInchestoCentimeters(12, 4);
            System.out.println(convertedCentimeters);
            double convertedFeet = calcFeetAndInchestoCentimeters(48);
            System.out.println(convertedFeet);
            System.out.println(getDurationString(3477));
            System.out.println(area(53));
            printYearsAndDays(2360000);
            printEqual(5, 5, 5);
            System.out.println(isCatPlaying(true, 44));

            System.out.println(getDaysInMonth(2, 2024));
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            // Switch statement explanation
            int switchValue = 3;
            switch(switchValue){
                case 1:
                    System.out.println("Value was 1");
                    break;

                case 2:
                    System.out.println("Value was 2");
                    break;
                default:
                    System.out.println("Was not one or two");

            }
            char switchValue3 = 'H';
            switch (switchValue3) {
                case 'A':
                    System.out.println("Value is A");
                    break;
                case 'B':
                    System.out.println("Value is B");
                    break;
                case 'C':
                    System.out.println("Value is C");
                    break;
                case 'D':
                    System.out.println("Value is D");
                    break;
                case 'E':
                    System.out.println("Value is E");
                    break;
                default:
                    System.out.println("Wasn't any of these");
                    break;
            }
            String month = "January";
            switch(month.toLowerCase()){
                case "january":
                    System.out.println("Jan");
                    break;
                case "june":
                    System.out.println("Jun");
                    break;
                case "december":
                    System.out.println("Dec");
                    break;
                default:
                    System.out.println("Not sure");
                    break;
            }
            printDayOfTheWeek(4);
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));

            // "FOR" LOOP EXPLANATION
            for(int i = 0; i < 5; i++){
                System.out.println("Loop " + i + " hello!");
            }
            System.out.println("-------------------------------------------------------------");
            for(int i = 2; i < 9; i++){
                System.out.println("10,000 at " + i + "% interest = " + String.format("%.1f",calculateInterest(10000, i)));
            }
            System.out.println("-------------------------------------------------------------");
            for(int i = 8; i > 1; i--){
                System.out.println("10,000 at " + i + "% interest = " + String.format("%.1f",calculateInterest(10000, i)));
            }
            System.out.println("-------------------------------------------------------------");
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// PRIME NUMBERS CHALLENGE

            int count = 0;
            for(int i = 10; i < 50 ; i++){
                if(isPrime(i) == true){
                    count++;
                    System.out.println("Number " + i + " is a prime number");
                    if(count == 3){
                        System.out.println("Exiting for loop");
                        break;
                    }
                }

            }
            int dividableNumber = 0;
            int sum = 0;
            for(int i = 1; i < 1000; i++){
                if(i % 3 == 0 && i % 5 == 0){
                    dividableNumber++;
                    System.out.println("Loop number is " + i);
                    sum += i;
                }
                if (dividableNumber == 5){
                    System.out.println("The Loop Has Ended");
                    System.out.println("The sum of all numbers is " + sum);
                    break;
                }

            }
            System.out.println("The sum of odd numbers found is "+ sumOdd(1,11));

            // WHILE LOOP EXPLANATION
           int counts = 0;
           while(counts != 6){
               System.out.println("Count value is " + counts);
               counts++;
            }
           int number = 4;
           int finishNumber = 20;
           int coutise = 0;
           while (number <= finishNumber){
               if(!isEvenNumber(number)){
                   number++;
               }else{
                   coutise++;
                   System.out.println("Even number " + number);
                   number++;
                   if(coutise >=5){
                       break;
                   }
               }
           }
            System.out.println("Total " + coutise + " even numbers found");
            System.out.println("The sum of the digits is " + sumDigits(125));
            if(isPalindrome(5665)){
                System.out.println(" This number is a palindrome");
            } else if(!isPalindrome(5665)){
                System.out.println("This is not a palindrome");
            }
            System.out.println("The sum of first and last digit is " + sumFirstAndLastDigit(5));
            System.out.println("The sum of first and last digit is " + sumFirstAndLastDigit(10));
            System.out.println("The sum of first and last digit is " + sumFirstAndLastDigit(101));
            // System.out.println(getEvenDigitSum(45678));
            // System.out.println(hasSharedDigit(9, 9));
            // System.out.println(hasSameLastDigit(5678, 7998, 4338));
            // System.out.println(getGreatestCommonDivisor(81, 153));
            // System.out.println( isPerfectNumber(5) + " is Perfect Number, Horray");
            // numberToWords(33949);
            // int numberStr = Integer.parseInt("23535");
            // System.out.println(numberStr);
            // getLargestPrime(45);
            // printSquareStar(8);
            // nameAndYearInput();
            // userMinimumAndMaximum();
            // inputThenPrintSumAndAverage();
//            System.out.println(getBucketCount(3.4,1.5));;
//            Car porsche = new Car();
//            Car VAZ = new Car();
//            porsche.setModel("Carrera");
//            System.out.println("Model is " + porsche.getModel());
//            //===================================================================================================================================
//            BankAccount stasAccount = new BankAccount("34552", 3400.00,"Stas","swefgr", "457875225");
//            System.out.println("Your bank account has " + stasAccount.getBalance() + " euros");
//            stasAccount.depositFunds();
//            stasAccount.withdrawal();
//            VipCustomer customer1 = new VipCustomer();
//            System.out.println(customer1.getName());
//            VipCustomer customer2 = new VipCustomer("Bob", 25000.00);
//            System.out.println(customer2.getName());
//            VipCustomer customer3 = new VipCustomer("Dan",45000.00,"example@gmail.com");
//            System.out.println(customer3.getName());
//            Wall wall = new Wall(5,4);
//            System.out.println("area = " + wall.getArea());
//            wall.setHeight(-1.5);
//            System.out.println("width = " + wall.getWidth());
//            System.out.println("Height = " + wall.getHeight());
//            System.out.println("area = " + wall.getArea());
//            Point first = new Point(6, 5);
//            Point second = new Point(3, 1);
//            System.out.println("distance(0,0)= " + first.distance());
//            System.out.println("distance(second)= " + first.distance(second));
//            System.out.println("distance(2,2)= " + first.distance(2, 2));
//            Point point = new Point();
//            System.out.println("distance()= " + point.distance());
            Carpet carpet = new Carpet(3.5);
            Floor floor = new Floor(2.75, 4.0);
            Calculator calculator = new Calculator(floor, carpet);
            System.out.println("total= " + calculator.getTotalCost());
            carpet = new Carpet(1.5);
            floor = new Floor(5.4, 4.5);
            calculator = new Calculator(floor, carpet);
            System.out.println("total= " + calculator.getTotalCost());

 //  MAIN METHOD END +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        }
        public static int calculateScore (boolean gameOver,int score,
        int levelCompleted,int bonus) {
            if(gameOver) {
                int finalScore = score +(levelCompleted * bonus);
                finalScore += 1000;
                return finalScore;
            } else{
                return -1;
            }
        }

        public static void displayHighScorePosition(String playerName , int position){
            System.out.println(playerName + "managed to get into position "
                    + position + " on the highScore table");
        }

        public static int calculateHighScorePosition(int playerScore){
            // if(playerScore >= 1000){
            //     return 1;
            // }else if(playerScore >= 500){
            //     return 2;
            // }else if(playerScore >= 100){
            //     return 3;
            // }
            // return 4;

            int position = 4; // assuming position 4 will be returned


            if(playerScore >= 1000){
                position = 1;
            } else if(playerScore >= 500) {
                position = 2;
            } else if(playerScore >= 100) {
                position = 3;
            }
            return position;
        }

        public static void printMegaBytesAndKiloBytes(int kilobytes){

            int megabytes = kilobytes % 1024;
            System.out.println(megabytes);
        }


        public static int calculateScoreR(String playerNamee, int scoree){
            System.out.println("Player " + playerNamee + " scored " + scoree + " points");
            return scoree * 1000;
        }

        public static double calcFeetAndInchestoCentimeters( double feet, double inches){
            if(feet >= 0 && inches >= 0 && inches <= 12){
                double newInches = ((feet * 12) + inches);
                double centimeters = newInches * 2.54;
                return centimeters;
            } else {
                return -1;
            }
        }

        public static double calcFeetAndInchestoCentimeters( double inches){
            if(inches >= 0){
                double feet = (inches / 12);
                return feet;
            } else {
                return -1;
            }
        }
        // Overloaded Seconds and Minutes to H, M, S converter
        private static String getDurationString(int minutes, int seconds){
            if(minutes <= 0 || seconds <= 0 || seconds >= 59){
                return "Invalid value";
            }else{
                int newSeconds = ((minutes * 60) + seconds);
                int hours = (newSeconds / 3600);
                int newMinutes = ((newSeconds % 3600) / 60);
                int newSecondsn = (newSeconds % 3600) % 60;
                String result = hours + "h " + newMinutes + "m " + newSecondsn + "s ";
                return result;

            }
        }

        private static String getDurationString(int seconds){
            if(seconds < 0){
                return "Invalid value";
            }else{
                int minutes = seconds / 60;
                int newSeconds = (seconds % 60);
                return getDurationString(minutes, newSeconds);

            }
        }
        // Area Calculator
        public static double area(double radius){
            if(radius < 0){
                return -1.0;
            } else {
                double a1 = radius;
                double b1 = 2;
                double radiusin2 = Math.pow(a1,b1);
                double Area = Math.PI * radiusin2;
                return Area;
            }
        }

        public static double area(double x, double y){
            if(x < 0 && y < 0){
                return -1.0;
            } else {
                double Area = x * y;
                return Area;
            }
        }
        // Minutes to Years and Days Calculator
        public static void printYearsAndDays(long minutes){
            if(minutes < 0){
                System.out.println("Invalid value");
            } else {
                long years = ((minutes / 60) / 24) / 365;
                long days = ((minutes / 60) / 24) % 365;
                System.out.println(minutes + " min = " + years + "y and " + days + " d" );
            }
        }
        // Equality printer
        public static void printEqual(int a, int b, int c){
            if(a < 0 || b < 0 || c < 0){
                System.out.println("Invalid Value");
            } else {
                if(a == b && b == c && c == a){
                    System.out.println("All numbers are equal");
                } else if(a != b && b != c && c != a) {
                    System.out.println("All numbers are different");
                } else {
                    System.out.println("Neither all are equal or different");
                }
            }
        }

        // Playing Cat
        public static boolean isCatPlaying(boolean summer, int temperature){
            if(summer){
                if(temperature >= 25 && temperature <= 45){
                    return true;
                } else {
                    return false;
                }
            } else {
                if(temperature >= 25 && temperature <= 35){
                    return true;
                } else {
                    return false;
                }
            }
        }

        //Day of the Week Challenge
        public static void printDayOfTheWeek(int day){
            switch (day) {
                case 0:
                    System.out.println("Sunday");
                    break;
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Invalid day");
                    break;
            }
        }

        //Number in Word
        public static void printNumberInWord(int number){
            switch (number) {
                case 0:
                    System.out.println("ZERO");
                    break;
                case 1:
                    System.out.println("ONE");
                    break;
                case 2:
                    System.out.println("TWO");
                    break;
                case 3:
                    System.out.println("THREE");
                    break;
                case 4:
                    System.out.println("FOUR");
                    break;
                case 5:
                    System.out.println("FIVE");
                    break;
                case 6:
                    System.out.println("SIX");
                    break;
                case 7:
                    System.out.println("SEVEN");
                    break;
                case 8:
                    System.out.println("EIGHT");
                    break;
                case 9:
                    System.out.println("NINE");
                    break;
                default:
                    System.out.println("OTHER");
                    break;
            }
        }

        // Number of Days in Month

        public static boolean isLeapYear(int year){
            if(year <= 0 && year > 9999){
                return false;
            } else {
                if(year % 4 == 0 && year % 100 != 0){
                    return true;
                } else if(year % 400 == 0){
                    return true;
                } else {
                    return false;
                }
            }
        }

        public static int getDaysInMonth(int month, int year){
            if((month < 1 || month > 12) || (year < 1 || year > 9999)){
                return -1;
            } else {
                switch (month) {
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        return 31;
                    case 2:
                        if(isLeapYear(year)){
                            return 29;
                        } else {
                            return 28;
                        }
                    case 4: case 6: case 9: case 11:
                        return 30;
                    default:
                        return -1;
                }
            }
        }

        public static double calculateInterest(double amount, double interestRate){
            return(amount *(interestRate/ 100));
        }

        public static boolean isPrime(int n){
            if(n == 1){
                return false;
            }

            for(int i = 2; i <= n/2; i++) {
                if(n % i == 0){
                    return false;
                }
            }
            return true;
        }
// isOdd Exercise
        public static boolean isOdd(int number){
            if(number < 0){
                return false;
            } else {
                if(number % 2 != 0){
                    return true;
                } else {
                    return false;
                }
            }
        }

        public static int sumOdd(int start, int end){
            int sum = 0;
            if (end >= start || start >= 0){
                for (int i = start; i <= end; i++){
                    if(isOdd(i)){
                        sum += i;
                    }
                }
                return sum;
            } else {
                return -1;
            }
        }

        public static boolean isEvenNumber(int number){
            if(number % 2 == 0){
                return true;
            } else {
                return false;
            }
        }

        // DIGIT SUM CHALLENGE

        private static int sumDigits(int number){
            if(number < 10){
                return -1;
            }
            int sum = 0;
            while(number > 0){
                //extract the least-significant digit
                int digit = number % 10;
                sum+=digit;
                //drop the least sigificant digit
                number /= 10;
            }
            return sum;
        }

        private static boolean isPalindrome(int number){
            int reverse = 0;
            int originalNumber = number;
            int lastDigit = 0;

            while (number != 0){
                lastDigit = number % 10;
                reverse = reverse * 10;
                reverse += lastDigit;
                number /= 10;
            }

            return originalNumber == reverse;
        }

        public static int sumFirstAndLastDigit(int num){
            int firstDigit = 0;
            if(num < 0){
                return -1;
            } else {
                int lastDigit = num % 10;
                while(num > 9){
                    firstDigit = num / 10;
                    num /= 10;
                }
                if(num < 10){
                    firstDigit = num;
                }
                int sum = firstDigit + lastDigit;
                return sum;
            }
        }
    public static int getEvenDigitSum(int num){
        int sum = 0;
        if(num < 0){
            return -1;
        }
        while(num > 0){
            int lastDigit = num % 10;
            if(lastDigit % 2 == 0){
                sum += lastDigit;
            }
            num /= 10;
        }
        System.out.println(sum);
        return sum;
    }

    public static boolean hasSharedDigit(int numA, int numB){
        if((numA < 10 || numA > 99) || (numB < 10 || numB > 99)){
            return false;
        } else {
            int firstDigitA = numA / 10;
            int lastDigitA = numA % 10;
            int firstDigitB = numB / 10;
            int lastDigitB = numB % 10;
            if(firstDigitA == firstDigitB || firstDigitA == lastDigitB || lastDigitA == firstDigitB || lastDigitA == lastDigitB ){
                return true;
            } else {
                return false;
            }
        }
    }

    public static boolean hasSameLastDigit(int x, int y, int z){
        if((x < 10 || x > 1000) || (y < 10 || y > 1000) || (z < 10 || z > 1000)){
            return false;
        } else {
            int lastDigitA = x % 10;
            int lastDigitB = y % 10;
            int lastDigitC = z % 10;
            if(lastDigitA == lastDigitB || lastDigitA == lastDigitC || lastDigitB == lastDigitC){
                return true;
            } else {
                return false;
            }
        }
    }

    public static boolean isValid(int x){
        if(x < 10 || x > 1000){
            return false;
        } else {
            return true;
        }
    }

    public static int getGreatestCommonDivisor(int first, int second){
        int commonDivisor = 1;
        if(first < 10 || second < 10){
            return -1;
        }
        for (int i = 1; i <= first && i <= second; i++){
            if(first % i == 0 && second % i ==0) {
                commonDivisor = i;
            }
        }
        return commonDivisor;
    }

    public static void printFactors(int num){
        if(num < 1){
            System.out.println("Invalid value");
        }
        int factor = 1;
        while(factor < num){
            if(num % factor == 0){
                System.out.println(factor);
            }
            factor++;
        }
    }
    public static boolean isPerfectNumber(int num){
        if(num < 1){
            return false;
        }
        int factor = 1;
        int sum = 0;
        while(factor < num){
            if(num % factor == 0){
                System.out.println(factor);
                sum += factor;
            }
            factor++;
        }
        if(sum == num){
            return true;
        } else {
            return false;
        }
    }
    // NUMBER TO WORDS HARD CHALLENGE
    public static void numberToWords(int num){
        if(num < 0){
            System.out.println("Invalid value");
        }

        int reversedNum = reverse(num);

        int lastDigit = 0;
        for(int i = 1; i <= getDigitCount(num); i++){
            lastDigit = reversedNum % 10;
            reversedNum /= 10;
            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid Value");
                    break;
            }
        }
    }

    public static int reverse(int num2) {
        int reversedNumber = 0;
        while(num2 !=0){
            int lastDigitr = num2 % 10;
            reversedNumber *= 10;
            reversedNumber += lastDigitr;
            num2 /= 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int num3){
        if(num3 < 0){
            return -1;
        }
        int count = 1;

        while (num3 > 9) {
            num3 /= 10;
            count++;
        }
        return count;
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        int bc = bigCount * 5;
        int sum = (bc + smallCount);

        if(sum < goal){
            return false;
        } else if (sum >= goal) {
            if((goal % 5) <= smallCount){
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }

    public static int getLargestPrime(int num){
        if(num < 2){
            return -1;
        }
        for(int i = num -1; i > 1; i--){
            if(num % i == 0){
                num = i;
            }
        }
        return num;
    }
    // DIAGONAL STAR SHIT
    public static void printSquareStar(int num){
        if(num < 5){
            System.out.println("Invalid Value");
        } else {
            for(int row = 1; row <= num; row++){
                if(row == 1 || row == num){
                    int count = 1;
                    while(count <= num){
                        System.out.print("*");
                        count++;
                    }
                    System.out.println();
                } else {
                    for(int column = 1; column <= num; column++){
                        if(column == 1|| column == num){
                            System.out.print("*");
                        }else if(column == (num - row + 1)){
                            System.out.print("*");
                        }else if(column == row){
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
        }
    }
    public static void nameAndYearInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your YoB: ");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt){
            int yOB = scanner.nextInt();
            scanner.nextLine(); //Handling Enter key issue
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2021 - yOB;
            if(age >= 0 && age <= 150){
                System.out.println("Your name is " + name + " and your age is " + age);
            }else{
                System.out.println("Invalid Year of Birth");
            }
        } else {
            System.out.println("Unable to parse year of Birth");
        }
    }

    public static void input10NumbersChallenge(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter 10 random numbers");
        int count = 1;
        int sum = 0;
        while(count < 11){
            System.out.println("Enter number #" + count);
            boolean hasNextInteger = scanner1.hasNextInt();
            if(!hasNextInteger){
                System.out.println("Invalid number");
                scanner1.nextLine();
            } else {
                sum += scanner1.nextInt();
                scanner1.nextLine();
                count++;
            }
        }
        System.out.println("The sum of input is " + sum);
    }

    public static void userMinimumAndMaximum(){
        Scanner input = new Scanner(System.in);
        int max = 0;
        int min = 0;
        boolean start = true;
        while(start){
            System.out.println("Enter number ");
            boolean hasNextInt = input.hasNextInt();
            if(hasNextInt){
                int num = input.nextInt();
                if(num > max){
                    max = num;
                }
                if(num < min){
                    min = num;
                }
            } else {
                System.out.println("User minimum is " + min);
                System.out.println("User maximum is " + max);
                break;
            }
            input.nextLine(); // Handling ENTER key bug
        }
    }
    public static void inputThenPrintSumAndAverage(){
        System.out.println("This method sums up and generate the" +
                " average" +
                " of the numbers that you have inputted");
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while(input.hasNextInt()){
            System.out.println("Enter the number: ");
            sum += input.nextInt();
            input.nextLine();
            count++;
        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum/ count));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket,int extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        double bucketsNeeded = ((width * height) / areaPerBucket) - extraBuckets;
        double roundedBucketsNeeded = Math.ceil(bucketsNeeded);
        return (int)roundedBucketsNeeded;
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }
        double bucketsNeeded = getBucketCount(width, height, areaPerBucket, 0);
        return (int)bucketsNeeded;
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }
        double bucketsNeeded = getBucketCount(area, 1, areaPerBucket);
        return (int)bucketsNeeded;
    }
}
