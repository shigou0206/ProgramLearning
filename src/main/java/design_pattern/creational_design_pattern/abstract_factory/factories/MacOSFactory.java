package design_pattern.creational_design_pattern.abstract_factory.factories;

import design_pattern.creational_design_pattern.abstract_factory.buttons.Button;
import design_pattern.creational_design_pattern.abstract_factory.buttons.MacOSButton;
import design_pattern.creational_design_pattern.abstract_factory.checkboxes.Checkbox;
import design_pattern.creational_design_pattern.abstract_factory.checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
