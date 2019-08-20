package org.ntthuat.repository;

import lombok.RequiredArgsConstructor;
import org.ntthuat.entity.Book;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

/**
 * Created by: ntthuat
 * $Revision: 1.0 $Date: 2019/08/20 4:00 PM
 * $Log: BookRepositoryImpl.java
 */
@Repository
@RequiredArgsConstructor
public class BookRepositoryImpl implements BookRepository
{

  private final JdbcTemplate jdbcTemplate;

  @Override
  public int count()
  {
    return jdbcTemplate
        .queryForObject("SELECT count(1) FROM books", Integer.class);
  }

  @Override
  public int update()
  {
    return 0;
  }

  @Override
  public int save()
  {
    return 0;
  }

  @Override
  public int deleteById(Long id)
  {
    return 0;
  }

  @Override
  public List<Book> findAll()
  {
    return null;
  }

  @Override
  public List<Book> findByNameAndPrice(String name, BigDecimal price)
  {
    return null;
  }

  @Override
  public Optional<Book> findById(Long id)
  {
    return Optional.empty();
  }

  @Override
  public String getNameById(Long id)
  {
    return null;
  }
}
