public class SpamAnalyzer extends AbstractKeywordAnalyzer{

    private String[] analyzerKey;

    public SpamAnalyzer(String[] analyzerKey) {
        this.analyzerKey = analyzerKey;
    }

    @Override
    public String[] getKeywords() {
        return analyzerKey;
    }

    @Override
    public Task2_2.Label getLabel() {
        return Task2_2.Label.SPAM;
    }
}