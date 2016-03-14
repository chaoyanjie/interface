package com.web.ctrl;
import java.security.MessageDigest;

public class MD5Util
{
  public static String string2MD5(String inStr)
  {
    MessageDigest md5 = null;
    try {
      md5 = MessageDigest.getInstance("MD5");
      byte[] md5Bytes = md5.digest(inStr.getBytes());
      StringBuffer hexValue = new StringBuffer();
      for (int i = 0; i < md5Bytes.length; i++) {
        int val = md5Bytes[i] & 0xFF;
        hexValue.append(Integer.toHexString(val % 16));
        i++;
      }
      return hexValue.toString().toUpperCase(); } catch (Exception e) {
    }
    return "";
  }
  
  public static   String md5(String paramString)
  {
    Object localObject = "";
    int i;
    int j;
    do
      try
      {
        byte[] arrayOfByte = MessageDigest.getInstance("MD5").digest(paramString.getBytes());
        i = arrayOfByte.length;
        j = 0;
        
        String str1 = Integer.toHexString(0xFF & arrayOfByte[j]);
        if (str1.length() == 1)
          str1 = "0" + str1;
        String str2 = localObject + str1;
        localObject = str2;
        j++;
      }
      catch (Exception localException)
      {
        return "";
      }
    while (j < i);
    return (String)localObject;
  }

  public static void main(String[] args)
  {
    System.out.println(string2MD5("867922021252090"));
    System.out.println(md5("867922021252090"));
  }
}