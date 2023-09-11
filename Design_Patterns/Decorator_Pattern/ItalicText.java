package Decorator_Pattern;

public class ItalicText extends TextDecorator {
    public ItalicText(TextComponent textComponent) {
        super(textComponent);
    }

    @Override
    public String getText() {
        return "<i>" + super.getText() + "</i>"; // Wrap text with HTML italic tags
    }
}

