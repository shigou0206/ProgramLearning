package design_pattern.behavioral_pattern.mediator.components;

import design_pattern.behavioral_pattern.mediator.mediator.Mediator;

/**
 * Common component interface.
 */
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
