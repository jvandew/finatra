package com.twitter.finatra.http.tests.integration.messagebody.main

import com.twitter.finatra.http.HttpServer
import com.twitter.finatra.http.routing.HttpRouter
import com.twitter.finatra.http.tests.integration.messagebody.main.controllers.GreetingController
import com.twitter.finatra.http.tests.integration.messagebody.main.domain.GreetingMessageBodyWriter

object GreetingServerMain extends GreetingServer

class GreetingServer extends HttpServer {

  override def configureHttp(router: HttpRouter): Unit = {
    router
      .register[GreetingMessageBodyWriter]
      .add[GreetingController]
  }
}
