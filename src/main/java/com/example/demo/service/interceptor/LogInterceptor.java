//package com.example.demo.service.interceptor;
//
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.web.servlet.ModelAndView;
//
//public class LogInterceptor extends HandlerInterceptorAdapter {
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object Handler) throws Exception {
//        System.out.println("\n------LogInterceprion.preHandle----");
//        System.out.println("Request URL:" + request.getRequestURL());
//        System.out.println("Start Time:" + System.currentTimeMillis());
//        return true;
//    }
//
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//        System.out.println("\n------LogInterceprion.preHandle----");
//        System.out.println("Request URL:" + request.getRequestURL());
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//        System.out.println("\n------LogInterceprion.preHandle----");
//        long startTime = (long) request.getAttribute("startTime");
//        long endTime = System.currentTimeMillis();
//        System.out.println("Request URL" + request.getRequestURL());
//        System.out.println("End Time:" + endTime);
//        System.out.println("Time taken:" + (endTime - startTime));
//    }
//}
