package com.cf.study.jee.cdi;

import java.io.IOException;
import java.io.OutputStream;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cdi")
public class CdiServiceServlet extends HttpServlet {

    private static final long serialVersionUID = 98280205875772978L;

    @Inject
    private RequestScopedCdiBean requestScopedBean;

    @Inject
    private SessionScopedCdiBean sessionScopedBean;

    @Inject
    private ApplicationScopedCdiBean applicationScopedBean;

    @Override
    public void doGet(final HttpServletRequest request, final HttpServletResponse response) {
        response.setContentType("text/html");
        OutputStream os;
        try {
            os = response.getOutputStream();
            os.write("<b>Try open multiple browser window keep refreshing the page</b><br/><br/>".getBytes());
            os.write(("This Servlet: " + this + "<br/>").getBytes());
            os.write((requestScopedBean.print() + " : " + requestScopedBean + "<br/>").getBytes());
            os.write((sessionScopedBean.print() + " : " + sessionScopedBean + "<br/>").getBytes());
            os.write((applicationScopedBean.print() + " : " + applicationScopedBean + "<br/>").getBytes());
            os.write("======<br/>".getBytes());
            os.write(applicationScopedBean.get().getBytes());
            os.close();
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }
}
