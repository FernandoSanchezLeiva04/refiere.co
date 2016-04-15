package co.refiere.models;
// Generated Apr 15, 2016 11:32:27 AM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * RefiereCompany generated by hbm2java
 */
public class RefiereCompany implements java.io.Serializable {

	private int id;
	private String name;
	private String address;
	private String email;
	private String phone;
	private Set refiereUserCompaniesForUserId = new HashSet(0);
	private Set refiereUserCompaniesForCompanyId = new HashSet(0);

	public RefiereCompany() {
	}

	public RefiereCompany(int id) {
		this.id = id;
	}

	public RefiereCompany(int id, String name, String address, String email, String phone,
			Set refiereUserCompaniesForUserId, Set refiereUserCompaniesForCompanyId) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.refiereUserCompaniesForUserId = refiereUserCompaniesForUserId;
		this.refiereUserCompaniesForCompanyId = refiereUserCompaniesForCompanyId;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Set getRefiereUserCompaniesForUserId() {
		return this.refiereUserCompaniesForUserId;
	}

	public void setRefiereUserCompaniesForUserId(Set refiereUserCompaniesForUserId) {
		this.refiereUserCompaniesForUserId = refiereUserCompaniesForUserId;
	}

	public Set getRefiereUserCompaniesForCompanyId() {
		return this.refiereUserCompaniesForCompanyId;
	}

	public void setRefiereUserCompaniesForCompanyId(Set refiereUserCompaniesForCompanyId) {
		this.refiereUserCompaniesForCompanyId = refiereUserCompaniesForCompanyId;
	}

}
