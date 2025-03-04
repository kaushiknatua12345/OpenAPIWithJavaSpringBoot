package com.OpenAPIDocs.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Accounts extends BaseEntity {

	@Column(name = "customer_id")
	private Long customerId;

	@Column(name="account_number")
	@Id
	private long accountNumber;

	@Column(name="account_type")
	private String accountType;

	@Column(name = "branch_address")
	private String branchAddress;

	
      // getters and setters
	public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }

    public Long getCustomerId() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setCustomerId(long customerId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

	
}
