class Emp 
{
	private int age ;
	
	public Emp( int age )
	{
		super();
		this.age = age;
	}
	
	public int hashCode()
	{
		return age;
	}
}
public class test
{
	public static void main(String[] args) 
	{
		Emp emp1 = new Emp(23);
		System.out.println("emp1.hashCode() is :"+emp1.hashCode());


		int originalHashCode = System.identityHashCode(emp1);
		System.out.println("Original hashCode of Emp is :"+originalHashCode);
	}
}