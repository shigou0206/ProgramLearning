package design_pattern.creational_design_pattern.builder.builders;

import design_pattern.creational_design_pattern.builder.cars.CarType;
import design_pattern.creational_design_pattern.builder.components.Engine;
import design_pattern.creational_design_pattern.builder.components.GPSNavigator;
import design_pattern.creational_design_pattern.builder.components.Transmission;
import design_pattern.creational_design_pattern.builder.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}