package oop.assignment;

public class AccountTest {

	// Tests the Customer and Account class
	public static void main(String[] args) {
		Customer customer = new Customer(49, "Vivek Chatrola", "123 Parc Drive, Boston, MA 235490");
		Account1 custAcc = new Account1(724690, "Saving", customer, 15000);
		custAcc.dispAccountDetails();
	}

}
