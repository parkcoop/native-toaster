
package com.nativetoaster;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNNativeToasterModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNNativeToasterModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @ReactMethod
  public void show(String text) {
    Context context = getReactApplicationContext();
    Toast.makeText(context, text, Toast.LENGTH_LONG).show();
  }

  @Override
  public String getName() {
    return "RNNativeToaster";
  }
}