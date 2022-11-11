package com.fabrick.demo.dto.movimenti;

import java.math.BigDecimal;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Movimento {

	@JsonProperty(value = "transactionId")
	private String  transactionId;
	
	@JsonProperty(value = "operationId")
	private String  operationId;
	
	@JsonProperty(value = "accountingDate")
	private String  accountingDate;
	
	@JsonProperty(value = "valueDate")
	private String  valueDate;
	
	@JsonProperty(value = "type")
	private MovimentoType  type;
	
	@JsonProperty(value = "amount")
	private BigDecimal  amount;
	
	@JsonProperty(value = "currency")
	private String  currency;
	
	@JsonProperty(value = "description")
	private String  description;

	
    @Override
    public String toString() {
        return "MovimentoResponse{" +
                "transactionId='" + transactionId + '\'' +
                ", operationId='" + operationId + '\'' +
                ", accountingDate='" + accountingDate + '\'' +
                ", valueDate='" + valueDate + '\'' +
                ", type='" + type + '\'' +
                ", amount='" + amount + '\'' +
                ", currency='" + currency + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

	@Override
	public int hashCode() {
		return Objects.hash(accountingDate, amount, currency, description, operationId, transactionId, type, valueDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movimento other = (Movimento) obj;
		return Objects.equals(accountingDate, other.accountingDate) && amount == other.amount
				&& Objects.equals(currency, other.currency) && Objects.equals(description, other.description)
				&& Objects.equals(operationId, other.operationId) && Objects.equals(transactionId, other.transactionId)
				&& Objects.equals(type, other.type) && Objects.equals(valueDate, other.valueDate);
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getOperationId() {
		return operationId;
	}

	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}

	public String getAccountingDate() {
		return accountingDate;
	}

	public void setAccountingDate(String accountingDate) {
		this.accountingDate = accountingDate;
	}

	public String getValueDate() {
		return valueDate;
	}

	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}

	public MovimentoType getType() {
		return type;
	}

	public void setType(MovimentoType type) {
		this.type = type;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
