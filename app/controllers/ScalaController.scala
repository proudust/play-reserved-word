package controllers

import play.api.mvc._

import javax.inject._

@Singleton
class ScalaController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  def `def` = Action {
    Redirect(controllers.routes.HomeController.index())
  }

  def `forSome` = Action {
    Redirect(controllers.routes.HomeController.index())
  }

  def `implicit` = Action {
    Redirect(controllers.routes.HomeController.index())
  }

  def `lazy` = Action {
    Redirect(controllers.routes.HomeController.index())
  }

  def `match` = Action {
    Redirect(controllers.routes.HomeController.index())
  }

  def `object` = Action {
    Redirect(controllers.routes.HomeController.index())
  }

  def `override` = Action {
    Redirect(controllers.routes.HomeController.index())
  }

  def `sealed` = Action {
    Redirect(controllers.routes.HomeController.index())
  }

  def `trait` = Action {
    Redirect(controllers.routes.HomeController.index())
  }

  def `type` = Action {
    Redirect(controllers.routes.HomeController.index())
  }

  def `val` = Action {
    Redirect(controllers.routes.HomeController.index())
  }

  def `var` = Action {
    Redirect(controllers.routes.HomeController.index())
  }

  def `with` = Action {
    Redirect(controllers.routes.HomeController.index())
  }

  def `yield` = Action {
    Redirect(controllers.routes.HomeController.index())
  }

  def `export` = Action {
    Redirect(controllers.routes.HomeController.index())
  }
}
