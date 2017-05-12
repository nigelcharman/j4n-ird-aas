# IRD PAYE Kiwisaver Deductions Calculator

## [Example: Calculate Employee PAYE](- "testEmployeePAYE")


Given
: I am an employee who wants to [calculate my PAYE](- "enterUserAndTaxDetails()") for the current tax year


When
: I [enter my personal details and pay](- "enterPayDetails()") information

Then
: I can see a PAYE summary with the following details:

* [Name](- "c:assertTrue=hasName()")
* [Reference Number](- "c:assertTrue=hasReferenceNumber()")
* [Tax Code](- "c:assertTrue=hasTaxCode()")
* [Payment Frequency](- "c:assertTrue=hasPayFrequency()")
* [Pay Amount](- "c:assertTrue=hasPayAmount()")
