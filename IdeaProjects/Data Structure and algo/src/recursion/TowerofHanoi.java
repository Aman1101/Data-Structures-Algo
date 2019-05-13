package recursion;

public class TowerofHanoi {

    public void move(int number, char from, char to, char inter) {

        if (number == 1) {
            System.out.println("Moving disc 1 From " + from + " To " + to);
        } else {
            move(number - 1, from, inter, to);
            System.out.println("Moving disc " + number + " From " + from + " To " + to);
            move(number - 1, inter, to, from);
        }
    }

    public static void main(String[] args) {
        TowerofHanoi th = new TowerofHanoi();
        th.move(10, 'A', 'B', 'C');
    }
}
