package csc372module4;

public class ShapeArray {

    public static void main(String[] args) {

    	Shape sphere = new Sphere(5.0);
    	Shape cylinder = new Cylinder(3.0, 7.0);
    	Shape cone = new Cone(2.0, 6.0);

        Shape[] shapeArray = {sphere, cylinder, cone};

        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
        }
    }
}

