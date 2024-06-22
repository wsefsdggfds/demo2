//package com.example.demo.service.interceptorUser;
//
//import com.example.demo.service.interceptor.HandlerInterceptorAdapter;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.web.servlet.ModelAndView;
//
//public class OldLoginInterceptor extends HandlerInterceptorAdapter {
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handler)throws Exception{
//        System.out.println("\n-------OldLoginInterceptor.preHandle---");
//        System.out.println("Request URL:"+request.getRequestURL());
//        System.out.println("Seorry");
//        return true;
//    }
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)throws Exception{
//        System.out.println("\n------OldLoginInterceptor.postHandle---");
//    }
//    @Override
//    public void afterCompletion(HttpServletRequest request,HttpServletResponse response,Object handler,Exception ex)throws Exception{
//        System.out.println("\n-----OldLoginInterceptor.afterCompletion---");
//    }
//}
