package cw_two
import com.softwaremill.macwire._

object Factory {
  def getInstance(c: Class[_], b: Boolean): Game = {
    if(b) {
      return wire[EasyGameImpl]
    }
    else {
      return wire[HardGameImpl]
    }

  }
}