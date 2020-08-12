package babysitter;

public class WageCalculator {

    int preBedTimeWage = 12;
    int preBedTimeEarnings;
    int bedTimeWage = 8;
    int bedTimeEarnings;
    int midnightWage = 16;
    int midnightEarnings;
    int totalPay;

    public int calculatePreBedTimeEarnings(int startingHour, int endingHour, int bedtime) {
        if (startingHour < bedtime && endingHour <= bedtime) {
            return preBedTimeEarnings = preBedTimeWage * (endingHour - startingHour);
        } else if (startingHour < bedtime && endingHour > bedtime) {
            return preBedTimeEarnings = preBedTimeWage * (bedtime - startingHour);
        } else {
            return preBedTimeEarnings = 0;
        }
    }

    public int calculateBedTimeEarnings(int startingHour, int endingHour, int bedtime) {
        if (endingHour > bedtime && endingHour > 24) {
            return bedTimeEarnings = bedTimeWage * (24 - bedtime);
        } else if (endingHour > bedtime && endingHour <= 24) {
            return bedTimeEarnings = bedTimeWage * (endingHour - bedtime);
        } else {
            return bedTimeEarnings = 0;
        }
    }ChessCChess
    

    public int calculateMidnightEarnings(int startingHour, int endingHour, int bedtime) {
        if (endingHour > 24) {
            return midnightEarnings = midnightWage * (endingHour - 24);
        } else {
            return midnightEarnings = 0;
        }
    }

    public int calculateTotalEarnings(int startingHour, int endingHour, int bedtime) {
        calculatePreBedTimeEarnings(startingHour, endingHour, bedtime);
        calculateBedTimeEarnings(startingHour, endingHour, bedtime);
        calculateMidnightEarnings(startingHour, endingHour, bedtime);
        totalPay = preBedTimeEarnings + bedTimeEarnings + midnightEarnings;
        return totalPay;
    }
}

