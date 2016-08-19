package com.grupo.utilitarios;

public class MathUtil
{
  public static int round(float value)
  {
    int r = (int)value;
    float d = value - r;
    if (d >= 0.5D) {
      ++r;
    }
    return r;
  }
}
