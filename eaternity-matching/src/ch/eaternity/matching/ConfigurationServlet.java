package ch.eaternity.matching;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class ConfigurationServlet extends HttpServlet {
	
	private static final Logger Log = Logger.getLogger(MatcherServlet.class.getName());
	
	// Here probably the configuration of the Matcher can go here...
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {

		String nGramSize = req.getParameter("ngram");
		
		
	}
	
}
