package com.sinergia.dcargo.client.shared;


/**
 * @generated
 */
@javax.persistence.Entity
public class Office implements java.io.Serializable {
	/**
	 * @generated
	 */
	private static final long serialVersionUID = -588612495L;
	/**
	 * @generated
	 */
	private Long id;
	/**
	 * @generated
	 */
	private String name;
	/**
	 * @generated
	 */
	private java.util.Set<User> users = new java.util.HashSet<User>();

	/**
	 * @generated
	 */
	public Office() {
	}

	/**
	 * @generated
	 */
	@javax.persistence.Id
	@javax.persistence.GeneratedValue
	public Long getId() {
		return this.id;
	}

	/**
	 * @generated
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @generated
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @generated
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @generated
	 */
	@javax.persistence.OneToMany(mappedBy = "office")
	public java.util.Set<User> getUsers() {
		return this.users;
	}

	/**
	 * @generated
	 */
	public void setUsers(java.util.Set<User> users) {
		this.users = users;
	}

	/**
	 * @generated
	 */
	public void addUsers(User users) {
		getUsers().add(users);
		users.setOffice(this);
	}

	/**
	 * @generated
	 */
	public void removeUsers(User users) {
		getUsers().remove(users);
		users.setOffice(null);
	}

	/**
	 * @generated
	 */
	public String toString() {
		return "Office" + " id=" + id + " name=" + name;
	}
}