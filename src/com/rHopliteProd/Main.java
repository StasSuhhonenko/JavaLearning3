package com.rHopliteProd;

public class Main {

        public static void main(String[] args) throws Exception {
            System.out.println("Hello, World!");
            boolean isAlien = false;
            if (isAlien == false) {
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

        public static int isOdd =

    }
