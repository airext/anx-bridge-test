package com.github.airext.bridge.test.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.adobe.fre.FREWrongThreadException;
import com.github.airext.bridge.Bridge;
import com.github.airext.bridge.Call;
import com.github.airext.bridge.test.BridgeTest;
import com.github.airext.bridge.test.data.BridgeTestResultValue;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by mobitile on 12/11/15.
 */
public class TestResultFunction implements FREFunction
{
    @Override
    public FREObject call(FREContext context, FREObject[] freObjects)
    {
        final Call call = Bridge.call(context);

        new Timer().schedule(new TimerTask()
        {
            @Override
            public void run()
            {
//                BridgeTestResultValue value = new BridgeTestResultValue("{\"status\":200, \"message\":\"Data sent successfully\"}");

                call.result("{\"status\":200, \"message\":\"Data sent successfully\"}");
            }
        }, 2000);

        try
        {
            return call.toFREObject();
        }
        catch (FREWrongThreadException e)
        {
            e.printStackTrace();

            return null;
        }
    }
}
