package controllers

import controllers.io.SearchResult
import play.api._
import play.api.libs.json.Json
import play.api.mvc._

class Application extends Controller {

  def index = Action {
    Ok(views.html.index())
  }

  def search = Action {
    val dummy = SearchResult.empty
    Ok(Json.toJson(dummy))
  }

}
