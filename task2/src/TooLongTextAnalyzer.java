import org.jetbrains.annotations.NotNull;

public class TooLongTextAnalyzer implements TextAnalyzer {

    private int length=0;

    public TooLongTextAnalyzer(int length) {
        this.length = length;
    }

    @Override
    public Task2_2.Label processText(@NotNull String text) {
        if (text.length() > length)
            return Task2_2.Label.TOO_LONG;
        else
            return Task2_2.Label.OK;
    }
}