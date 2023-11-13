package org.Sele0023;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Seli003 {


    public static void main(String[] args) {


        EdgeOptions edgeOptions = new EdgeOptions();

        edgeOptions.addArguments(("--remote-allow-origins=*"));
        edgeOptions.addArguments("--start-maximized");

        edgeOptions.addArguments("--incognito");
        EdgeDriver driver=new EdgeDriver(edgeOptions);
        driver.get("https://www.youtube.com/");




    }
}