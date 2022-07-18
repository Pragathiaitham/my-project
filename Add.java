//Constructor Overloading
class Add {
	Add(int x)
	{
		 System.out.println(x+x);	
      }	
      Add(float x)
	{
		System.out.println(x+x);
	}
      public static void main(String args[])
	{
		Add a=new Add(10);
        Add b=new Add(10.2f);
      }
}
	