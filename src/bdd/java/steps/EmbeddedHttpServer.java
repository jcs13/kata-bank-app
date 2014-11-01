package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.glassfish.grizzly.http.server.HttpServer;

import static net.diegolemos.Main.startServer;

public class EmbeddedHttpServer {

    private HttpServer server;

    @Before
    public void setUp() throws Exception {
        server = startServer();
    }

    @After
    public void tearDown() throws Exception {
        server.stop();
    }
}
