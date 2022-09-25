package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/password.properties")
public interface CredentialsConfig extends Config {
    String login();
    String password();
    String login1();
    String password1();
    String appPackage();
    String appActivity();
    String myAndroidDeviceName();
    String myVersion();
    String appForBrowserstack();
}
