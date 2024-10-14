public class MainDecoratorTask {
    public static void main(String[] args) {
        TextEditor plainText = new SimpleText();
        TextEditor boldText = new BoldDecorator(plainText);
        TextEditor italicBoldText = new ItalicDecorator(boldText);

        System.out.println(plainText.write());        // Обычный текст
        System.out.println(boldText.write());         // Bold текст
        System.out.println(italicBoldText.write());   // Italic + Bold текст
    }
}
