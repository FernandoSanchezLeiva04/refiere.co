package co.refiere.resources;

import javax.ws.rs.core.Application;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;

import org.junit.Test;

import co.refiere.resources.MyResource;

import static org.junit.Assert.assertEquals;

public class MyResourceTest extends JerseyTest {

  @Override
  protected Application configure() {
    return new ResourceConfig(MyResource.class);
  }

  @Test
  public void testGetIt() {
    final String responseMsg = target().path("myresource").request().get(String.class);
      assertEquals("Hello, Refiere Dev!", responseMsg);
  }
}
