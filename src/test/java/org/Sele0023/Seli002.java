package org.Sele0023;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Seli002 {


    public static void main(String[] args) {

        EdgeOptions  edgeOptions= new EdgeOptions();
        edgeOptions.addArguments(("--remote-allow-origins=*"));
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--window-size=800,600");
        edgeOptions.setHeadless(true);
        EdgeDriver driver = new EdgeDriver(edgeOptions); // Dynamic Dispatch -> Runtime Poly
        driver.get("https://thetestingacademy.com/");
        System.out.println(driver.getTitle());
        //driver.quit();



    }
}
