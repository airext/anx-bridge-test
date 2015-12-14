package com.github.airext.bridge.test.data;

import com.adobe.fre.FREInvalidObjectException;
import com.adobe.fre.FREObject;
import com.adobe.fre.FRETypeMismatchException;
import com.adobe.fre.FREWrongThreadException;
import com.github.airext.bridge.CallResultValue;

/**
 * Created by mobitile on 12/11/15.
 */
public class BridgeTestResultValue implements CallResultValue
{
    public BridgeTestResultValue(String value)
    {
        this.value = value;
    }

    private String value;

    @Override
    public FREObject toFREObject() throws FRETypeMismatchException, FREInvalidObjectException, FREWrongThreadException, IllegalStateException
    {
        return FREObject.newObject(value);
    }
}
