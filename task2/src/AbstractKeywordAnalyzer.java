public abstract class AbstractKeywordAnalyzer implements TextAnalyzer{

    public abstract String[] getKeywords();

    public abstract Task2_2.Label getLabel();

    public Task2_2.Label processText(String text) {
        String[] keywords = getKeywords();
        for (String s : keywords) {
            if (text.contains(s))
                return getLabel();
        }
        return Task2_2.Label.OK;

    }

}