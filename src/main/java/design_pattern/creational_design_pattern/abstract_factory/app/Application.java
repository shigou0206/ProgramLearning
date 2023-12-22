package design_pattern.creational_design_pattern.abstract_factory.app;

import design_pattern.creational_design_pattern.abstract_factory.buttons.Button;
import design_pattern.creational_design_pattern.abstract_factory.checkboxes.Checkbox;
import design_pattern.creational_design_pattern.abstract_factory.factories.GUIFactory;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
