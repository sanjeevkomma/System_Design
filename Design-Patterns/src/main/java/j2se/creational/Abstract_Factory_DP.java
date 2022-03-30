package j2se.creational;

public class Abstract_Factory_DP {

	public static void main(String[] args) {

		AbstractFactory shapeFactory1 = FactoryProducer.getFactory(false);

		Shapes shape1 = shapeFactory1.getShape("RECTANGLE");

		shape1.draw();

		Shapes shape2 = shapeFactory1.getShape("SQUARE");

		shape2.draw();

		AbstractFactory shapeFactory2 = FactoryProducer.getFactory(true);

		Shapes shape3 = shapeFactory2.getShape("RECTANGLE");

		shape3.draw();

		Shapes shape4 = shapeFactory2.getShape("SQUARE");

		shape4.draw();

	}

}

// Create an interface for Shapes
interface Shapes {

	void draw();
}

//
class RoundedRectangle implements Shapes {

	public void draw() {

		System.out.println("Inside RoundedRectangle::draw() method.");
	}
}

//
class RoundedSquare implements Shapes {

	public void draw() {

		System.out.println("Inside RoundedSquare::draw() method.");
	}
}

//
class Rectanglle implements Shapes {

	public void draw() {

		System.out.println("Inside Rectangle::draw() method.");
	}
}

//
class Squares implements Shapes {

	public void draw() {

		System.out.println("Inside Square::draw() method.");
	}
}

//
abstract class AbstractFactory {

	abstract Shapes getShape(String shapeType) ;
}


//
class ShapeFactoryy extends AbstractFactory {

	public Shapes getShape(String shapeType){   

		if(shapeType.equalsIgnoreCase("RECTANGLE")){

			return new Rectanglle();     

		}else if(shapeType.equalsIgnoreCase("SQUARE")){

			return new Squares();
		}	 
		return null;
	}
}

//
class RoundedShapeFactory extends AbstractFactory {

	public Shapes getShape(String shapeType){  

		if(shapeType.equalsIgnoreCase("RECTANGLE")){

			return new RoundedRectangle();      

		}else if(shapeType.equalsIgnoreCase("SQUARE")){

			return new RoundedSquare();
		}	 
		return null;
	}
}

//
class FactoryProducer {

	public static AbstractFactory getFactory( boolean rounded ) {  

		if( rounded ){

			return new RoundedShapeFactory();  

		} else {

			return new ShapeFactoryy();
		}
	}
}