/**
 * This class is generated by jOOQ
 */
package cn.emac.demo.petstore.domain.tables.pojos;


import javax.annotation.Generated;
import java.io.Serializable;
import java.math.BigDecimal;


/**
 * Itens
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Item implements Serializable {

	private static final long serialVersionUID = -75717158;

	private String     itemid;
	private String     productid;
	private BigDecimal listprice;
	private BigDecimal unitcost;
	private Integer    supplier;
	private String     status;
	private String     attr1;
	private String     attr2;
	private String     attr3;
	private String     attr4;
	private String     attr5;

	public Item() {}

	public Item(Item value) {
		this.itemid = value.itemid;
		this.productid = value.productid;
		this.listprice = value.listprice;
		this.unitcost = value.unitcost;
		this.supplier = value.supplier;
		this.status = value.status;
		this.attr1 = value.attr1;
		this.attr2 = value.attr2;
		this.attr3 = value.attr3;
		this.attr4 = value.attr4;
		this.attr5 = value.attr5;
	}

	public Item(
		String     itemid,
		String     productid,
		BigDecimal listprice,
		BigDecimal unitcost,
		Integer    supplier,
		String     status,
		String     attr1,
		String     attr2,
		String     attr3,
		String     attr4,
		String     attr5
	) {
		this.itemid = itemid;
		this.productid = productid;
		this.listprice = listprice;
		this.unitcost = unitcost;
		this.supplier = supplier;
		this.status = status;
		this.attr1 = attr1;
		this.attr2 = attr2;
		this.attr3 = attr3;
		this.attr4 = attr4;
		this.attr5 = attr5;
	}

	public String getItemid() {
		return this.itemid;
	}

	public Item setItemid(String itemid) {
		this.itemid = itemid;
		return this;
	}

	public String getProductid() {
		return this.productid;
	}

	public Item setProductid(String productid) {
		this.productid = productid;
		return this;
	}

	public BigDecimal getListprice() {
		return this.listprice;
	}

	public Item setListprice(BigDecimal listprice) {
		this.listprice = listprice;
		return this;
	}

	public BigDecimal getUnitcost() {
		return this.unitcost;
	}

	public Item setUnitcost(BigDecimal unitcost) {
		this.unitcost = unitcost;
		return this;
	}

	public Integer getSupplier() {
		return this.supplier;
	}

	public Item setSupplier(Integer supplier) {
		this.supplier = supplier;
		return this;
	}

	public String getStatus() {
		return this.status;
	}

	public Item setStatus(String status) {
		this.status = status;
		return this;
	}

	public String getAttr1() {
		return this.attr1;
	}

	public Item setAttr1(String attr1) {
		this.attr1 = attr1;
		return this;
	}

	public String getAttr2() {
		return this.attr2;
	}

	public Item setAttr2(String attr2) {
		this.attr2 = attr2;
		return this;
	}

	public String getAttr3() {
		return this.attr3;
	}

	public Item setAttr3(String attr3) {
		this.attr3 = attr3;
		return this;
	}

	public String getAttr4() {
		return this.attr4;
	}

	public Item setAttr4(String attr4) {
		this.attr4 = attr4;
		return this;
	}

	public String getAttr5() {
		return this.attr5;
	}

	public Item setAttr5(String attr5) {
		this.attr5 = attr5;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Item (");

		sb.append(itemid);
		sb.append(", ").append(productid);
		sb.append(", ").append(listprice);
		sb.append(", ").append(unitcost);
		sb.append(", ").append(supplier);
		sb.append(", ").append(status);
		sb.append(", ").append(attr1);
		sb.append(", ").append(attr2);
		sb.append(", ").append(attr3);
		sb.append(", ").append(attr4);
		sb.append(", ").append(attr5);

		sb.append(")");
		return sb.toString();
	}
}