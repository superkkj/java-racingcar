package racingcar.strategy;

import static racingcar.Constants.*;

import java.util.Random;

public class OneOrZeroForwardCondition implements RaceCondition {
        Random random = new Random();

    @Override
    public boolean pass() {
        return FORWARD_OK_COND_NUM <= random.nextInt(RANDOM_BOUND);
    }
}