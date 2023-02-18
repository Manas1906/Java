package oops;
/* Definition - poly means many and morph means forms which says an object showing
 *  different behaviour at different stages of its lifecycle.
 *                                 OR
 * A person at the same time can have different characteristics. Like a man at the
 * same time is a father, a husband, an employee. So the same person possesses 
 * different behavior in different situations. This is called polymorphism. 
 *  It is of two types
 */
class Mobile{
	void play() {
		System.out.println("play something");
	}
}
class Video extends Mobile{
	void play() {
		System.out.println("playing some video");
	}
}
class Music extends Mobile{
	void play() {
		System.out.println("playing some music");
	}
}
class Call extends Mobile{
	void play() {
		System.out.println("call someone");
	}
}
class Stimulator{
	static void do_something(Mobile m1)
			{
		m1.play();
			}
}
public class RuntimePolymorhism 
{
public static void main(String[] args) 
{
	Video video=new Video();
	Music music=new Music();
	Call call=new Call();
	
	Stimulator.do_something(video);
	Stimulator.do_something(call);
	Stimulator.do_something(music);
}
}
/*This is the example of runtime polymorphism
1.The method declaration will get binded to its definition at the runtime by the JVM 
based on the object created is called as runtime polymorphism.
2.Since the method declaration will get binded to its definition at the runtime,hence
it is called as late binding.
3.Once the method declaration gets binded to its defintion,it can be rebinded, hence
it is called as dynamic binding.
*/

/*               Advantages of Polymorphism in Java:
1.Increases code reusability by allowing objects of different classes to be treated as. 
objects of a common class.
2.Improves readability and maintainability of code by reducing the amount of code that
 needs to be written and maintained.
3.Supports dynamic binding, enabling the correct method to be called at runtime, based 
on the actual class of the object.
4.Enables objects to be treated as a single type, making it easier to write generic code
 that can handle objects of different types.
 
                 Disadvantages of Polymorphism in Java:
1.Can make it more difficult to understand the behavior of an object, especially if the
 code is complex.
2.May lead to performance issues, as polymorphic behavior may require additional computa-
-tions at runtime.
*/
