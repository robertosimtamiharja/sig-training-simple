package eu.sig.training.ch04;
import eu.sig.training.ch04.ValidateAccount;

// tag::SavingsAccount[]
public class SavingsAccount {
	private ValidateAccount validateAccount;

    public Transfer makeTransfer(String counterAccount, Money amount) 
        throws BusinessException {
        return this.validateAccount.validateAccountNumber(counterAccount, amount);
    }

    public void addInterest() {
        this.validateAccount.validateInterest();
    }
}
// end::SavingsAccount[]
