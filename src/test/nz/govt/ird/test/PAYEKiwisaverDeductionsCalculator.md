# IRD PAYE Kiwisaver Deductions Calculator

I am an employee who wants to calculate my PAYE for the current tax year. 
When I enter my personal details, they will appear on my PAYE summary. 

## [Example: Calculate Employee PAYE](- "testEmployeePAYE")

Given
: I am an employee who wants to [calculate my PAYE](- "enterUserAndTaxDetails()") for the current tax year

When
: my name [Test User](- "#name"), reference number [TEST1234](- "#reference"), sex [M](- "#sex"), 
payment frequency [Weekly](- "#frequency") and pay amount [1024.00](- "#pay") [Net](- "#netOrGross") 
are [entered](- "enterPayDetails(#name, #reference, #sex, #frequency, #pay, #netOrGross)") 

Then
: I can see a PAYE summary with the following details:

* [Test User](- "?=getName()")
* [TEST1234](- "?=getReferenceNumber()")
* [M](- "?=getTaxCode()")
* [Weekly](- "?=getPayFrequency()")
* [$1,024.00 net](- "?=getPayAmount()")
