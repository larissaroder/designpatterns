package budget.request;

public class TestWS extends VerifyFormatter{

	public static void main(String[] args) {
		VerifyFormatter verifyFormatter = new VerifyFormatter();
		BankAccount bankAccount = new BankAccount("Larissa", "500.00");
		verifyFormatter.verify(Formatter.XML, bankAccount);
	}
}
