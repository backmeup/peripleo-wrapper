package controllers.io

import play.api.libs.json._
import play.api.libs.json.Reads._
import play.api.libs.functional.syntax._

class SearchResult(val total: Int, val items: Seq[SearchResultItem])

case class SearchResultItem(identifier: String, title: String, geoBounds: GeoBounds)

case class GeoBounds(minLon: Double, minLat: Double, maxLon: Double, maxLat: Double)

object SearchResult {

  def apply(total: Int, items: Seq[SearchResultItem]) = new SearchResult(total, items)

  lazy val empty = new SearchResult(0, Seq.empty[SearchResultItem])

  implicit val SearchResultWrites: Writes[SearchResult] = (
    (JsPath \ "total").write[Int] ~
    (JsPath \ "facets").write[Seq[String]] ~
    (JsPath \ "top_places").write[Seq[String]] ~
    (JsPath \ "items").write[Seq[SearchResultItem]]
  )(result => (
    result.total,
    Seq.empty[String], // No facets in THEMIS, but Peripleo expects the fields to be there
    Seq.empty[String], // No top places in THEMIS, but Peripleo expects the fields to be there
    result.items
  ))

  implicit val SearchResultItemWrites: Writes[SearchResultItem] = (
    (JsPath \ "identifier").write[String] ~
    (JsPath \ "title").write[String]
  )(item => (
    item.identifier,
    item.title
  ))

}
