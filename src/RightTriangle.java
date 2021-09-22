
public class RightTriangle {
			static void rTriangle(int num)
			{
				for(int i=1;i<=num;i++)
				{
					for(int j=1;j<=num;j++)
					{
						if(i+j>num)
							System.out.print("*");
						else
							System.out.print(" ");
					}
					System.out.println();
				}
			}
	public static void main(String[] args) {
		
			int num=5;
			rTriangle(num);

	}

}
