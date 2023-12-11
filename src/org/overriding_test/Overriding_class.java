package org.overriding_test;

public class Overriding_class {
	
	
	
	
	
	class Circle extends Shape {
	    @Override
	    public void draw() {
	        System.out.println("Drawing Circle");
	    }
	}

	// Concrete subclass 2
	class Rectangle extends Shape {
	    @Override
	    public void draw() {
	        System.out.println("Drawing Rectangle");
	    }
	}

	
	    public static void main(String[] args) {
	        // Creating objects of concrete subclasses
	        Circle circle = new Circle();
	        Rectangle rectangle = new Rectangle();

	        // Calling the draw method on each object
	        circle.draw();
	        rectangle.draw();
	    }
	}

