package org.example.interview.lambdafunction;

// класс, в котором определены методы
class ExpressionHelper{

  static boolean isEven(int n){

	return n % 2 == 0;
  }

  static boolean isPositive(int n){

	return n > 0;
  }
}
public class LambdaApp3 {

  public static void main(String[] args) {

	int[] nums = { -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
	System.out.println(sum(nums, ExpressionHelper::isEven));

	Expression expr = ExpressionHelper::isPositive;
	System.out.println(sum(nums, expr));

	UserBuilder userBuilder = User::new;
	User user = userBuilder.create("John");
	System.out.println(user.getName());
  }

  private static int sum (int[] numbers, Expression func)
  {
	int result = 0;
	for(int i : numbers) {
	  if (func.isEqual(i))
		result += i;
	}
	return result;
  }

  interface Expression{
	boolean isEqual(int n);
  }

  interface UserBuilder{
	User create(String name);
  }

  static class User {

	private String name;
	String getName(){
	  return name;
	}

	User(String n){
	  this.name=n;
	}
  }
}
