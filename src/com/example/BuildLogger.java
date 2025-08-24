package com.example;

import java.io.InputStream;
import java.util.Properties;

public class BuildLogger {
    static {
        try (InputStream input = BuildLogger.class.getResourceAsStream("/build.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            String buildDate = prop.getProperty("build.date", "unknown");
            String version = prop.getProperty("version", "unknown");
            String tag = prop.getProperty("git.tag", "unknown");

            System.out.println("************************************************************");
            System.out.println("*                                                          *");
            System.out.println("*                Version    : " + version);
            System.out.println("*                Build Date : " + buildDate);
            System.out.println("*                Tag        : " + tag);
            System.out.println("*                                                          *");
            System.out.println("************************************************************");

        } catch (Exception e) {
            System.err.println("************************************************************");
            System.err.println("*          Could not load build.properties file.          *");
            System.err.println("************************************************************");
            e.printStackTrace();
        }
    }
}
