package fr.mosef.scala.template

import org.apache.spark.sql.{DataFrame, SparkSession}
import fr.mosef.scala.template.reader.Reader
import fr.mosef.scala.template.writer.Writer

object Main extends App {
  val sparkSession = SparkSession
    .builder
    .master("local[1]")
    .enableHiveSupport()
    .getOrCreate()

  val reader = new Reader(sparkSession)
  val writer = new Writer()
  //val processor = new Processor()
  val src_path = ""
  val dst_path = "./target/output-writer"

  val dfA : DataFrame = reader.read()
  //processor.exec(method).run
  //writer.write(dfA).path().mode().
  writer.write(dfA, "overwrite", dst_path)
}