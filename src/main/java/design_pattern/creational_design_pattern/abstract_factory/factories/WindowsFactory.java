package design_pattern.creational_design_pattern.abstract_factory.factories;

import design_pattern.creational_design_pattern.abstract_factory.buttons.Button;
import design_pattern.creational_design_pattern.abstract_factory.buttons.WindowsButton;
import design_pattern.creational_design_pattern.abstract_factory.checkboxes.Checkbox;
import design_pattern.creational_design_pattern.abstract_factory.checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
