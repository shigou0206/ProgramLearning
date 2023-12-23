package design_pattern.behavioral_pattern.visitor.shapes;

import design_pattern.behavioral_pattern.visitor.visitor.Visitor;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
