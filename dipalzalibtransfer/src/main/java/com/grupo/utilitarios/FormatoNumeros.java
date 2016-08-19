package com.grupo.utilitarios;

public class FormatoNumeros
{
  public static String putZeroesAtBegin(int number, int nZeroes)
  {
    String result = "";
    String num = String.valueOf(number);
    result = num;
    if (num.length() < nZeroes) {
      for (int n = 0; n < nZeroes - num.length(); ++n) {
        result = "0" + result;
      }
    }
    return result;
  }

  public static String putStrAtBegin(String source, char str, int len)
  {
    String result = "";

    result = source;
    if (source.length() < len) {
      for (int n = 0; n < len - source.length(); ++n) {
        result = String.valueOf(str) + result;
      }
    }
    return result;
  }
  
  
  
}
