package Decorator_Pattern;

public class UnderlineText extends TextDecorator {
    public UnderlineText(TextComponent textComponent) {
        super(textComponent);
    }

    @Override
    public String getText() {
        return "<u>" + super.getText() + "</u>"; // Wrap text with HTML underline tags
    }
}
