package budget.request;

/**
 * Created by Larissa on 06/02/2017.
 */
public class BankAccount {

	public BankAccount(String user, String deposit) {
		this.user = user;
		this.deposit = deposit;
	}

	private String user;
	private String deposit;

	public void setUser(String user) {
		this.user = user;
	}

	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}

	public String getUser() {
		return user;
	}

	public String getDeposit() {
		return deposit;
	}
}
