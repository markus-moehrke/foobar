package mainpackage;

public class FooBar implements IFoo {
	
	private String bla;
	private String blubb;
	
	public FooBar() {
		System.out.println("FooBar: Thank you for instantiate me");
	} 
	
	public FooBar(String bla, String blubb) {
		System.out.println("FooBar: Thank you for instantiate me explicitly");
		this.bla = bla;
		this.blubb = blubb;
	}

	@Override
	public void doNothing() {}

	@Override
	public String toString() {
		return "I'm a stupid little instance of FooBar [bla=" + bla + ", blubb=" + blubb + "]";
	}
}
