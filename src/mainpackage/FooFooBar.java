package mainpackage;

public class FooFooBar extends FooBar {
	private String baz;
	
	public FooFooBar() {}
	
	public FooFooBar(String foo, String bar, String baz) {
		super(foo, bar);
		this.baz = baz;
	}
}
