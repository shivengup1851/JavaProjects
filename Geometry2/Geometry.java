
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import java.awt.geom.RectangularShape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;

/**
 * Geometry computes the volumes and surfae areas of shapes
 * 
 * @author (Shiven Gupta)
 */
public class Geometry
{
    /**
     * Computes the volume of a sphere
     * @param radius the radius of the sphere
     * (Precondition: radius >= 0)
     * @return the volume of the sphere
     * (Postcondition: The volume of the sphere is greater than or equal to 0)
     */
    public static double sphereVolume(double radius) {
        return Math.pow(radius, 3) * Math.PI * (4.0 / 3.0);
    }
    /**
     * Computes the surface area of a sphere
     * @param radius the radius of the sphere
     * (Precondition: radius >= 0)
     * @return the surface area of the sphere
     * (Postcondition: The surface area of the sphere is greater than or equal to 0)
     */
    public static double sphereSurface(double radius) {
        return Math.pow(radius, 2) * Math.PI * 4;
    }
    /**
     * Computes the volume of a cylinder
     * @param radius the radius of the cylinder
     * (Precondition: radius >= 0)
     * @param height the height of the cylinder
     * (Precondition: height >= 0)
     * @return the volume of the cylinder
     * (Postcondition: The volume of the cylinder is greater than or equal to 0)
     */
    public static double cylinderVolume(double radius, double height) {
        return Math.pow(radius, 2) * Math.PI * height;
    }
    /**
     * Computes the surface area of a cylinder
     * @param radius the radius of the cylinder
     * (Precondition: radius >= 0)
     * @param height the height of the cylinder
     * (Precondition: height >= 0)
     * @return the surface area of the cylinder
     * (Postcondition: The surface area of the cylinder is greater than or equal to 0)
     */
    public static double cylinderSurface(double radius, double height) {
        return (2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius);
    }
    /**
     * Computes the volume of a cone
     * @param radius the radius of the cone
     * (Precondition: radius >= 0)
     * @param height the height of the cone
     * (Precondition: height >= 0)
     * @return the volume of the cone
     * (Postcondition: The volume of the cone is greater than or equal to 0)
     */
    public static double coneVolume(double radius, double height) {
        return Math.pow(radius, 2) * Math.PI * (height / 3.0);
    }
    /**
     * Computes the surface area of a cone
     * @param radius the radius of the cone
     * (Precondition: radius >= 0)
     * @param height the height of the cone
     * (Precondition: height >= 0)
     * @return the surface area of the cone
     * (Postcondition: The surface area of the cone is greater than or equal to 0)
     */
    public static double coneSurface(double radius, double height) {
        return Math.PI * radius * (radius + Math.sqrt((height*height) + (radius*radius)));
    }
    /**
     * Computes the slope of a line given two points
     * @param point1 the first endpoint of the line
     * @param point2 the second endpoint of the line
     * (Precondition: The points cannot have the same x values)
     * @return the slope of the line
     */
    public static double getSlope(Point2D.Double point1, Point2D.Double point2) {
        if(point2.getX() - point1.getX() == 0)
            return -999;
        else
        return (point2.getY() - point1.getY()) / (point2.getX() - point1.getX());
        
    }
    /**
     * Computes the angle of a line given two points relative to the x-axis
     * @param point1 the first endpoint of the line
     * @param point2 the second endpoint of the line
     * (Precondition: The points cannot have the same x values)
     * @return the angle between the line and the x-axis
     */
    public static double getAngle(Point2D.Double point1, Point2D.Double point2) {
        if(point2.getX() - point1.getX() == 0)
            return -999;
       else
        return Math.toDegrees(Math.atan((point2.getY() - point1.getY()) / (point2.getX() - point1.getX())));
        
    }
    /**
     * Computes the area of an ellipse
     * @param x the ellipse object
     * (Precondition: the width and height of the ellipse must be greater than 0)
     * @return the area of the ellipse
     * (Postcondition: the area must be greater than 0)
     */
    public static double getEllipseArea(Ellipse2D.Double x) {
        return Math.PI * (x.width / 2) * (x.height / 2);
    }
    /**
     * Computes the area of a rectangle
     * @param x the rectangle object
     * (Precondition: the width and height of the rectangle must be greater than 0)
     * @return the area of the rectangle
     * (Postcondition: the area must be greater than 0)
     */
    public static double getRectangleArea(Rectangle x) {
        return x.width * x.height;
    }
}
