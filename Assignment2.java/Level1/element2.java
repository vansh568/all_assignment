public class element2 {
    public static void main(String[] args) {
        int maths = 94;
        int physics = 95;
        int chemistry = 96;

        int totalMarks = maths + physics + chemistry;
        int maxMarks = 100 * 3;

        double percentage = (totalMarks * 100.0) / maxMarks;

        System.out.println("Sam's average percentage in PCM is: " + percentage + "%");
    }
}
