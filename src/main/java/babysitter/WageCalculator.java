package babysitter;

public class WageCalculator {

    int preBedTimeWage = 12;
    int preBedTimeEarnings;
//    int BedTimeWage;
//    int MidnightWage;

    public int calculatePreBedTimeEarnings(int startingHour, int endingHour, int bedtime) {
        if (startingHour < bedtime && endingHour < bedtime) {
            return preBedTimeEarnings = preBedTimeWage * (endingHour - startingHour);
        } else {
            return preBedTimeEarnings = 0;
        }
    }
}
//    public int calculateBedTimeWage(int startingHour, int endingHour, int bedtime) {
//
//    }
//
//    public int MidnightWage(int startingHour, int endingHour, int bedtime) {
//
//    }

//    public int calculateShiftWage(int startingHour, int endingHour, int bedtime) {
//        if (startingHour < bedtime && endingHour < bedtime) {
//            return wage = 12;
//        } else if (endingHour > bedtime && endingHour <= 24) {
//            return wage = 8;
//        } else if (endingHour > 24 ) {
//            return wage = 16;
//        }
//
//        else {
//            return 0;
//        }
//    }
//

//    (wages1*shiftonehours1)+(w2*s2)+{w3*s3)= totalPay}

