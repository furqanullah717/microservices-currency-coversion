package com.fk.training.zuulgateway.components;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

public class ZuulLoggingFilter extends ZuulFilter
{
  Logger logger =  LoggerFactory.getLogger(ZuulLoggingFilter.class);
  @Override
  public String filterType()
  {
    return "pre";
  }

  @Override
  public int filterOrder()
  {
    return 0;
  }

  @Override
  public boolean shouldFilter()
  {
    return true;
  }

  @Override
  public Object run() throws ZuulException
  {
    HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
    logger.debug("Request:  "+ request.getRequestURI());
    return null;
  }
}
