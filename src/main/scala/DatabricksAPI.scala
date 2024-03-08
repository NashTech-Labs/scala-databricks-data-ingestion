package com.nashtech

import com.typesafe.config.ConfigFactory
import scalaj.http.{Http, HttpRequest}
import spray.json._
import spray.json.DefaultJsonProtocol._

import java.time.LocalDateTime

object DatabricksAPI extends App {
  // Load configuration from application.conf
  private val config = ConfigFactory.load()

  // Sample Data
  private val jsonData = List(Map("Name" -> "Pradyuman", "Studio" -> "Scala"), Map("Name" -> "Amit", "Studio" -> "Scala")).toJson.toString

  // Get Databricks configuration
  private val databricksUrl = config.getString("databricks.url")
  private val databricksToken = config.getString("databricks.token")

  private val currentDateTime: LocalDateTime = LocalDateTime.now()

  // Send data to Databricks
  private val response: HttpRequest = Http(databricksUrl + s"dbfs/Data-of-$currentDateTime")
    .header("Content-Type", "application/json")
    .header("Authorization", s"Bearer $databricksToken")

  response.postData(jsonData).asString
}
