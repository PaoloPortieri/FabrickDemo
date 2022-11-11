package com.fabrick.demo.dto.movimenti;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MovimentoType {
	
	@JsonProperty(value = "enumeration")
	private String enumeration;
	
	@JsonProperty(value = "value")
	private String value;
	
	@Override
	public String toString() {
		return "MovimentoTypeResponse{" +
				"enumeration='" + enumeration + '\'' +
				", value='" + value + '\'' +
				'}';
	}

	@Override
	public int hashCode() {
		return Objects.hash(enumeration, value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovimentoType other = (MovimentoType) obj;
		return Objects.equals(enumeration, other.enumeration) && Objects.equals(value, other.value);
	}

	public String getEnumeration() {
		return enumeration;
	}

	public void setEnumeration(String enumeration) {
		this.enumeration = enumeration;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
