package com.github.airext.bridge.test.data;

import com.adobe.fre.FREInvalidObjectException;
import com.adobe.fre.FREObject;
import com.adobe.fre.FRETypeMismatchException;
import com.adobe.fre.FREWrongThreadException;
import com.github.airext.bridge.CallResultValue;

/**
 * Created by mobitile on 12/11/15.
 */
public class TestValueObject implements CallResultValue
{
    public TestValueObject(String value)
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
