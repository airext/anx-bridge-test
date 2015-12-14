/**
 * Created by mobitile on 12/5/15.
 */
package com.github.airext.bridge.test {
import com.github.airext.bridge.test.core.bridge_test;

import flash.external.ExtensionContext;
import flash.filesystem.File;
import flash.filesystem.FileMode;
import flash.filesystem.FileStream;
import flash.system.Capabilities;

use namespace bridge_test;

public class BridgeTest
{
    //--------------------------------------------------------------------------
    //
    //  Class constants
    //
    //--------------------------------------------------------------------------

    //--------------------------------------------------------------------------
    //
    //  Class properties
    //
    //--------------------------------------------------------------------------

    bridge_test static function get context():ExtensionContext
    {
        return null;
    }

    //--------------------------------------------------------------------------
    //
    //  Class methods
    //
    //--------------------------------------------------------------------------

    //-------------------------------------
    //  isSupported
    //-------------------------------------

    /**
     * Indicates if extension is supported on current platform.
     */
    public static function isSupported():Boolean
    {
        return false;
    }

    //-------------------------------------
    //  extensionVersion
    //-------------------------------------

    /**
     * Returns version of extension
     * @return extension version
     */
    public static function extensionVersion():String
    {
        trace("BridgeTest is not supported on" + Capabilities.os);

        return null;
    }

    //-------------------------------------
    //  testResult
    //-------------------------------------

    public function testResult(callback:Function):void
    {
    }

    //-------------------------------------
    //  testError
    //-------------------------------------

    public function testError(callback:Function):void
    {
    }

    //--------------------------------------------------------------------------
    //
    //  Constructor
    //
    //--------------------------------------------------------------------------

    public function BridgeTest()
    {
    }
}
}
