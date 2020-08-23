package racingcar.view;

import racingcar.domain.Car;
import stringcalculator.Constants;

import java.util.List;

import static racingcar.Constants.*;
import static racingcar.utils.StringUtils.repeat;

public class ResultView{

    private static OutputChannel outputChannel;

    private ResultView(){
        throw new IllegalArgumentException(Constants.PROTECTED_UTIL_CLASS);
    }

    public ResultView(OutputChannel outputChannel) {
        this.outputChannel = outputChannel;
    }

    public static void printStartResult() {
        outputChannel.printLine("\n"+SAY_VIEW_RESULT);
    }

    public static void printCars(List<Car> cars) {
        cars.forEach(ResultView::printPosition);
    }

    public static void printPosition(Car car) {
        outputChannel.printLine(repeat(PRINT_GO, car.getPosition()));
    }

}