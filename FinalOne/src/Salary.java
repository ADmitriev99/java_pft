public class Salary extends Message<Integer> {
    /**
     * здесь зарплата наследуется от Message, в качестве содержимого, предназначенного для получателя использован int
     * @param s1
     * @param s2
     * @param s3
     */
    public Salary(String s1, String s2, int s3) {
        super(s1, s2, s3);
    }
}
