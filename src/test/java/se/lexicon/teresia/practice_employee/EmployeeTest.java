package se.lexicon.teresia.practice_employee;

import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {
	
	@Test
	public void test_check_knowledge_systemdeveloper() {

		SystemDeveloper sysdev = new SystemDeveloper(123, "nisse", 0, 0);
		Assert.assertEquals(sysdev.getCertificates(), 0);
		Assert.assertEquals(sysdev.getLanguages(), 0);
		
		sysdev.addKnowledge(0, 0);
		Assert.assertEquals(sysdev.getCertificates(), 0);
		Assert.assertEquals(sysdev.getLanguages(), 0);

		sysdev.addKnowledge(1, 0);
		Assert.assertEquals(sysdev.getCertificates(), 1);
		Assert.assertEquals(sysdev.getLanguages(), 0);
		
		sysdev.addKnowledge(0, 1);
		Assert.assertEquals(sysdev.getCertificates(), 1);
		Assert.assertEquals(sysdev.getLanguages(), 1);
		
		sysdev.addKnowledge(1, 1);
		Assert.assertEquals(sysdev.getCertificates(), 2);
		Assert.assertEquals(sysdev.getLanguages(), 2);
	}
	@Test
	public void test_add_cert_systemdeveloper() {

		int grundSalary = Employee.baseSalary;
		SystemDeveloper sysdev = new SystemDeveloper(123, "nisse", 0, 0);
		Assert.assertEquals(sysdev.getSalary(), grundSalary);

	}

	@Test
	public void test_calculate_base_salary_for_systemdeveloper() {

		int grundSalary = Employee.baseSalary;
		SystemDeveloper sysdev = new SystemDeveloper(123, "nisse", 0, 0);
		Assert.assertEquals(sysdev.getSalary(), grundSalary);

	}

	@Test
	public void test_calculate_salary_upgrade_for_systemdeveloper() {

		int grundSalary = Employee.baseSalary;
		int one_language_add = SystemDeveloper.extraPerLanguage;
		int one_cert_add = SystemDeveloper.extraPerCertificate;

		SystemDeveloper sysdev = new SystemDeveloper(123, "nisse", 0, 0);
		sysdev.addKnowledge(0, 0);
		Assert.assertEquals(sysdev.getSalary(), grundSalary);
		sysdev.addKnowledge(0, 1);
		Assert.assertEquals(sysdev.getSalary(), grundSalary + 1 * one_language_add);
		sysdev.addKnowledge(1, 0);
		Assert.assertEquals(sysdev.getSalary(), grundSalary + 1 * one_language_add + 1 * one_cert_add);
		sysdev.addKnowledge(1, 1);
		Assert.assertEquals(sysdev.getSalary(), grundSalary + 2 * one_language_add + 2 * one_cert_add);
	}
	
	@Test
	public void test_calculate_salary_for_skilled_systemdeveloper() {

		int grundSalary = Employee.baseSalary;
		int one_language_add = SystemDeveloper.extraPerLanguage;
		int one_cert_add = SystemDeveloper.extraPerCertificate;

		SystemDeveloper sysdev = new SystemDeveloper(123, "nisse", 1, 1);
		Assert.assertEquals(sysdev.getSalary(), grundSalary + 1 * one_language_add + 1 * one_cert_add);
	}

	@Test
	public void test_calculate_base_salary_for_salesperson() {

		int grundSalary = Employee.baseSalary;
		SalesPerson seller = new SalesPerson(1, "nisse", 0, 0);
		Assert.assertEquals(seller.getSalary(), grundSalary);
	}

	@Test
	public void test_calculate_salary_upgrade_for_salesperson() {

		int grundSalary = Employee.baseSalary;
		int one_aquired_add = SalesPerson.extraPerAquiredClient;
		int one_client_add = SalesPerson.extraPerClients;

		SalesPerson seller = new SalesPerson(123, "lisa", 0, 0);
		seller.addClient(0, true);
		Assert.assertEquals(seller.getSalary(), grundSalary);
		seller.addClient(0, false);
		Assert.assertEquals(seller.getSalary(), grundSalary);
		seller.addClient(1, true);
		Assert.assertEquals(seller.getSalary(), grundSalary + 1 * one_aquired_add);
		seller.addClient(1, false);
		Assert.assertEquals(seller.getSalary(), grundSalary + 1 * one_aquired_add + 1 * one_client_add);

	}
	
	@Test
	public void test_calculate_salary_for_skilled_salesperson() {

		int grundSalary = Employee.baseSalary;
		int one_aquired_add = SalesPerson.extraPerAquiredClient;
		int one_client_add = SalesPerson.extraPerClients;

		SalesPerson seller = new SalesPerson(123, "lisa", 0, 0);
		Assert.assertEquals(seller.getSalary(), grundSalary + 1 * one_aquired_add + 1 * one_client_add);
	}
}
