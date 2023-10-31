package com.liuyeshennai.db.client.mini.mapper;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * SelectMapper.
 */
@Repository
@Mapper
public interface SelectMapper {

  /**
   * common select sql.
   */
  List<Map<String, Object>> select(@Param("sql") String sql);

  /**
   * db init.
   */
  void initDb();
}