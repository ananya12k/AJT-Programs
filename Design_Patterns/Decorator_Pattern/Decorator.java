package Decorator_Pattern;

public class Decorator {
    public static void main(String[] args) {
        // Create a plain text
        TextComponent plainText = new PlainText("Hello, world!");

        // Decorate the text with various formatting options
        TextComponent boldItalicUnderlineText = new UnderlineText(new ItalicText(new BoldText(plainText)));

        // Print the formatted text
        System.out.println("Formatted Text: " + boldItalicUnderlineText.getText());
    }
}