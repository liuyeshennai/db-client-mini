package com.liuyeshennai.db.client.mini.controller;

import com.liuyeshennai.db.client.mini.mapper.SelectMapper;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * select controller.
 */
@Controller
@RequestMapping()
@Slf4j
public class SelectController {

  private final SelectMapper mapper;

  @Autowired
  public SelectController(SelectMapper mapper) {
    this.mapper = mapper;
  }

  /**
   * db select page.
   */
  @GetMapping("")
  public String selectPage() {
    return "select";
  }

  /**
   * db select api.
   */
  @ResponseBody
  @PostMapping("/select")
  public List<Map<String, Object>> select(@RequestBody Map<String, String> dto) {
    dto.get("");
    return mapper.select(dto.get("sql"));
  }

  /**
   * init h2 db.
   */
  @PostConstruct
  public void init() {
    log.info("db init begin");
    mapper.initDb();
    log.info("db init end");
  }
}
