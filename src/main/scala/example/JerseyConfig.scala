package example

import org.glassfish.jersey.server.ResourceConfig
import org.springframework.stereotype.Component

@Component
class JerseyConfig extends ResourceConfig {

  register(classOf[endpoints.DvdApi])

}
