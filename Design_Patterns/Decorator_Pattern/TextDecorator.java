package Decorator_Pattern;

abstract class TextDecorator implements TextComponent {
    protected TextComponent decoratedText;

    public TextDecorator(TextComponent textComponent) {
        this.decoratedText = textComponent;
    }

    @Override
    public String getText() {
        return decoratedText.getText();
    }
}