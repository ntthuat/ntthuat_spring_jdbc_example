package org.ntthuat.repository;

import org.ntthuat.entity.Book;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

/**
 * Created by: ntthuat
 * $Revision: 1.0 $Date: 2019/08/20 3:31 PM
 * $Log: BookRepository.java
 */
public interface BookRepository
{
  int count();

  int update();

  int save();

  int deleteById(Long id);


  List<Book> findAll();

  List<Book> findByNameAndPrice(String name, BigDecimal price);

  Optional<Book> findById(Long id);

  String getNameById(Long id);
}
