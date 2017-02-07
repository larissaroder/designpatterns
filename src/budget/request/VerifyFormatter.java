package budget.request;

/**
 * Created by Larissa on 06/02/2017.
 */
public class VerifyFormatter {

	public void verify (Formatter formatter, BankAccount bankAccount) {
		Response r1 = new ResponsePercent( new ResponseXML(new ResponseCSV()));
		r1.response(formatter, bankAccount);

	}
}
