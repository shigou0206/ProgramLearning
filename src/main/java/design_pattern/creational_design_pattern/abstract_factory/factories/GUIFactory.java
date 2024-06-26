package design_pattern.creational_design_pattern.abstract_factory.factories;

import design_pattern.creational_design_pattern.abstract_factory.buttons.Button;
import design_pattern.creational_design_pattern.abstract_factory.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
