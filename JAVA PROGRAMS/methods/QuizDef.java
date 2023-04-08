package methods;

interface WithDefinitionsInter {
	default void definedMeth() {
		System.out.println("inside interface");
	}
}
class WithDefinitionsImpl implements WithDefinitionsInter {
	public void definedMeth() {
		
		System.out.println("inside class");
	}
}
public class QuizDef {
	public static void main(String par[]) {
		WithDefinitionsInter withDef = new WithDefinitionsImpl();
		withDef.definedMeth();
	}
}