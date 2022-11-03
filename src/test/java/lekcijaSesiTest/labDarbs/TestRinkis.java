package lekcijaSesiTest.labDarbs;


import lekcijaCetri.labDarbs.Rinkis;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRinkis {

    @Test
    public void testRekinatLaukumuDecimals(){
        calculateAreaAndAssert(4.5,63.585);
    }

    @Test
    public void testRekinatLaukumuVesels(){
        calculateAreaAndAssert(4.0,50.24);
    }

    @Test
    public void testRekinatLaukumuNulle(){
        calculateAreaAndAssert(0.0,0.0);
    }

    private void calculateAreaAndAssert(Double radiuss, Double sagaidamaisLaukums){
        System.out.println("Tests kurš testē kā rēķinās riņķa laukums");
        Rinkis mansRinkis = new Rinkis(radiuss);
        Assert.assertEquals(mansRinkis.rekinatLaukumu(),sagaidamaisLaukums);
    }


}
