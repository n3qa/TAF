package n3qa.com.common;

import n3qa.com.projects.website.crm.pages.Clients.ClientPage;
import n3qa.com.projects.website.crm.pages.Dashboard.DashboardPage;
import n3qa.com.projects.website.crm.pages.Projects.ProjectPage;
import n3qa.com.projects.website.crm.pages.SignIn.SignInPage;
import n3qa.com.keyword.WebUI;
import org.openqa.selenium.By;

public class CommonPage {

    public SignInPage signInPage;
    public DashboardPage dashboardPage;
    public ClientPage clientPage;
    public ProjectPage projectPage;

    public By dropdownAccount = By.xpath("//a[@id='user-dropdown']//span[2]");
    public By buttonSignOut = By.xpath("//a[normalize-space()='Sign Out']");


    public SignInPage signOut() {
        WebUI.clickElement(dropdownAccount);
        WebUI.clickElement(buttonSignOut);
        return new SignInPage();
    }

    public SignInPage getSignInPage() {
        if (signInPage == null) {
            signInPage = new SignInPage();
        }
        return signInPage;
    }

    public DashboardPage getDashboardPage() {
        if (dashboardPage == null) {
            dashboardPage = new DashboardPage();
        }
        return dashboardPage;
    }

    public ClientPage getClientPage() {
        if (clientPage == null) {
            clientPage = new ClientPage();
        }
        return clientPage;
    }

    public ProjectPage getProjectPage() {
        if (projectPage == null) {
            projectPage = new ProjectPage();
        }
        return projectPage;
    }

}
