package com.bolsadeideas.springboot.app.controllers;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
/*ESTO LO USAMOS PARA LIMPIAR LA SESIONES */
public class SessionInvalidationFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpSession session = httpRequest.getSession(false);


        if(httpRequest.getServletPath().equals("/logout")) {
            if (session != null && !session.isNew()) {
                session.invalidate();
            }
        }

        chain.doFilter(request, response);
    }
    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
