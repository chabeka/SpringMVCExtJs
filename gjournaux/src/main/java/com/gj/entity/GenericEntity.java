package com.gj.entity;

import java.io.Serializable;

@SuppressWarnings({ "DeserializableClassInSecureContext" })
public interface GenericEntity <I extends Serializable> extends Serializable
{
  public I getId();
}
