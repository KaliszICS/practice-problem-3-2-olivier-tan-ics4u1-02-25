public class PracticeProblem {

    public static int towerOfHanoi(int num) {
        if (num < 3) {
            return -1;
        }
        return hanoiRecursive(num);
    }

    public static int hanoiRecursive(int num) {
        if (num == 1) {
            return 1;
        }
        return 2 * hanoiRecursive(num - 1) + 1;
    }
}