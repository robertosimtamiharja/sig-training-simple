package eu.sig.training.ch03;

import org.junit.Assert;
import org.junit.Test;

import java.awt.*;
import java.util.List;

public class FlagFactoryTest {

    @Test
    public void getFlagColorsTest01(){

        FlagFactory ff = new FlagFactory();
        List<Color> res = ff.getFlagColors(Nationality.BELGIAN);
        Assert.assertNotNull(res);
        Assert.assertEquals(res.size(),3);
        Assert.assertEquals(res.get(0),Color.black);
        Assert.assertEquals(res.get(1),Color.yellow);
        Assert.assertEquals(res.get(2),Color.red);

    }

    @Test
    public void getFlagColorsTest02(){

        FlagFactory ff = new FlagFactory();
        List<Color> res = ff.getFlagColors(Nationality.DUTCH);
        Assert.assertNotNull(res);
        Assert.assertEquals(res.size(),3);
        Assert.assertEquals(res.get(0),Color.red);
        Assert.assertEquals(res.get(1),Color.white);
        Assert.assertEquals(res.get(2),Color.blue);

    }

    @Test
    public void getFlagColorsTest03(){

        FlagFactory ff = new FlagFactory();
        List<Color> res = ff.getFlagColors(Nationality.GERMAN);
        Assert.assertNotNull(res);
        Assert.assertEquals(res.size(),3);
        Assert.assertEquals(res.get(0),Color.black);
        Assert.assertEquals(res.get(1),Color.red);
        Assert.assertEquals(res.get(2),Color.yellow);

    }

    @Test
    public void getFlagColorsTest04(){

        FlagFactory ff = new FlagFactory();
        List<Color> res = ff.getFlagColors(Nationality.FRENCH);
        Assert.assertNotNull(res);
        Assert.assertEquals(res.size(),3);
        Assert.assertEquals(res.get(0),Color.blue);
        Assert.assertEquals(res.get(1),Color.white);
        Assert.assertEquals(res.get(2),Color.red);

    }

    @Test
    public void getFlagColorsTest05(){

        FlagFactory ff = new FlagFactory();
        List<Color> res = ff.getFlagColors(Nationality.ITALIAN);
        Assert.assertNotNull(res);
        Assert.assertEquals(res.size(),3);
        Assert.assertEquals(res.get(0),Color.green);
        Assert.assertEquals(res.get(1),Color.white);
        Assert.assertEquals(res.get(2),Color.red);

    }

    @Test
    public void getFlagColorsTest06(){

        FlagFactory ff = new FlagFactory();
        List<Color> res = ff.getFlagColors(Nationality.ROMANIA);
        Assert.assertNotNull(res);
        Assert.assertEquals(res.size(),3);
        Assert.assertEquals(res.get(0),Color.blue);
        Assert.assertEquals(res.get(1),Color.yellow);
        Assert.assertEquals(res.get(2),Color.red);

    }

    @Test
    public void getFlagColorsTest07(){

        FlagFactory ff = new FlagFactory();
        List<Color> res = ff.getFlagColors(Nationality.IRELAND);
        Assert.assertNotNull(res);
        Assert.assertEquals(res.size(),3);
        Assert.assertEquals(res.get(0),Color.green);
        Assert.assertEquals(res.get(1),Color.white);
        Assert.assertEquals(res.get(2),Color.orange);

    }

    @Test
    public void getFlagColorsTest08(){

        FlagFactory ff = new FlagFactory();
        List<Color> res = ff.getFlagColors(Nationality.HUNGARIAN);
        Assert.assertNotNull(res);
        Assert.assertEquals(res.size(),3);
        Assert.assertEquals(res.get(0),Color.red);
        Assert.assertEquals(res.get(1),Color.white);
        Assert.assertEquals(res.get(2),Color.green);

    }

    @Test
    public void getFlagColorsTest09(){

        FlagFactory ff = new FlagFactory();
        List<Color> res = ff.getFlagColors(Nationality.BULGARIAN);
        Assert.assertNotNull(res);
        Assert.assertEquals(res.size(),3);
        Assert.assertEquals(res.get(0),Color.white);
        Assert.assertEquals(res.get(1),Color.green);
        Assert.assertEquals(res.get(2),Color.red);

    }

    @Test
    public void getFlagColorsTest10(){

        FlagFactory ff = new FlagFactory();
        List<Color> res = ff.getFlagColors(Nationality.RUSSIA);
        Assert.assertNotNull(res);
        Assert.assertEquals(res.size(),3);
        Assert.assertEquals(res.get(0),Color.white);
        Assert.assertEquals(res.get(1),Color.blue);
        Assert.assertEquals(res.get(2),Color.red);

    }

    @Test
    public void getFlagColorsTest11(){

        FlagFactory ff = new FlagFactory();
        List<Color> res = ff.getFlagColors(Nationality.UNCLASSIFIED);
        Assert.assertNotNull(res);
        Assert.assertEquals(res.size(),1);
        Assert.assertEquals(res.get(0),Color.GRAY);

    }
}
