// class Accept<T>  
// {
// 	private T data;

// 	public Accept(T data) 
// 	{
// 		super();
// 		this.data = data;
// 	}

// 	public T getData() 
// 	{
// 		return data;
// 	}	
// }

// public class Main {
// public static void main(String[] args) {
// 	Accept <Integer> rv = new Accept<Integer>(30);
// 	System.out.println(rv.getData());
// }
// }

 class Bool<T>{

	private T car;

	public Bool( T car){
		this.car=car;
	}

	public T getCar(){
		return car;
	}
	
}

public class Main {

	public static void main(String[] args) {
/*		classname typeparameter referaance variable = new keyword classname typeparameter (arguments) */
		Bool <Character> rv = new Bool<Character>('A');
		System.out.println(rv.getCar());


	}
}