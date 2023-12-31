package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage extends BasePage {
    private final static String pagePath = "/index.php?/dashboard/";

    // Блок описания локаторов для элементов
    private final By headerTitleLabelLocator = By.xpath("//div[contains(@class, 'content-header-title') and contains(text(), 'All Projects')]");
    private final By testLocator = By.linkText("Test Runs");
    private final By addButtonLocator = By.id("sidebar-projects-add");

    public SideMenuPage sideMenuPage;

    // Блок инициализации
    public DashboardPage(WebDriver driver) {
        super(driver);

        sideMenuPage = new SideMenuPage(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLabelLocator;
    }

    @Override
    protected By getTestRunsPage() {
        return null;
    }

    @Override
    protected By getAddTestRunPage() {
        return null;
    }

    @Override
    protected By getDialogTitle() {
        return null;
    }

    @Override
    protected By getEnterPasswordTitle() {
        return null;
    }


    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }

    // Блок атомарных методов
    public WebElement getHeaderTitle() {
        return driver.findElement(headerTitleLabelLocator);
    }
    public WebElement getClickButton() {
        return driver.findElement(testLocator);
    }
    public WebElement getAddProjectButton() {
        return driver.findElement(addButtonLocator);
    }
    // Блок комплексных методов
    public void clickButton() {
        getClickButton().click();
    }
    public void clickAddProjectButton() {
        getAddProjectButton().click();
    }
}