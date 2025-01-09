package Dec31;

public class MainThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		class Test{
		private int i, j,s;

		public Test(){

		}
		public Test(int i, int j) {
		this.i=i;
		this.j=j;
		System.out.println("this="+this);
		//this refers present object
		}
		public void add()
		{
		s=i+j;
		System.out.println("Sum="+s);
}
}		
		Test tobj = new Test(6,7);
		tobj.add();
		System.out.println(tobj);

		}
}
