public class AdministratorTest {
	public static void main(String[] args)
	{
		Administrator admin = new Administrator("Leader", "Cleaning", "Jason");
		
		admin.dataEntry();
		
		System.out.println("Administrator: ");
		System.out.println(admin);
		
	}
}

