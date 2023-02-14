package com.loan.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Ledger 
{
	@Id
	private Integer ledgerId;
	private Integer ledgerCreatedDate;
	private Integer ledgerCreatedMonth;
	private Integer ledgerCreatedYear;
	private Double totalLoanAmount;
	private Double payableAmountwithInterest;
	private Integer tenure;
	private Double monthlyEmi;
	private Integer totalEmiCount;
	private Integer defaulterCount;
	private String currentMonthEmiStatus;
	private String loanEndDate;
	private String loanStatus;
}
