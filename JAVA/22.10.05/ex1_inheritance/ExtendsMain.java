package ex1_inheritance;

public class ExtendsMain {
public static void main(String[] args) {
	
	
	
	/*
	 
	 [ 상속 ]
	 : 상속관계의 객체에서 자식클래스는 부모가 가진 속성을 마음대로 가져다가 사용할 수 있다.  
	 : 아무리 상속관계의 객체라도 부모가 private으로 지정한 속성에는 자식도 접근이 불가
	 : 상속관계의 객체일지라도 부모 클래스는 자식의 속성을 마음대로 가져다가 사용할 수 없다.
	 : 자바는 단일상속 개념으로써, 한 클래스에서 여러명의 부모를 상속받을 수 없다.
	  
	  [메서드의 오버라이딩 ]
	  : '메서드의 재정의'의 의미를 가지며, 상속관계의 객체에서
	    자식이 부모의 메서드를 가져오되, 내용을 자식 사정에 맞게 재정의 해서 쓸 수 있도록 한 것. 
	  
	 */
	
	
	
	
	Child c1 = new Child();
	
	//상속관계의 객체에서 자식클래스는 부모가 가진 속성을 마음대로 가져다가 사용할 수 있다.
	
//	System.out.println(c1.money); 
	System.out.println(c1.str);
	
	
	
	if(c1 instanceof Parent) {
		 System.out.println("c1과 Parent의 instance가 같다");
	}
	
	System.out.println("-------------------------");
	
	
	
	Parent p1 = new Parent();
	System.out.println(p1.str);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
