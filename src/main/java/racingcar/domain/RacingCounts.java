package racingcar.domain;

import java.util.Objects;

public class RacingCounts {

    private int racingCounts;

    public RacingCounts(int racingCounts) {
        this.racingCounts = racingCounts;
    }
    public int getRacingCounts() {
        return this.racingCounts;
    }

    public boolean checkZeroOrMinusRacingCounts() {
        return getRacingCounts() <= 0;
    }

    public int decreaseRacingCounts() {
        return getRacingCounts() - 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass( ) != o.getClass( )) return false;
        RacingCounts that = (RacingCounts) o;
        return racingCounts == that.racingCounts;
    }

    @Override
    public int hashCode() {
        return Objects.hash(racingCounts);
    }
}