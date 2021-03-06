package org.superbiz.demo.sirona;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Random;

@WebServlet(urlPatterns = "/tmp-session")
public class CreateDestroySession extends HttpServlet {
    @Override
    protected void service(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        final HttpSession session = req.getSession(true);
        resp.getWriter().write(session.getId());
        try {
            Thread.sleep(new Random().nextInt(500));
        } catch (final InterruptedException e) {
            // no-op
        }
        session.invalidate();
    }
}
