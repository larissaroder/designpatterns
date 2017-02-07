package budget.request;

/**
 * Created by Larissa on 06/02/2017.
 */
public class ResponseXML implements Response {

	private Response otherResponse;

	public ResponseXML(Response otherResponse) {
		this.otherResponse = otherResponse;
	}
	@Override
	public void response(Formatter formatter, BankAccount bankAccount) {
		if (Formatter.XML.equals(formatter)) {
			System.out.print(bankAccount.getUser().concat(";").concat(bankAccount.getDeposit()));
		} else {
			otherResponse.response(formatter,bankAccount);
		}
	}

	@Override
	public void nextFormatter(Response next) {
		this.otherResponse = next;
	}
}
