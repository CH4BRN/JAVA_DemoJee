package com.uld5skull.demo.jee.beans;

/**
 * - un couple de getter/setter publics pour chaque champ privé ;
 * - aucun champ public ;
 * - un constructeur public sans paramètres (aucun constructeur tout court en l'occurrence).
 * @author Uld5kull
 *
 */
public class TestBean {

	public String getStringAttribute() {
		return stringAttribute;
	}

	public void setStringAttribute(String stringAttribute) {
		this.stringAttribute = stringAttribute;
	}

	public boolean isBoolAttribute() {
		return boolAttribute;
	}

	public void setBoolAttribute(boolean boolAttribute) {
		this.boolAttribute = boolAttribute;
	}

	public int getIntegerAttribute() {
		return integerAttribute;
	}

	public void setIntegerAttribute(int integerAttribute) {
		this.integerAttribute = integerAttribute;
	}

	private String stringAttribute;
	private boolean boolAttribute;
	private int integerAttribute;

}
