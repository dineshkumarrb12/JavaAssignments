package test;

public class Test  {
	public static void main(String[] args) {
	Parent parent=new Parent();
	parent.display();
	Child child=new Child();
	child.display();
	Parent parentchild=new Child();
	parentchild.display(); //though parentchild variable is of type parent, because of overridding concept child method is called.
	
	//parentchild.childdata();   //since parenchild variable is of type parent, child class method are not accessible 
	
	//Child child1=new Parent();
	//child1.display();
	}
}
