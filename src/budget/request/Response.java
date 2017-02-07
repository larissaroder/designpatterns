package budget.request;

/**
 * Created by Larissa on 06/02/2017.
 */
public interface Response {

	void response (Formatter formatter, BankAccount bankAccount);
	void nextFormatter(Response next);
}
