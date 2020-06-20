public class NegativeTextAnalyzer extends AbstractKeywordAnalyzer{

    private String[] analyzerKey = {":(", "=(", ":|"};

    @Override
    public String[] getKeywords() {
        return analyzerKey;
    }

    @Override
    public Task2_2.Label getLabel() {
        return Task2_2.Label.NEGATIVE_TEXT;
    }
}