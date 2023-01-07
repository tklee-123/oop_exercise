package week10.exercise1_1;

import java.time.chrono.MinguoDate;

public class Library {
    Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }

    public Rent getLongestRent() {
        long maxDiffTime = Math.abs(rents[0].getEnd().getTime() - rents[0].getBegin().getTime());
        for (int idx = 1; idx < rents.length; idx++) {
            long diffTime = Math.abs(rents[idx].getEnd().getTime() - rents[idx].getBegin().getTime());
            if (diffTime > maxDiffTime) {
                maxDiffTime = diffTime;
            }
        }

        int index = 0;
        for (int idx = 0; idx < rents.length; idx++) {
            long diffTime = Math.abs(rents[idx].getEnd().getTime() - rents[idx].getBegin().getTime());
            if (diffTime == maxDiffTime) {
                index = idx;
            }
        }
        return rents[index];
    }
}
