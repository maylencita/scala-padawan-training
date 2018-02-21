package com.fabernovel.training.gameoflife

import doodle.core._

case class Cell(isAlive: Boolean)

class World(cells: Seq[Seq[Cell]]){
  def image: Image = ???  
}

object World {
  def apply(size: Int): World = ???
  def apply(cells: Seq[Seq[Cell]]): World = ???
}