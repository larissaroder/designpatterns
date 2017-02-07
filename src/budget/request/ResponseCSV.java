package budget.request;

/**
 * Created by Larissa on 06/02/2017.
 */
public class ResponseCSV implements Response {

	@Override
	public void response(Formatter formatter, BankAccount bankAccount) {
			System.out.print(bankAccount.getUser().concat(",").concat(bankAccount.getDeposit()));
	}

	@Override
	public void nextFormatter(Response next) {	}
}
