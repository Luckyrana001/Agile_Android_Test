package riis.mockitowebapplicationsolution;

import android.net.Uri;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TowerRetrieverTest {
    private static final String SUCCESS_STRING = "success";
    private static final String URL_STRING = "www.get.com";

    @Test
    public void towerRetrievalTest()
    {
        //TODO Use Mockito to initialize the WebService
        TowerRetriever towerRetriever = Mockito.mock(TowerRetriever.class);

        //TODO Use Mockito to declare the return value as SUCCESS_STRING
        Mockito.when(towerRetriever.send("0", "0", "0")).thenReturn(SUCCESS_STRING);
        
        //TODO Test
        Assert.assertEquals(SUCCESS_STRING, towerRetriever.send("0", "0", "0"));
    }

    @Test
    public void towerApiUrTest()
    {
        Consts consts = Mockito.mock(Consts.class);
        Mockito.when(consts.getDefaultUrl()).thenReturn("www.get.com");
        Assert.assertEquals(URL_STRING, consts.getDefaultUrl());

    }

    @Test
    public void towerApiUrlRealDataTest()
    {
        Consts consts = Mockito.mock(Consts.class);
        String url = consts.getDefaultUrl();
        Assert.assertNotEquals(URL_STRING, url);
    }



   /* @Test
    public void towerRetrievalApiCallTest()
    {
        //TODO initialize the WebService
        TowerRetriever towerRetriever = new TowerRetriever();
          // String data = towerRetriever.send("0", "0", "0");
        //TODO Use Mockito to declare the return value as SUCCESS_STRING
       // Mockito.when(towerRetriever.send("0", "0", "0")).thenReturn(SUCCESS_STRING);

        //TODO Test
        Assert.assertNotEquals(SUCCESS_STRING, towerRetriever.send("0", "0", "0"));
    }*/
}