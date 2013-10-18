package org.superbiz.demo.sirona;

import javax.inject.Inject;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

@WebServlet(urlPatterns = "/servlet")
public class AServlet extends HttpServlet {
    @Inject
    private AnEjb bean;

    @Override
    public void init(final ServletConfig config) throws ServletException {
        super.init(config);

        String contextPath = config.getServletContext().getContextPath();
        if ("/".equals(contextPath)) {
            contextPath = "";
        }
        Logger.getLogger(AServlet.class.getName()).info("AServlet deployed on >> GET http://localhost:8080" + contextPath + "/servlet");
    }

    @Override
    protected void service(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");
        resp.setStatus(200);
        resp.getWriter().write("Servlet!");

        bean.findOne();
    }
}
