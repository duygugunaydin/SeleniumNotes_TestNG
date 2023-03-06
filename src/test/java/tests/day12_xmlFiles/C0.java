package tests.day12_xmlFiles;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C0  {

    @Test
    public void ilkUrunTesti(){


        AmazonPage amazonPage= new AmazonPage();
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        amazonPage.ilkUrun.click();

        String actual=amazonPage.ilkUrunIsimElementi.getText();

        String expected="Nutella";

        Assert.assertTrue(actual.contains(expected));



    }


}
