public class IncrementDemo {
    public static void main(String[] args) {
        int i = 2;
        int res = i++;
        System.out.println("Post-incrémentation: i=" + i + ", res=" + res);

        i = 2;
        res = ++i;
        System.out.println("Pré-incrémentation: i=" + i + ", res=" + res);
    }
}