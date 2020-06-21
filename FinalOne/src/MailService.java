import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Message> {
    /**
     * сервис, по приему и рассылке сообщения и зарплат
     * так как все private, то на середине пути никто не может ничего поменять и резко переобуться
     * содержит в себе письма и зарплаты каждому конкретному получателю
     */
    /**
     * переопределяем метод .get, который выдаст список писем и зарплат по получателю
     */
    private final Map<String, List<T>> mailBox = new HashMap<>() {
        @Override
        public List<T> get(Object key) {
            return super.getOrDefault(key, new LinkedList<T>());
        }
    };


    /**
     * метод добавления письма/зарплаты в почтовый ящик
     */
    @Override
    public void accept(Message message) {
        if (!mailBox.containsKey(message.getTo()))
            mailBox.put(message.getTo(), new ArrayList<>());

        mailBox.get(message.getTo()).add((T) message.getContent());
    }

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }
}
