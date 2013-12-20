package ch.eaternity.matching;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.*;

import com.google.appengine.api.log.LogService.LogLevel;


@SuppressWarnings("serial")
public class MatcherServlet extends HttpServlet {
	
	private static final Logger Log = Logger.getLogger(MatcherServlet.class.getName());
	
	// Unix Shell to execute a request:
	// curl -X GET http://test.eaternitymatch.appspot.com/matcher?ingredient=blumenkohl&param2=param2 u.s.w.
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		String ingredientName = req.getParameter("ingredient");

		//TODO the matching comes in here
		
		// You can do normal logging here
		Log.log(Level.FINE, "This is a testing Log");
		
		resp.getWriter().print("Ingredient " + ingredientName + " matched to following eaternity item: "); //print result here
	}
	
}
