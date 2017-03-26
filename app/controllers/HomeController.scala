package controllers

import javax.inject._
import play.api._
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject() extends Controller {

  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def about = Action {
    Ok(views.html.about())
  }

  def resume = Action {
    Ok(views.html.resume())
  }

  def contact = Action {
    Ok(views.html.contact())
  }

  def restaurantCirclePacking = Action {
    Ok(views.html.restaurantCirclePacking())
  }

  def test = Action {
    Ok(views.html.test())
  }

}
