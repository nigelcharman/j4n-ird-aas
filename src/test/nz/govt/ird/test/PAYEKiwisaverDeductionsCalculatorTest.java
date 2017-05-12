package nz.govt.ird.test;

import nz.co.bnz.webdriver.WebDriverFixture;
import nz.govt.ird.payekiwisaverdeductionscalculator.EmployeeDetailsPage;
import nz.govt.ird.payekiwisaverdeductionscalculator.SummaryPage;
import nz.govt.ird.payekiwisaverdeductionscalculator.UserAndTaxYearPage;
import org.concordion.api.extension.Extensions;
import org.concordion.api.option.ConcordionOptions;
import org.concordion.api.option.MarkdownExtensions;
import org.concordion.ext.inputstyle.InputStyleExtension;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(ConcordionRunner.class)
@ConcordionOptions(markdownExtensions={MarkdownExtensions.DEFINITIONS})
@Extensions(InputStyleExtension.class)
public class PAYEKiwisaverDeductionsCalculatorTest extends WebDriverFixture {

    private static final Logger LOG = LoggerFactory.getLogger(PAYEKiwisaverDeductionsCalculatorTest.class);

    public void enterUserAndTaxDetails() {
        UserAndTaxYearPage userTaxYearPage = UserAndTaxYearPage.fetch(getWebDriver());
        userTaxYearPage.enterUserAndTaxDetails("Employee", "1 April 2017 to 31 March 2018");
    }

    public void enterPayDetails(String name, String reference, String taxCode, String payFrequency, String perPay, String netOrGross) {
        EmployeeDetailsPage employeeDetailsPage = EmployeeDetailsPage.fetch(getWebDriver());
        employeeDetailsPage.enterPayDetails(name, reference, taxCode, payFrequency, perPay, netOrGross);
    }

    public String getName() {
        return SummaryPage.fetch(getWebDriver()).getName();
    }

    public String getReferenceNumber() {
        return SummaryPage.fetch(getWebDriver()).getReferenceNumber();
    }

    public String getTaxCode() {
        return SummaryPage.fetch(getWebDriver()).getTaxCode();
    }

    public String getPayFrequency() {
        return SummaryPage.fetch(getWebDriver()).getPayFrequency();
    }

    public String getPayAmount() {
        return SummaryPage.fetch(getWebDriver()).getPayAmount();
    }
}
