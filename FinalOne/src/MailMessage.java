public class MailMessage extends Message<String> {
    /**
     * здесь зарплата наследуется от Message, в качестве содержимого, предназначенного для получателя использован String
     * @param s1
     * @param s2
     * @param s3
     */
    public MailMessage(String s1, String s2, String s3) {
        super(s1, s2, s3);
    }
}