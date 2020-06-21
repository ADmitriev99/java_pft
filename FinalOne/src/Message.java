public class Message<T> {
    private String MailFrom, MailTo;
    private T Content;

    /**
     * общий класс Message для описаня писем и зарплат (по факту зарплата - пиьсмо с деньгами вместо сообщения)
     * @param s1 - от кого, так просто проще писать, все равно сюда никто заглядывать не будет
     * @param s2 - аналогично с s1, но здесь описан получатель
     * @param s3 - аналогично с s2, но здесь описано содержимое, предназначенное получателю
     */
    public Message(String s1, String s2, T s3) {
        this.MailFrom = s1;
        this.MailTo = s2;
        this.Content = s3;
    }

    /**
     *
     * @return - возвращает имя отправителя
     */
    public String getFrom() {
        return this.MailFrom;
    }

    /**
     *
     * @return - возвращает имя получателя
     */
    public String getTo() {
        return this.MailTo;
    }

    /**
     *
     * @return - возвращает содержимое, предназначенное получателю
     */
    public T getContent() {
        return this.Content;
    }
}
