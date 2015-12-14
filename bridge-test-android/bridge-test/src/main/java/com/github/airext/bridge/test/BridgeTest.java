package com.github.airext.bridge.test;

import android.util.Log;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;

/**
 * Created by mobitile on 12/5/15.
 */
public class BridgeTest implements FREExtension
{
    //--------------------------------------------------------------------------
    //
    //  Class constants
    //
    //--------------------------------------------------------------------------

    private static final String TAG = BridgeTest.class.getSimpleName();

    //--------------------------------------------------------------------------
    //
    //  Class properties
    //
    //--------------------------------------------------------------------------

    private static FREContext context;

    public static FREContext getContext()
    {
        return context;
    }

    //--------------------------------------------------------------------------
    //
    //  Methods
    //
    //--------------------------------------------------------------------------

    @Override
    public void initialize()
    {
        Log.i(TAG, "initialize()");
    }

    @Override
    public FREContext createContext(String s)
    {
        Log.i(TAG, "createContext()");

        context = new ExtensionContext();

        return context;
    }

    @Override
    public void dispose()
    {
        Log.i(TAG, "dispose()");
    }
}
