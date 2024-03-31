package fr.mosef.scala.template.writer

import org.apache.spark.sql.{DataFrame, DataFrameWriter, Row}
class Writer {

  def write(df: DataFrame, mode: String = "overwrite", path: String): Unit = {
    df
      .write
      .mode(mode)
      .csv(path)
  }

}
