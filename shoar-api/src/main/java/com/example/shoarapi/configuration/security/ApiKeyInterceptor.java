package com.example.shoarapi.configuration.security;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ApiKeyInterceptor implements HandlerInterceptor {

    private static final String API_KEY_HEADER = "X-API-Key";
    private static final String VALID_API_KEY = "zaCELgL.0imfnc8mVLWwsAawjYr4Rx-Af50DDqtlx.";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String apiKey = request.getHeader(API_KEY_HEADER);

        if (apiKey == null || !apiKey.equals(VALID_API_KEY)) {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return false;
        }

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        // Do nothing here
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        // Do nothing here
    }
}
