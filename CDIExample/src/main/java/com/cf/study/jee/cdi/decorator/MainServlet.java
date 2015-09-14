package com.cf.study.jee.cdi.decorator;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/decorator")
public class MainServlet extends HttpServlet {

    private static final long serialVersionUID = 3440669052746505335L;

    @Inject
    Origional bean;

    @Override
    public void doGet(final HttpServletRequest request, final HttpServletResponse response) {
        try {
            response.getOutputStream().write(bean.getString().getBytes());
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }

}
