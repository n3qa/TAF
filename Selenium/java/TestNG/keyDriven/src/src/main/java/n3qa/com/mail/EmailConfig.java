package n3qa.com.mail;

import static n3qa.com.constants.FrameworkConstants.REPORT_TITLE;

/**
 * Data for Sending email after execution
 */
public class EmailConfig {

    //Remember to create an app password (App Password) for Gmail before sending
    //If you use Hosting's email, it's normal
    //Enable Override Report and Send mail in config file => src/test/resources/config/config.properties
    //OVERRIDE_REPORTS=yes
    //send_email_to_users=yes

    public static final String SERVER = "mail.n3qa.bg";
    public static final String PORT = "666";

    public static final String FROM = "support@n3qa.bg";
    public static final String PASSWORD = "test123!";

    public static final String[] TO = {"support@n3qa.bg"};
    public static final String SUBJECT = REPORT_TITLE;
}