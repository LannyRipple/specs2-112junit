package me.ljr.eg

import org.specs2.mutable._
import org.specs2.specification.{Fragments, Step}

class TestExample extends SpecificationWithJUnit with BeforeAfterSpec {
  "My specification" should {
    step {println("before")}

    "ex1" in {
      println("ex1")
      ok
    }

    "ex2" in {
      println("ex2")
      ok
    }

    step {println("after")}
  }
}

trait BeforeAfterSpec extends Specification {

  override
  def map(fs: => Fragments): Fragments = Step { println("doBeforeSpec") } ^ fs ^ Step { println("doAfterSpec") }
}
