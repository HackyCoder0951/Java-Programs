class A 
{ 
 int a, b; 
 void display() 
 { 
 System.out.println("Inside class A values ="+a+" "+b); 
 } 
} 
class B extends A 
{ 
 int c; 
 void show() 
 { 
 System.out.println("Inside Class B values="+a+" "+b+" "+c);  } 
} 
class SingleInheritance 
{ 
 public static void main(String args[]) 
{ 
 B obj = new B(); //derived class object 
 obj.a=10; 
 obj.b=20; 
 obj.c=30; 
 obj.display(); 
 obj.show(); 
 } 
}