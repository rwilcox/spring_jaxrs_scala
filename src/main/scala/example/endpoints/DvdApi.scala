package example.endpoints

import javax.ws.rs.{GET, Path}

import org.springframework.stereotype.Component

@Component
@Path("/dvds")
class DvdApi {

  @GET
  def testEndpoint() : String = {
    "Hello!"
  }
}
