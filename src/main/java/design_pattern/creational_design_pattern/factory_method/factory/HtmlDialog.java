package design_pattern.creational_design_pattern.factory_method.factory;

import design_pattern.creational_design_pattern.factory_method.buttons.Button;
import design_pattern.creational_design_pattern.factory_method.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
