package edu.knoldus
import org.scalatest.flatspec.AnyFlatSpec
import java.nio.file.FileSystems
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.Success

class FutureTest extends AnyFlatSpec {
  val obj = new ContentInDir
  "result" should "return if path" in {
    assert(obj.file("./s") == List("path is not valid"))
  }

  "result" should "return if path" in {
    assert(obj.file("./src") == Future(Success(Success(List()))))
  }
}


