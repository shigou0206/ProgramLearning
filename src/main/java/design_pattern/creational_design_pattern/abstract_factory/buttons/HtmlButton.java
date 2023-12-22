package design_pattern.creational_design_pattern.abstract_factory;

public class HtmlButton  implements Button{

    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
