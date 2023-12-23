package design_pattern.behavioral_pattern.state;

import design_pattern.behavioral_pattern.state.ui.Player;
import design_pattern.behavioral_pattern.state.ui.UI;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}