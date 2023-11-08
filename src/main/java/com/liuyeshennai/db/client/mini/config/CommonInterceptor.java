package com.liuyeshennai.db.client.mini.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * Interceptor.
 */
@Slf4j
@Component
public class CommonInterceptor implements HandlerInterceptor {

  /**
   * easy auth.
   */
  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
      throws Exception {
    String token = request.getHeader("Authorization");
    return StringUtils.hasLength(token) && "Bearer 123456".equals(token);
  }

  @Override
  public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
      Object handler, @Nullable Exception ex) throws Exception {
  }
}
