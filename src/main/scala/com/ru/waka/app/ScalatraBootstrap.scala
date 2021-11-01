package com.ru.waka.app

import javax.servlet.ServletContext
import org.scalatra._
import com.ru.waka.app.controllers.UsersController

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    context.mount(new UsersController, "/*")
  }
}