package com.github.airext.bridge.test.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.adobe.fre.FREWrongThreadException;

/**
 * Created by mobitile on 12/5/15.
 */
public class IsSupportedFunction implements FREFunction
{
    @Override
    public FREObject call(FREContext context, FREObject[] args)
    {
        try
        {
            return FREObject.newObject(true);
        }
        catch (FREWrongThreadException e)
        {
            e.printStackTrace();
        }

        return null;
    }
}
