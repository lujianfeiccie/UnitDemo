package com.example.unitdemo;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Log;

public class OtherTool
{
  public static int DipToPixels(Context paramContext, int paramInt)
  {
    return (int)(0.5F + paramContext.getResources().getDisplayMetrics().density * paramInt);
  }
  public static int PixelsToDip(Context paramContext, int paramInt)
  {
    return (int)( (paramInt-0.5F) /paramContext.getResources().getDisplayMetrics().density);
  }
  public static int px2sp(Context paramContext,float pxValue) {
	  float fontScale = paramContext.getResources().getDisplayMetrics().density;
	  return (int) (pxValue / fontScale + 0.5f);
  }
  public static int sp2px(Context paramContext,float spValue) {
	  float fontScale = paramContext.getResources().getDisplayMetrics().density;
	  return (int) (spValue * fontScale + 0.5f);
	 }
  public static int convertPxOrDip(float paramFloat, int paramInt)
  {
    float f = paramInt / paramFloat;
    if (paramInt >= 0);
    for (int i = 1; ; i = -1)
      return (int)(f + 0.5F * i);
  }
  

  public static Bitmap drawableToBitmap(Drawable paramDrawable)
  {
    int i = paramDrawable.getIntrinsicWidth();
    int j = paramDrawable.getIntrinsicHeight();
    if (paramDrawable.getOpacity() != -1);
    for (Bitmap.Config localConfig = Bitmap.Config.ARGB_8888; ; localConfig = Bitmap.Config.RGB_565)
    {
      Bitmap localBitmap = Bitmap.createBitmap(i, j, localConfig);
      Canvas localCanvas = new Canvas(localBitmap);
      paramDrawable.setBounds(0, 0, paramDrawable.getIntrinsicWidth(), paramDrawable.getIntrinsicHeight());
      paramDrawable.draw(localCanvas);
      return localBitmap;
    }
  }
  /**  
  * 返回当前程序版本名  
  */   
  public static String getAppVersionName(Context context) {   
      String versionName = "";   
      try {   
          // ---get the package info---   
          PackageManager pm = context.getPackageManager();   
          PackageInfo pi = pm.getPackageInfo(context.getPackageName(), 0);   
          versionName = pi.versionName;   
          if (versionName == null || versionName.length() <= 0) {   
              return "";   
          }   
      } catch (Exception e) {   
          Log.e("VersionInfo", "Exception", e);   
      }   
      return versionName;   
  }  
}
