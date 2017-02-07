package budget.request;

/**
 * Created by Larissa on 06/02/2017.
 */
public class ResponsePercent implements Response {

	private Response otherResponse;

	public ResponsePercent(Response otherResponse) {
		this.otherResponse = otherResponse;
	}

	@Override
	public void response(Formatter formatter, BankAccount bankAccount) {
		if (Formatter.PERCENT.equals(formatter)) {
			System.out.print(bankAccount.getUser().concat("%").concat(bankAccount.getDeposit()));
		} else {
			otherResponse.response(formatter,bankAccount);
		}
	}

	@Override
	public void nextFormatter(Response next) {
		this.otherResponse = next;
	}
}
