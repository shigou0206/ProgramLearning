package design_pattern.creational_design_pattern.factory_method.factory;

import design_pattern.creational_design_pattern.factory_method.buttons.Button;
import design_pattern.creational_design_pattern.factory_method.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
