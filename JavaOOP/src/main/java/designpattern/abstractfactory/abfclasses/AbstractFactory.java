package designpattern.abstractfactory.abfclasses;

import designpattern.abstractfactory.classes.Color;
import designpattern.abstractfactory.classes.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShpae(String shape);
    public abstract Color getColor(String color);
}
