class Bird
{
	int age;
	String name;
	public Bird(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	public Bird()
	{
		int age=12;
		String name="parrot";
		System.out.println("The name and age of bird is : " +name + " and " + age);
	}		
}
class Constructor
{
	public static void main(String args[])
	{
		Bird c=new Bird(10,"crow");
		System.out.println("The name and age of bird is : " +c.name + " and " + c.age);
		Bird d=new Bird();
		
	}
}