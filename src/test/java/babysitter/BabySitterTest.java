package babysitter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class BabySitterTest {

    @Test
    public void oneHourPreBedTimeShouldPay12() {
        WageCalculator underTest = new WageCalculator();
        int preBedTimeWage = underTest.calculatePreBedTimeEarnings(17, 18, 20);
        assertThat(preBedTimeWage).isEqualTo(12);
    }

    @Test
    public void twoHoursPreBedTimeShouldPay24() {
        WageCalculator underTest = new WageCalculator();
        int preBedTimeEarnings = underTest.calculatePreBedTimeEarnings(17, 19, 20);
        assertThat(preBedTimeEarnings).isEqualTo(24);
    }

    @Test
    public void oneHourBetweenBedTimeAndMidnightShouldPay8() {
        WageCalculator underTest = new WageCalculator();
        int bedTimeWage = underTest.calculateBedTimeEarnings(20, 21, 20);
        assertThat(bedTimeWage).isEqualTo(8);
    }

    @Test
    public void twoHoursBetweenBedTimeAndMidnightShouldPay16() {
        WageCalculator underTest = new WageCalculator();
        int bedTimeWage = underTest.calculateBedTimeEarnings(20,22, 20);
        assertThat(bedTimeWage).isEqualTo(16);
    }

    @Test
    public void oneHourPostMidnightShouldPay16() {
        WageCalculator underTest = new WageCalculator();
        int midnightWage = underTest.calculateMidnightEarnings(24,25, 20);
        assertThat(midnightWage).isEqualTo(16);
    }
//
//    @Test
//    public void oneHourPostMidnightShouldPay16() {
//        WageCalculator underTest = new WageCalculator();
//        int wage = underTest.calculateShiftWage(18, 27, 23);
//        assertThat(wage).isEqualTo(16);
//    }
//
//    @Test
//    public void calculateShiftWages() {
//        WageCalculator underTest = new WageCalculator();
//        int totalPay = underTest.calculateNightlyEarnings()
//    }
}
