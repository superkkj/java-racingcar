package step3;

public class Car {

    private int position = 0;

    public void goPosition() {
        this.position += 1;
    }

    public int getPosition() {
        return this.position;
    }
    public boolean canGo(int number) {

        return number >= 4 ? true : false;
    }

}