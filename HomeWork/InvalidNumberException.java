package HomeWork;

public class InvalidNumberException extends Exception{
    private int num;

    public InvalidNumberException(String message, int num) {
        super(message);
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}
