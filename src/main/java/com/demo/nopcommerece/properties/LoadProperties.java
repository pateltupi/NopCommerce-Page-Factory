package com.demo.nopcommerece.properties;
/*
 * Created By Trupti Patel on 2019-05-14
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProperties {
    static Properties prop;

    static FileInputStream input;


    public String getProperty(String key) {

        prop = new Properties();

        try {
            input = new FileInputStream(System.getProperty("user.dir")+"/src/test/java/com/demo/nopcommerece/resources/configfile/config.properties");
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}


