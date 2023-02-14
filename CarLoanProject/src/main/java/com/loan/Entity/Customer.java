package com.loan.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Customer 
{
	@Id
	private Integer customerId;
	private String customerName;
	private String customerDateOfBirth;
	private Integer customerAge;
	private String customerGender;
	private String customerEmail;
	private Long customerMobileNumber;
	private Long customerAdditionalMobileNumber;
	private Double customerTotalLoanRequired;
	
	@OneToOne(cascade = CascadeType.ALL)
	private EducationalInformation educationalInfo;
	
	@OneToOne(cascade = CascadeType.ALL)
	private AllPersonalDocuments allpersonalDoc;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerAddress customerAddress;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Profession profession;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Cibil cibilscore;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CurrentLoanDetails currentloandetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private AccountDetails accountdetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private GuarantorDetails gurantordetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private LoanDisbursement loandisbursement;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Ledger ledger;
	
	@OneToOne(cascade = CascadeType.ALL)
	private  SanctionLetter sanctionletter;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerVerification customerverification;

}
