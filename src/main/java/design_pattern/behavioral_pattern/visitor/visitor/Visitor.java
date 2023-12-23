package design_pattern.behavioral_pattern.visitor.visitor;

import design_pattern.behavioral_pattern.visitor.shapes.Circle;
import design_pattern.behavioral_pattern.visitor.shapes.CompoundShape;
import design_pattern.behavioral_pattern.visitor.shapes.Dot;
import design_pattern.behavioral_pattern.visitor.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
