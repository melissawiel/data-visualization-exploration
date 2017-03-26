package controllers

import java.text.SimpleDateFormat
import javax.inject._
import play.api._
import play.api.mvc._
import play.api.libs.json.{Json, JsValue}
import play.api.mvc._
import org.joda.time._
import org.joda.time.format._
import scala.concurrent.ExecutionContext.Implicits.global
//import org.json4s.jackson.Serialization.{read, write}

import scala.io.Source

@Singleton
class DataController @Inject()() extends Controller {

  def restaurantCirclePacking = Action {
    val source: String = Source.fromFile("public/data/Restaurant_Circle_Packing.json").getLines.mkString
    val json: JsValue = Json.parse(source)

    Ok(json).as("application/json")
  }

}
