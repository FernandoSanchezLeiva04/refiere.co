package co.refiere.heroku;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

import co.refiere.dao.ReferencesCodesDao;

/**
 * This class launches the web application in an embedded Jetty container. This is the entry point to your application. The Java
 * command that is used for launching should fire this main method.
 */
public class Main {

    public static void main(String[] args) throws Exception{
        // The port that we should run on can be set into an environment variable
        // Look for that variable and default to 8080 if it isn't there.
       ReferencesCodesDao asd = new ReferencesCodesDao();
       System.out.println(asd.findAll().size());
    }
}
