/**
 * Object : An entity that has a state and behaviour is called an object. An object can be defined as the instance of a class
 * Class : Collections of objects is called a class. Class also be defined as a blueprint from which objects are created
 * Inheritance : When one object acquires all the properties and behaviors of a parent object, it is known as inheritance. It provides code reusability. It is used to achieve runtime polymorphism.
 * Polymorphism : If one task is performed in different ways, it is known as polymorphism. In Java, we use method overloading and method overriding to achieve polymorphism.
 * 
 * @author Surya
 *
 */
public class OopsConcepts {
	public static void main(String[] args) {
		//new Sample().method(); // Anonymous Object
		Sample s = new Sample(1,"Surya");
		s.method();
		StaticVariable sv1 = new StaticVariable();
		sv1.mathod();
		StaticVariable sv2 = new StaticVariable();
		sv2.mathod();
		StaticVariable sv3 = new StaticVariable();		
		sv3.mathod();
		
		subclass sc = new subclass();
		sc.eat();
		FinalClass a1=new FinalClass("Surya");
		FinalClass a2=new FinalClass("geetha");
		FinalClass a3=new FinalClass("nagaraj");
	
		
		
	}
}

class FinalClass{
	final String s;
	public FinalClass(String s) {
		this.s =s;
		System.out.println(this.s);
	}
}

class Sample{
	int id;
	String name;
	
	Sample(int id,String name){
		this.id=id;
		this.name=name;
	}
	public void method() {
		System.out.println(id+" "+name);
	}
}

class StaticVariable{
	static int counter = 0;
	public StaticVariable() {
		// TODO Auto-generated constructor stub
		counter++;
	}
	public void mathod() {
		// TODO Auto-generated method stub
		System.out.println(counter);
	}
}


class Superclass{
	void eat(){
		System.out.println("eating...");
		}  
}

class subclass extends Superclass{
	void bark(){System.out.println("barking...");}  
}

