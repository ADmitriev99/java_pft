public class Task2_2 {
    public enum Label {
        SPAM, NEGATIVE_TEXT, TOO_LONG, OK
    }
    public static void main(String[] args) {
        TextAnalyzer [] i = new TextAnalyzer[0];
        System.out.println(verificationText(i, "adasd").toString());
    }
    public static Label verificationText(TextAnalyzer[] textAnalyzers, String text) {
        for (TextAnalyzer textAnalyzer : textAnalyzers) {
            if (textAnalyzer.processText(text) != Label.OK)
                return textAnalyzer.processText(text);
        }
        return Label.OK;
    }

}
