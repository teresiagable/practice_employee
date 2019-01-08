package se.lexicon.teresia.practice_employee;

public class SystemDeveloper extends Employee{
	private int certificates;
	private int languages;	
	
	public static final int extraPerCertificate = 1000;
	public static final int extraPerLanguage = 1500;

	
	/**
	 * @param id
	 * @param name
	 * @param certificates
	 * @param languages
	 */
	public SystemDeveloper(int id, String name, int certificates, int languages) {
		super(id, name);
		this.certificates = certificates;
		this.languages = languages;
	}

	public int getCertificates() {
		return certificates;
	}

	public void setCertificates(int certificates) {
		this.certificates = certificates;
	}

	public int getLanguages() {
		return languages;
	}

	public void setLanguages(int languages) {
		this.languages = languages;
	}

	public void addKnowledge(int newCertificates, int newLanguages)
	{
		this.certificates +=newCertificates;
		this.languages += newLanguages;
		this.calculateSalary();
		
	}
	@Override
	public void calculateSalary() {
		
		setSalary(Employee.baseSalary + certificates * extraPerCertificate + languages * extraPerLanguage);
		System.out.println("Salary updatedqweqreqr");
	}

	@Override
	public String toString() {
		return "System developer: Name=" + getName() + ", Id = " + getId() + ", Salary = " + getSalary()
				+ ", Languages = " + getLanguages() + ", Certificates = " + getCertificates();
	}


}
