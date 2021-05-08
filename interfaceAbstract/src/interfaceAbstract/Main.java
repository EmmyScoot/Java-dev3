package interfaceAbstract;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager neroCustomerManager = new NeroCustomerManager();
		Customer customer = new Customer(1, "Engin", "Demiroð", LocalDate.of(2000, 2, 3), "3333333333");
		neroCustomerManager.save(customer);

		Customer customer1 = new Customer(1, "Emmy", "Scoot", LocalDate.of(2020, 1, 1), "11111111111");
		BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		starbucksCustomerManager.save(customer1);
	}

}
