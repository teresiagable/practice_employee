package se.lexicon.teresia.practice_employee;

public class SalesPerson extends Employee {
	private int clients;
	private int aquiredClients;

	public static final int extraPerClients = 500;
	public static final int extraPerAquiredClient = 1000;

	/**
	 * @param id
	 * @param name
	 * @param clients
	 * @param aquiredClients = self aquired clients (not included in clients)
	 */
	public SalesPerson(int id, String name, int clients, int aquiredClients) {
		super(id, name);
		this.clients = clients;
		this.aquiredClients = aquiredClients;
		this.calculateSalary();

	}

	public int getClients() {
		return clients;
	}

	public void setClients(int clients) {
		this.clients = clients;
	}

	/**
	 * @param num_of_clients  = number of new clients
	 * @param aquired (by the seller him/her-self) = true or false
	 */
	public void addClient(int num_of_clients, boolean aquired) {
		if (aquired)
			this.aquiredClients += num_of_clients;
		else
			this.clients += num_of_clients;
		System.out.println(clients + " " + (aquired ? "self aquired" : "old") + " client(s) added");
		this.calculateSalary(); // this will update the employees salary
	}

	public int getAquiredClients() {
		return aquiredClients;
	}

	public void setAquiredClients(int aquiredClients) {
		this.aquiredClients = aquiredClients;
	}

	@Override
	public void calculateSalary() {
		
		setSalary(Employee.baseSalary + clients * extraPerClients + aquiredClients * extraPerAquiredClient);
		System.out.println("Salary updated");
	}

	@Override
	public String toString() {
		return "Sales person Name = " + getName() + ", Id = " + getId() + ", Salary = " + getSalary() + ", Clients = "
				+ getClients() + ", AquiredClients = " + getAquiredClients();
	}

}
