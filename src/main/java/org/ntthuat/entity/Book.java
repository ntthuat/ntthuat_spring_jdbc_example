package org.ntthuat.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by: ntthuat
 * $Revision: 1.0 $Date: 2019/08/20 3:58 PM
 * $Log: Book.java
 */
@Data
public class Book
{
  private Long id;
  private String name;
  private BigDecimal price;
}
