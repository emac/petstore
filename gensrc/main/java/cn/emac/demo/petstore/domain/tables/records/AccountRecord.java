/**
 * This class is generated by jOOQ
 */
package cn.emac.demo.petstore.domain.tables.records;


import cn.emac.demo.petstore.domain.tables.Account;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;


/**
 * Cadastro de Contas
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AccountRecord extends UpdatableRecordImpl<AccountRecord> implements Record12<String, String, String, String, String, String, String, String, String, String, String, String> {

	private static final long serialVersionUID = 1842877714;

	/**
	 * Setter for <code>jpetstore.account.userid</code>.
	 */
	public AccountRecord setUserid(String value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>jpetstore.account.userid</code>.
	 */
	public String getUserid() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>jpetstore.account.email</code>.
	 */
	public AccountRecord setEmail(String value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>jpetstore.account.email</code>.
	 */
	public String getEmail() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>jpetstore.account.firstname</code>.
	 */
	public AccountRecord setFirstname(String value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>jpetstore.account.firstname</code>.
	 */
	public String getFirstname() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>jpetstore.account.lastname</code>.
	 */
	public AccountRecord setLastname(String value) {
		setValue(3, value);
		return this;
	}

	/**
	 * Getter for <code>jpetstore.account.lastname</code>.
	 */
	public String getLastname() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>jpetstore.account.status</code>.
	 */
	public AccountRecord setStatus(String value) {
		setValue(4, value);
		return this;
	}

	/**
	 * Getter for <code>jpetstore.account.status</code>.
	 */
	public String getStatus() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>jpetstore.account.addr1</code>.
	 */
	public AccountRecord setAddr1(String value) {
		setValue(5, value);
		return this;
	}

	/**
	 * Getter for <code>jpetstore.account.addr1</code>.
	 */
	public String getAddr1() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>jpetstore.account.addr2</code>.
	 */
	public AccountRecord setAddr2(String value) {
		setValue(6, value);
		return this;
	}

	/**
	 * Getter for <code>jpetstore.account.addr2</code>.
	 */
	public String getAddr2() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>jpetstore.account.city</code>.
	 */
	public AccountRecord setCity(String value) {
		setValue(7, value);
		return this;
	}

	/**
	 * Getter for <code>jpetstore.account.city</code>.
	 */
	public String getCity() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>jpetstore.account.state</code>.
	 */
	public AccountRecord setState(String value) {
		setValue(8, value);
		return this;
	}

	/**
	 * Getter for <code>jpetstore.account.state</code>.
	 */
	public String getState() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>jpetstore.account.zip</code>.
	 */
	public AccountRecord setZip(String value) {
		setValue(9, value);
		return this;
	}

	/**
	 * Getter for <code>jpetstore.account.zip</code>.
	 */
	public String getZip() {
		return (String) getValue(9);
	}

	/**
	 * Setter for <code>jpetstore.account.country</code>.
	 */
	public AccountRecord setCountry(String value) {
		setValue(10, value);
		return this;
	}

	/**
	 * Getter for <code>jpetstore.account.country</code>.
	 */
	public String getCountry() {
		return (String) getValue(10);
	}

	/**
	 * Setter for <code>jpetstore.account.phone</code>.
	 */
	public AccountRecord setPhone(String value) {
		setValue(11, value);
		return this;
	}

	/**
	 * Getter for <code>jpetstore.account.phone</code>.
	 */
	public String getPhone() {
		return (String) getValue(11);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<String> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record12 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row12<String, String, String, String, String, String, String, String, String, String, String, String> fieldsRow() {
		return (Row12) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row12<String, String, String, String, String, String, String, String, String, String, String, String> valuesRow() {
		return (Row12) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return Account.ACCOUNT.USERID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Account.ACCOUNT.EMAIL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Account.ACCOUNT.FIRSTNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return Account.ACCOUNT.LASTNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return Account.ACCOUNT.STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return Account.ACCOUNT.ADDR1;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return Account.ACCOUNT.ADDR2;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return Account.ACCOUNT.CITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return Account.ACCOUNT.STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field10() {
		return Account.ACCOUNT.ZIP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field11() {
		return Account.ACCOUNT.COUNTRY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field12() {
		return Account.ACCOUNT.PHONE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getUserid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getEmail();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getFirstname();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getLastname();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getAddr1();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getAddr2();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getCity();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value9() {
		return getState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value10() {
		return getZip();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value11() {
		return getCountry();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value12() {
		return getPhone();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AccountRecord value1(String value) {
		setUserid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AccountRecord value2(String value) {
		setEmail(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AccountRecord value3(String value) {
		setFirstname(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AccountRecord value4(String value) {
		setLastname(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AccountRecord value5(String value) {
		setStatus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AccountRecord value6(String value) {
		setAddr1(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AccountRecord value7(String value) {
		setAddr2(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AccountRecord value8(String value) {
		setCity(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AccountRecord value9(String value) {
		setState(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AccountRecord value10(String value) {
		setZip(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AccountRecord value11(String value) {
		setCountry(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AccountRecord value12(String value) {
		setPhone(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AccountRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		value11(value11);
		value12(value12);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AccountRecord
	 */
	public AccountRecord() {
		super(Account.ACCOUNT);
	}

	/**
	 * Create a detached, initialised AccountRecord
	 */
	public AccountRecord(String userid, String email, String firstname, String lastname, String status, String addr1, String addr2, String city, String state, String zip, String country, String phone) {
		super(Account.ACCOUNT);

		setValue(0, userid);
		setValue(1, email);
		setValue(2, firstname);
		setValue(3, lastname);
		setValue(4, status);
		setValue(5, addr1);
		setValue(6, addr2);
		setValue(7, city);
		setValue(8, state);
		setValue(9, zip);
		setValue(10, country);
		setValue(11, phone);
	}
}