package fr.mosef.scala.template.reader

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.DataFrame
class Reader(sparkSession: SparkSession) {

  def read(): DataFrame = {
    sparkSession.sql("SELECT 'A'")
  }



}
