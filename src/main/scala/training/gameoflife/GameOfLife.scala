package com.fabernovel.training.gameoflife

object GameOfLife {

  def start(size: Int) {
    val initialWorld = World(size)
    //val game = GameOfLife(BasicRules)

    val evts: Events[World] = ???

    Ui.show(evts.map(_.image))
  }

  def apply(r: Rules): GameOfLife = new GameOfLife {
    val rules = r
  } 
}

trait GameOfLife {
  val rules: Rules
  def next(world: World): World = ???
}
