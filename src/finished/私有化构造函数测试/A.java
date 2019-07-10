package finished.私有化构造函数测试;

class A{

	private A(){}

	public String name;
	
	private static A a=new A();

	public static A creatInstance() {

		return a;
	}
	public static A creatInstance_1() {
		
		return new A();
	}
}
