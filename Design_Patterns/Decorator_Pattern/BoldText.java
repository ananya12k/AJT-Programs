package Decorator_Pattern;

public class BoldText extends TextDecorator {
    public BoldText(TextComponent textComponent) {
        super(textComponent);
    }

    @Override
    public String getText() {
        return "<b>" + super.getText() + "</b>"; // Wrap text with HTML bold tags
    }
}