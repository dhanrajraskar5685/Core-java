 class Logic {
	public int x = 100;
	public int y = 200;
	public void add ()
	{
	
System.out.println( " entry into the add method");
	Logic l = new Logic ();
	System.out.println(l.x);
	System.out.println(l.y);
	}
	public static void main( String[] args)
	{
		Logic k = new Logic();
		k.add();
}
}